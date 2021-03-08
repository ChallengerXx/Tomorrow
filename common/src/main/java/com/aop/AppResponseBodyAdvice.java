package com.aop;

import com.EnumBean.CommonEnum;
import com.bean.BaseResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
@Slf4j
public class AppResponseBodyAdvice implements ResponseBodyAdvice {

    /**
     * 判断支持类型
     *
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
//        if (!methodParameter.getMethod().getReturnType().isAssignableFrom(AppResponseBodyAdvice.class)) {
//            log.error("支持类型错误 -->" + methodParameter.getMethod().getReturnType().getClass());
//            return false;
//        }
        return true;
    }

    /**
     * 对结果进行包装
     *
     * @param obj
     * @param methodParameter
     * @param mediaType
     * @param aClass
     * @param req
     * @param resp
     * @returnannotationTest
     */
    @Override
    public Object beforeBodyWrite(Object obj, MethodParameter methodParameter, MediaType mediaType, Class aClass,
                                  ServerHttpRequest req, ServerHttpResponse resp) {
        for (String s : req.getHeaders().get("Content-type")) {
            boolean isNoJson = true;
            if (s.contains( "application/json")) {
                isNoJson = false;
            }
            if (isNoJson){ //非json数据不进行包装
                return obj;
            }
        }
        resp.getHeaders().add("Content-type", "application/json;charset=UTF-8");
        if (obj != null && obj.getClass().isAssignableFrom(BaseResp.class)) {
            return obj;
        }
        BaseResp resp1 = new BaseResp(CommonEnum.SUCCESS.getCode(),CommonEnum.SUCCESS.getMsg(),obj);
        return resp1;
    }
}
