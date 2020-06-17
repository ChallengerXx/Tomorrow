package com.template;


import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ExternalServiceTemplate {


    public static <T>T execute(ServiceExecutor<T> executor, String system, String desc, Object... params){
        log.info("调用系统:{}, 请求接口描述:{}, 请求参数:{}", system, desc, params);
        T result = null;
        try {
            result = executor.serviceExecute();
            log.info("调用系统:{}成功, 请求接口描述:{},  返回值response={}", system, desc, result);
        } catch (Exception e){
            log.info("调用系统:{}失败, 请求接口描述:{}, ", system, desc);
            throw new RuntimeException("调用接口出现异常");
        }
        return result;
    }


    @FunctionalInterface
    public interface ServiceExecutor<T> {

        T serviceExecute();
    }

    public static class ParamMap{

        Map<String, Object> map = new HashMap<>();

        public ParamMap buildParam(String name, Object value) {
            map.put(name, value);
            return this;
        }

        public Map<String, Object> build(){
            return map;
        }
    }
}
