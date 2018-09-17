package com.bean;

import lombok.Data;

@Data
public class BaseResp {
    private String code;
    private String msg;
    private Object obj;

    public BaseResp(String code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public BaseResp(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.obj = null;
    }
}
