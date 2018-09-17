package com.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * RestTemplate工具类
 */
@Slf4j
public class RestTemplateUtil {

    @Autowired
    @Qualifier
    private RestTemplate restTemplate;

    /**
     * post请求，按对象返回
     * @param url
     * @param reqParam
     * @param classType
     * @param <T>
     * @return
     */
    public <T> T post(String url, Map<String, String> reqParam, T classType) {
        try {
            log.info("post请求开始 -->请求地址:{}", url);
            long start = System.currentTimeMillis();
            reqParam.forEach((key, val) -> {
                log.info("请求参数,key -->{},value -->{}", key, val);
            });
            T resp = (T) restTemplate.postForObject(url, reqParam, classType.getClass());
            log.info("请求完成,耗时 -->{}", System.currentTimeMillis() - start);
            return resp;
        } catch (Exception e) {
            log.error("请求异常 -->{}", e);
            return null;
        }
    }

    /**
     * post请求，返回字符串
     * @param url
     * @param reqParam
     * @return
     */
    public String post(String url, Map<String, String> reqParam) {
        try{
            log.info("post请求开始 -->请求地址:{}", url);
            long start = System.currentTimeMillis();
            reqParam.forEach((key, val) -> {
                log.info("请求参数,key -->{},value -->{}", key, val);
            });
            ResponseEntity<String> resp = restTemplate.postForEntity(url, reqParam, String.class);
            log.info("请求完成,耗时 -->{},返回狀態碼:{},返回信息->{}", System.currentTimeMillis() - start,
                    resp.getStatusCodeValue(),resp.getBody());
            if (resp.getStatusCodeValue()==200)
                return resp.getBody();
            return null;
        }catch (Exception e){
            log.error("请求异常 -->{}", e);
            return null;
        }
    }

    public <T> T get(String url, T classType) {
        try {
            long start = System.currentTimeMillis();
            log.info("{}请求开始，url地址{}，参数信息：{}", "get", url);

            @SuppressWarnings("unchecked")
            T resp = (T) restTemplate.getForObject(url, classType.getClass());
            log.info("请求完成，耗时{}ms", System.currentTimeMillis()-start);
            return resp;
        } catch(Exception e) {
            log.error("请求异常", e);
            return null;
        }
    }

    public String get(String url) {
        try {
            long start = System.currentTimeMillis();
            log.info("{}请求开始，url地址{}，参数信息：{}", "get", url);

            String resp =  restTemplate.getForObject(url, String.class);
            // 取消返回日志打印 返回数据量大导致写日志太多 效率低下
            log.info("请求完成，耗时{}ms", System.currentTimeMillis()-start);
            return resp;
        } catch(Exception e) {
            log.error("请求异常", e);
            return null;
        }
    }

    /**
     * json post请求并返回
     * @param url
     * @param json
     * @param className
     * @return
     * @throws Exception
     */
    public <T extends Object> T jsonPost(String url, String json, Class<T> className) throws Exception {
        long start = System.currentTimeMillis();
        log.info("{}请求开始，url地址{}，参数信息：{}", "post", url, json);
        MultiValueMap<String, String> requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", "application/json");

        HttpEntity<String> requestEntity = new HttpEntity<String>(json, requestHeaders);
        ResponseEntity<T> resp = restTemplate.exchange(url, HttpMethod.POST, requestEntity, className);
        T resu = null;
        if (resp!=null && resp.getStatusCode().is2xxSuccessful()) {
            resu = resp.getBody();
            log.info("请求完成，耗时{}ms", System.currentTimeMillis()-start);
            return resu;
        } else {
            if (resp==null) {
                log.error("http resp null");
                throw new Exception("http resp null");
            } else {
                log.error("http status错误:{}",resp.getStatusCodeValue());
                throw new Exception("http resp status is error->:{}"+ resp.getStatusCodeValue());
            }
        }
    }
}
