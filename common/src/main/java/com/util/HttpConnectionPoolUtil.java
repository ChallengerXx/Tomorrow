package com.util;

import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HttpConnectionPoolUtil {

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(HttpConnectionPoolUtil.class);
    /** 设置连接建立的超时时间为10s */
    private static final int CONNECT_TIMEOUT = 10000;
    /**  */
    private static final int SOCKET_TIMEOUT = 5000;
    /** 最大连接数 */
    private static final int MAX_CONN = 400;
    /** 路由最大连接数 */
    private static final int MAX_PRE_ROUTE = 200;
    /**  */
    private static final int MAX_ROUTE = 200;
    /** 发送请求的客户端单例 */
    private volatile static CloseableHttpClient httpClient;
    /**  */
    private static PoolingHttpClientConnectionManager manager;
    /**  */
    private volatile static ScheduledExecutorService monitorExecutor;

    private static RequestConfig requestConfig;
    /**  */
    private final static Object SYNC_CLINET_LOCK = new Object();
    /**  */
    private final static Object SYNC_MONITOR_LOCK = new Object();

    private final static String HOST_NAME_SPLIT = "/";

    private final static String CONTAIN_PORT = ":";

    static {
        requestConfig = RequestConfig.custom().setConnectionRequestTimeout(CONNECT_TIMEOUT)
                .setConnectTimeout(CONNECT_TIMEOUT)
                .setSocketTimeout(SOCKET_TIMEOUT).build();

        ConnectionSocketFactory plainSocketFactory = PlainConnectionSocketFactory.getSocketFactory();
        LayeredConnectionSocketFactory sslSocketFactory = SSLConnectionSocketFactory.getSocketFactory();
        Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory> create().register("http", plainSocketFactory)
                .register("https", sslSocketFactory).build();

        manager = new PoolingHttpClientConnectionManager(registry);
        // 最大连接数
        manager.setMaxTotal(MAX_CONN);
        // 路由最大连接数
        manager.setDefaultMaxPerRoute(MAX_PRE_ROUTE);
    }

    /**
     * GET请求URL获取内容
     * @param url
     * @param headers
     * @return
     */
    public static String get(String url, Map<String, String> headers){
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        if (!CollectionUtils.isEmpty(headers)){
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpGet.setHeader(entry.getKey(), entry.getValue());
            }
        }
        String result = sendRequest(httpGet, url);
        return result;
    }

    /**
     * POST请求URL获取内容
     * @param url
     * @param headers
     * @return
     */
    public static String post(String url, Map<String, Object> params, Map<String, String> headers) throws IOException {
        HttpPost httppost = new HttpPost(url);
        httppost.setConfig(requestConfig);
        if (!CollectionUtils.isEmpty(headers)){
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httppost.setHeader(entry.getKey(), entry.getValue());
            }
        }
        setPostParams(httppost, params);
        String result = sendRequest(httppost, url);
        return result;
    }

    /**
     * 发送请求
     * @param request
     * @param url
     * @return
     */
    private static String sendRequest(HttpRequestBase request, String url){
        CloseableHttpResponse response = null;
        try {
            response = getHttpClient(url).execute(request, HttpClientContext.create());
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity, Charset.forName("utf-8"));
            EntityUtils.consume(entity);
            return result;
        } catch (ClientProtocolException e) {
            logger.error("ClientProtocolException");
        } catch (IOException e) {
            logger.error("IOException");
        } finally {
            try {
                if (response != null){
                    response.close();
                }
            } catch (IOException e) {
                logger.error("IOException");
            }
        }
        return null;
    }

    /**
     * 设置POST请求参数
     * @param httpPost
     * @param params
     */
    private static void setPostParams(HttpPost httpPost, Map<String, Object> params) {
        List<NameValuePair> nameValuePairs = new ArrayList<>();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
        }
        httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, Charset.forName("utf-8")));
    }


    /**
     * 根据url获取httpClient对象
     * @param url
     * @return
     */
    public static CloseableHttpClient getHttpClient(String url){
        String hostName = url.split(HOST_NAME_SPLIT)[2];
        System.out.println(hostName);
        int port = 80;
        if (hostName.contains(CONTAIN_PORT)){
            String[] args = hostName.split(CONTAIN_PORT);
            hostName = args[0];
            port = Integer.parseInt(args[1]);
        }

        if (httpClient == null){
            //多线程下多个线程同时调用getHttpClient容易导致重复创建httpClient对象的问题,所以加上了同步锁
            synchronized (SYNC_CLINET_LOCK){
                if (httpClient == null){
                    httpClient = createHttpClient(hostName, port);
                    //开启监控线程,对异常和空闲线程进行关闭
                    openMonitorThread();
                }
            }
        }
        return httpClient;
    }

    /**
     * 开启清理线程
     */
    private static void openMonitorThread(){
        if (monitorExecutor == null){
            synchronized (SYNC_MONITOR_LOCK){
                if (monitorExecutor == null){
                    monitorExecutor = Executors.newScheduledThreadPool(1);
                    monitorExecutor.scheduleAtFixedRate(new TimerTask() {
                        @Override
                        public void run() {
                            //关闭异常连接
                            manager.closeExpiredConnections();
                            //关闭5s空闲的连接
                            manager.closeIdleConnections(5000, TimeUnit.MILLISECONDS);
                            logger.info("close expired and idle for over 5s connection");
                        }
                    }, 5000, 5000, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /**
     * 根据host和port构建httpclient实例
     * @param host
     * @param port
     * @return
     */
    private static CloseableHttpClient createHttpClient(String host, int port){
        HttpHost httpHost = new HttpHost(host, port);
        manager.setMaxPerRoute(new HttpRoute(httpHost), MAX_ROUTE);

        //请求失败时,进行请求重试
        HttpRequestRetryHandler handler = new HttpRequestRetryHandler() {
            @Override
            public boolean retryRequest(IOException e, int i, HttpContext httpContext) {
                if (i > 3){
                    //重试超过3次,放弃请求
                    logger.error("retry has more than 3 time, give up request");
                    return false;
                }
                if (e instanceof NoHttpResponseException){
                    //服务器没有响应,可能是服务器断开了连接,应该重试
                    logger.error("receive no response from server, retry");
                    return true;
                }
                if (e instanceof SSLHandshakeException){
                    // SSL握手异常
                    logger.error("SSL hand shake exception");
                    return false;
                }
                if (e instanceof InterruptedIOException){
                    //超时
                    logger.error("InterruptedIOException");
                    return false;
                }
                if (e instanceof UnknownHostException){
                    // 服务器不可达
                    logger.error("server host unknown");
                    return false;
                }
                if (e instanceof ConnectTimeoutException){
                    // 连接超时
                    logger.error("Connection Time out");
                    return false;
                }
                if (e instanceof SSLException){
                    logger.error("SSLException");
                    return false;
                }

                HttpClientContext context = HttpClientContext.adapt(httpContext);
                HttpRequest request = context.getRequest();
                if (!(request instanceof HttpEntityEnclosingRequest)){
                    //如果请求不是关闭连接的请求
                    return true;
                }
                return false;
            }
        };
        CloseableHttpClient client = HttpClients.custom().setConnectionManager(manager).setRetryHandler(handler).build();
        return client;
    }



}
