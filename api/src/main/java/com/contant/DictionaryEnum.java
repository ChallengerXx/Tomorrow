package com.contant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum  DictionaryEnum {
    PREMISES_TYPE("D0038","物业类型"),
    COMPETITIVE_MEDIA("D0040","竞争媒体"),
    NETWORK_TYPE("D0039","手机信号"),
    SUPPLIER_PREMISES_STATUS("D0001","供应商对应楼盘状态"),
    DEVICE_STATUS("D0004","关联设备审核状态");
    private String code;
    private String codeName;
}
