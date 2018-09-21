package com.business.service.impl;

import com.business.dao.entity.projectEntity.SspSupplier;
import com.business.dao.entity.projectEntity.SspSupplierExample;
import com.business.dao.mapper.projectMapper.SspSupplierMapper;
import com.business.service.DeviceService;
import com.exception.BusinessException;
import com.util.ImportUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private SspSupplierMapper supplierMapper;

    @Override
    public String deviceExport(Long dataTime, Integer supplierSwitch, String filePath) {
        SspSupplierExample example = new SspSupplierExample();
        example.createCriteria().andSaleSwitchEqualTo(supplierSwitch);
        List<SspSupplier> supplierList = supplierMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(supplierList)) {
            StringBuilder file = new StringBuilder(filePath);
            file.append(File.separator).append(dataTime).append(".csv");
            log.info("准备导出数据:供应商条数-->{}", supplierList.size());
            List<String> list = new ArrayList<>();
            list.add("id,saleSwitch,supplierMark,SupplierName,updateMan,updateTime");
            supplierList.forEach(sup -> {
                StringBuilder sb = new StringBuilder();
                sb.append(sup.getId()).append(",")
                        .append(sup.getSaleSwitch()).append(",")
                        .append(sup.getSupplierMark()).append(",")
                        .append(sup.getSupplierName()).append(",")
                        .append(sup.getUpdateMan()).append(",")
                        .append(sup.getUpdateTime());
                list.add(sb.toString());
            });
            ImportUtil.exportCsvFile(list, file.toString());
        } else {
            throw new BusinessException("未查询到需要导出的数据");
        }
        return null;
    }
}
