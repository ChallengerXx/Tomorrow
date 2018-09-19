package com.vo;

import lombok.Data;

@Data
public class PremisesGPSVo {

    //纬度
    private String latitude;
    //经度
    private String longitude;
    //楼盘id
    private String pid;
    //楼盘名
    private String pname;
    //地址
    private String address;
}
