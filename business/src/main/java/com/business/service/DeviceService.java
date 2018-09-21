package com.business.service;

public interface DeviceService {

    /**
     * 设备导出
     *
     * @param dataTime       数据日期
     * @param supplierSwitch 供应商状态
     * @param filePath       文件路径
     * @return
     */
    String deviceExport(Long dataTime, Integer supplierSwitch, String filePath);
}
