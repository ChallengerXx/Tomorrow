package com.vo;

import lombok.Data;

/**
 * 楼盘信息实体类
 */
@Data
public class PremisesVo {

    //电梯code
    private String elevatorCode;
    //电梯名
    private String elevatorName;
    //地区code
    private String areaCode;
    //楼栋名
    private String buildName;
    //楼盘地址
    private String address;
    //单元名
    private String unitName;
    //城市code
    private String cityCode;
    //楼盘名
    private String pname;
    //楼栋id
    private Integer buildId;
    //楼盘id
    private Integer pid;
    //楼盘类型名
    private String type;
    //楼盘类型code
    private String typeCode;
    //城市名
    private String cityName;
    //地区名
    private String areaName;
    //楼盘图片
    private String skupic;
    //单元id
    private Integer unitId;
}
