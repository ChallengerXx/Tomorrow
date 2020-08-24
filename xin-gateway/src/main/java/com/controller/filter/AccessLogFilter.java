package com.controller.filter;

import com.util.DateUtil;
import com.util.JacksonUtils;
import com.util.RequestUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

@Component
@Slf4j
public class AccessLogFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        LocalDateTime startTime = LocalDateTime.now();
        //包装 request、response
        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
        try {
            //执行请求
            filterChain.doFilter(requestWrapper, responseWrapper);
        } finally {
            String contentType = responseWrapper.getContentType();
            boolean isJson = contentType != null && contentType.startsWith("application/json");
            byte[] resArr = responseWrapper.getContentAsByteArray();
            String responseBody = isJson ? (resArr.length < 5000 ? new String(resArr) : "it's too long!") : "it's not JSON";
            responseWrapper.copyBodyToResponse();
            LocalDateTime endTime = LocalDateTime.now();
            //记录日志
            StringBuffer logText = new StringBuffer();
            logText.append("{【请求方式】=").append(requestWrapper.getMethod());
            logText.append(",【请求URL】=").append(RequestUtil.getRequestURL(requestWrapper));
            logText.append(",【请求IP】=").append(RequestUtil.getIP(requestWrapper));
            logText.append(",【请求Header】=").append(RequestUtil.getRequestHeader(requestWrapper));
            logText.append(",【请求Parameter】=").append(JacksonUtils.ObjectToJson(requestWrapper.getParameterMap()));
            logText.append(",【请求Body】=").append(new String(requestWrapper.getContentAsByteArray()));
            logText.append(",【响应状态码】=").append(responseWrapper.getStatus());
            logText.append(",【响应数据】=").append(responseBody);
            logText.append(",【请求时间】=").append(DateUtil.DEFAULT_DATE_FORMAT.format(startTime));
            logText.append(",【响应时间】=").append(DateUtil.DEFAULT_DATE_FORMAT.format(endTime));
            logText.append(",【耗时】=").append(Duration.between(startTime, endTime).toMillis());
            logText.append("}");

            log.info("用户Id：{}-请求记录：{}", requestWrapper.getAttribute("userId"), logText.toString());
        }
    }
}
