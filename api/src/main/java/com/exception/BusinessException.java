package com.exception;

import com.EnumBean.CommonEnum;
import lombok.Data;

@Data
public class BusinessException extends BaseException {

    public BusinessException(String msg, String code) {
        super(msg, code);
    }

    public BusinessException(String msg) {
        super(msg,CommonEnum.FAIL.getCode());
    }

    public static BusinessException fail(){
        return new BusinessException(CommonEnum.FAIL.getCode(), CommonEnum.FAIL.getMsg());
    }
}
