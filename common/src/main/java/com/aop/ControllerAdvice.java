package com.aop;

import com.EnumBean.CommonEnum;
import com.bean.BaseResp;
import com.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常返回
 */
@RestControllerAdvice
@Slf4j
public class ControllerAdvice {


    /**
     * 拦截捕捉自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = {BaseException.class})
    public BaseResp baseExceptionHandler(BaseException e) {
        log.error("业务逻辑错误 -->{}:{}", e.getCode(), e.getMsg());
        if (e.getCode() == null || e.getCode().equals("")) {
            e.setCode(CommonEnum.FAIL.getCode());
            e.setMsg(CommonEnum.FAIL.getMsg());
        }
        BaseResp resp = new BaseResp(e.getCode(), e.getMsg());
        return resp;
    }
}
