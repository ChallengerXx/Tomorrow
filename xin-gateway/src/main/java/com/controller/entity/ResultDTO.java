package com.controller.entity;

import com.controller.constant.XinResultEnum;
import com.controller.exception.BusinessException;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResultDTO implements Serializable {

    private static final long serialVersionUID = -4953473374855194626L;
    //状态码
    private String code;
    //描述信息
    private String msg;
    //返回数据
    private Object result;

    public ResultDTO(BusinessException e){
        this.code = e.getErrorCode();
        this.msg = e.getErrorMessage();
    }

    public ResultDTO(XinResultEnum result){
        this.code = result.getCode();
        this.msg = result.getMsg();
    }
}
