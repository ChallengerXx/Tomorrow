package com.business.dao.mapper.custom;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MapCustomerMapper {

    List<Map<String,String>> searchTablesByFlag(@Param("flagList") List<String> flagList);
}
