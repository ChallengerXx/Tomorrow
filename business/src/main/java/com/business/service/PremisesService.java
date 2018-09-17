package com.business.service;

import com.business.dao.entity.projectEntity.SspPremises;
import com.vo.PremisesVo;

import java.util.List;

public interface PremisesService {

    List<SspPremises> getAll();

    /**
     * 通过机器码查询楼盘信息
     * @param numList
     * @return
     */
    List<PremisesVo> getByMachineNum(List<String> numList);
}
