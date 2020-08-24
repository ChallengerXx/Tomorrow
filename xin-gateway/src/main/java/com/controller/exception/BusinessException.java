package com.controller.exception;

import com.controller.constant.XinResultEnum;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 3708987782191297794L;

    private String errorCode;
    private String errorMessage;

    public BusinessException(XinResultEnum resultEnum){
        super(resultEnum.getCode() + ":" + resultEnum.getMsg());
        this.errorCode = resultEnum.getCode();
        this.errorMessage = resultEnum.getMsg();
    }

    public BusinessException(XinResultEnum resultEnum, String message){
        super(resultEnum.getCode() + ":" + message);
        this.errorCode = resultEnum.getCode();
        this.errorMessage = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
