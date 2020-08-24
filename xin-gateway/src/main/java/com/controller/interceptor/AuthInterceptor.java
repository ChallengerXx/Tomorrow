package com.controller.interceptor;

import com.controller.entity.ResultDTO;
import com.util.JacksonUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 效验拦截器
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        return true;
    }

    private Boolean errorResponse(HttpServletResponse response, ResultDTO resultDTO) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().append(JacksonUtils.ObjectToJson(resultDTO));
        return false;
    }
}
