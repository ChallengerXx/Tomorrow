package com.business.dao.mapper.custom;

import com.vo.PremisesVo;

import java.util.List;

public interface PremisesCustomerMapper {

    List<PremisesVo> getByMachineNum(List<String> numList);
}
