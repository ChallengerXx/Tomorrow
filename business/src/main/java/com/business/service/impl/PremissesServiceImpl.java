package com.business.service.impl;

import com.business.dao.entity.projectEntity.SspMachineNum;
import com.business.dao.entity.projectEntity.SspMachineNumExample;
import com.business.dao.entity.projectEntity.SspPremises;
import com.business.dao.entity.projectEntity.SspPremisesExample;
import com.business.dao.mapper.custom.PremisesCustomerMapper;
import com.business.dao.mapper.projectMapper.SspMachineNumMapper;
import com.business.dao.mapper.projectMapper.SspPremisesMapper;
import com.business.service.PremisesService;
import com.contant.DictionaryEnum;
import com.req.TableReq;
import com.vo.PremisesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PremissesServiceImpl implements PremisesService {

    @Autowired
    private SspPremisesMapper premisesMapper;

    @Autowired
    private SspMachineNumMapper machineNumMapper;

    @Autowired
    private PremisesCustomerMapper premisesCustomerMapper;

    @Override
    public List<SspPremises> getAll() {
        SspPremisesExample example = new SspPremisesExample();
        example.createCriteria();
        List<SspPremises> list = premisesMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<PremisesVo> getByMachineNum(List<String> numList) {
        SspMachineNumExample example = new SspMachineNumExample();
        example.createCriteria().andMachineNumIn(numList);
        List<SspMachineNum> machineList = machineNumMapper.selectByExample(example);
        StringBuilder sb = new StringBuilder();
        List<TableReq> queryList = new ArrayList<>();
        machineList.forEach(machine -> {
            TableReq req = new TableReq();
            sb.delete(0,sb.length());
            req.setTable(sb.append("ssp_scr_").append(machine.getFlag()).append("_").append(machine.getScrType()).toString());
            req.setMachineNum(machine.getMachineNum());
            queryList.add(req);
        });
        List<PremisesVo> premisesVoList = premisesCustomerMapper.searchPremisesByNum(queryList, DictionaryEnum.PREMISES_TYPE.getCode());
        return premisesVoList;
    }
}
