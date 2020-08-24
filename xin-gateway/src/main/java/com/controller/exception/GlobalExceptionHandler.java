package com.controller.exception;

import com.alibaba.dubbo.rpc.RpcException;
import com.controller.constant.XinResultEnum;
import com.controller.entity.ResultDTO;
import com.util.JacksonUtils;
import com.util.RequestUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常捕捉
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 处理所有业务异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public ResultDTO businessException(HttpServletRequest request, BusinessException e){
        Object userId = request.getAttribute("userId");
        String openId = RequestUtil.getParamFromCookie(request.getCookies(), "openId");
        String url = RequestUtil.getRequestURL(request);
        ResultDTO resultDTO = new ResultDTO(e);
        log.info("用户:{}, openId:{}, 调用接口:{}, 业务异常:{}", userId, openId, url, JacksonUtils.ObjectToJson(resultDTO));
        return resultDTO;
    }

    /**
     * 处理dubbo服务异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(RpcException.class)
    public ResultDTO rpcException(HttpServletRequest request, RpcException e){
        Object userId = request.getAttribute("userId");
        String openId = RequestUtil.getParamFromCookie(request.getCookies(), "openId");
        String url = RequestUtil.getRequestURL(request);
        ResultDTO resultDTO = new ResultDTO(XinResultEnum.E_0100);
        log.info("用户:{}, openId:{}, 调用接口:{}, Dubbo调用异常:{}", userId, openId, url, JacksonUtils.ObjectToJson(resultDTO));
        return resultDTO;
    }

    @ExceptionHandler(Exception.class)
    public ResultDTO exception(HttpServletRequest request, Exception e){
        Object userId = request.getAttribute("userId");
        String openId = RequestUtil.getParamFromCookie(request.getCookies(), "openId");
        String url = RequestUtil.getRequestURL(request);
        ResultDTO resultDTO = new ResultDTO(XinResultEnum.FAIL);
        log.info("用户:{}, openId:{}, 调用接口:{},未知异常:{}", userId, openId, url, JacksonUtils.ObjectToJson(resultDTO));
        return resultDTO;
    }
}
