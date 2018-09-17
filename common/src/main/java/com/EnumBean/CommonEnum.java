package com.EnumBean;

import com.exception.BaseException;
import lombok.Getter;

@Getter
public enum CommonEnum {

    SUCCESS("200","操作成功"),
    FAIL("400","操作失败"),
    EXCEPTION("500","系统繁忙");

    private String msg;
    private String code;

    CommonEnum(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }

    /**
     * 通过code获取枚举对象
     * @param code
     * @return
     * @throws BaseException
     */
    public CommonEnum getEnumByCode(String code) throws BaseException{
        for (CommonEnum ce:values()) {
            if (code != null&&code.equals(ce.getCode())){
                return ce;
            }
        }
        throw new BaseException(EXCEPTION.getCode(),EXCEPTION.getMsg());
    }
}
