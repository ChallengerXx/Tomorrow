package com.business.dao.mapper.custom;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MapCustomerMapper {

    List<String> searchTablesByFlag(@Param("flagList") List<String> flagList);
}
