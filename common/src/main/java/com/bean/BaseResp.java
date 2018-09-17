package com.bean;

import lombok.Data;

@Data
public class BaseResp {
    private String code;
    private String msg;
    private Object data;

    public BaseResp(String code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.data = obj;
    }

    public BaseResp(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }
}
