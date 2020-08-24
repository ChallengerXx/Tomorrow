package com.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.text.SimpleDateFormat;

@Slf4j
public class JacksonUtils {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    static {
        //设置时间格式
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS"));
        //自动去除为NULL的字段
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //忽略json字符串和实体不对应的属性
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    public static ObjectMapper getObjectMapper() {
        return JacksonUtils.objectMapper;
    }

    /**
     * json 反序列化 简单对象
     * @param json
     * @param valueType
     * @param <T>
     * @return
     */
    public static <T> T jsonToObject(String json, Class<T> valueType) {
        try {
            if (StringUtils.isNotBlank(json)) {
                return objectMapper.readValue(json, valueType);
            }
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return null;
    }

    /**
     * json 反序列化 复杂对象
     * 例如：JacksonUtils.JacksonUtils(json, new TypeReference<HashMap<String, bean>>(){})
     * @param json
     * @param typeReference
     * @param <T>
     * @return
     */
    public static <T> T JacksonUtils(String json, TypeReference<T> typeReference){
        try {
            if (StringUtils.isNotBlank(json)) {
                return objectMapper.readValue(json, typeReference);
            }
        } catch (IOException e){
            log.warn(e.getMessage());
        }
        return null;
    }

    /**
     * Object 转 json
     * @param o
     * @return
     */
    public static String ObjectToJson(Object o) {
        if (o == null) {
            return null;
        }
        try {
            return objectMapper.writeValueAsString(o);
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return null;
    }
}
