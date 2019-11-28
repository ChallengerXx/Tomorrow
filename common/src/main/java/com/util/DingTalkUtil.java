package com.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DingTalkUtil {

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(HttpConnectionPoolUtil.class);

    private final static String SECRET = "SEC69534981bdd75c0e989eb2ce18fde1ed707ed189749a16461495d40c00bb2ae7";

    private final static String WEB_HOOK = "https://oapi.dingtalk.com/robot/send?access_token=8cb7f0bf7bf199981a4fd24ee99dea2667c8a3d67401b4ee68eb34add0b8dfd6";

    /**
     * 发送 text类型 钉钉消息
     * @param content
     * @param atAll
     * @param atMobiles
     */
    public static void senTextDingTalk(String content, Boolean atAll, List<String> atMobiles){
        String url = getDingTalkRequestUrl(WEB_HOOK, SECRET);
        TextDingTalk talk = new TextDingTalk(content, atAll, atMobiles);
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type","application/json; charset=utf-8");
        StringEntity se = new StringEntity(talk.toJsonString(), Charset.forName("utf-8"));
        httpPost.setEntity(se);
        HttpResponse response = null;
        try {
            response = httpclient.execute(httpPost);
            if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
                String result= EntityUtils.toString(response.getEntity(), Charset.forName("utf-8"));
                logger.info("dingTalk result:", result);
            }
        } catch (Exception e) {
            logger.error("Exception", e);
        }
    }

    /**
     * 获取发送钉钉请求url
     * @param webHook
     * @param secret
     * @return
     */
    private static String getDingTalkRequestUrl(String webHook, String secret){
        String url = webHook + "&timestamp={timeStamp}&sign={sign}";
        Map<String, String> signResult = getSecretSign(secret);
        url = url.replace("{timeStamp}", signResult.get("timeStamp")).replace("{sign}", signResult.get("sign"));
        return url;
    }

    /**
     * 根据WEB_HOOK的secret加密sign
     * @param secret
     * @return
     */
    private static Map<String, String> getSecretSign(String secret){
        Map<String, String> result = new HashMap<>(2);
        String secretSign = null;
        Long timeStamp = System.currentTimeMillis();
        String stringToSign = timeStamp + "\n" + secret;
        Mac mac = null;
        try {
            mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
            byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
            secretSign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
            result.put("timeStamp", timeStamp.toString());
            result.put("sign", secretSign);
        } catch (NoSuchAlgorithmException e) {
            logger.error("NoSuchAlgorithmException", e);
        } catch (InvalidKeyException e) {
            logger.error("InvalidKeyException", e);
        } catch (UnsupportedEncodingException e) {
            logger.error("UnsupportedEncodingException", e);
        }
        return result;
    }

    static class BaseDingTalk{
        protected String msgtype;

        public String getMsgtype() {
            return msgtype;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }

        public String toJsonString(){
            return JSONObject.toJSONString(this);
        }
    }

    static class TextDingTalk extends BaseDingTalk{
        private Map<String, String> text;
        private Map<String, Object> at;

        public TextDingTalk(String content, Boolean atAll, List<String> atMobiles) {
            msgtype = "text";
            text = new HashMap<>(1);
            at = new HashMap<>(2);

            text.put("content", content);
            at.put("isAtAll",atAll);
            at.put("atMobiles",atMobiles);
        }

        public Map<String, String> getText() {
            return text;
        }

        public Map<String, Object> getAt() {
            return at;
        }
    }
}
