package com.controller.constant;

public enum XinResultEnum {

    SUCCESS("0000","成功"),
    FAIL("9999","请求失败，服务繁忙"),
    E_0100("0100","dubbo服务调用异常"),
    ;

    private String code;
    private String msg;

    XinResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
