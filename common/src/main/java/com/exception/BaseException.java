package com.exception;

import com.EnumBean.CommonEnum;
import lombok.Data;

/**
 * 公共异常类
 */
@Data
public class BaseException extends RuntimeException {

    private String msg;
    private String code;

    public static BaseException fail() {
        return new BaseException(CommonEnum.FAIL.getCode(), CommonEnum.FAIL.getMsg());
    }

    public BaseException(String msg, String code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }
}
