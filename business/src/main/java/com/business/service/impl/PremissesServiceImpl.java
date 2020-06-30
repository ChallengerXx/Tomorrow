package com.business.service.impl;

import com.business.dao.entity.projectEntity.*;
import com.business.dao.mapper.custom.PremisesCustomerMapper;
import com.business.dao.mapper.projectMapper.AreasMapper;
import com.business.dao.mapper.projectMapper.DataDictionaryBMapper;
import com.business.dao.mapper.projectMapper.SspMachineNumMapper;
import com.business.service.PremisesService;
import com.contant.DictionaryEnum;
import com.req.TableReq;
import com.vo.PremisesGPSVo;
import com.vo.PremisesVo;
import com.vo.SellAppPremisesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PremissesServiceImpl implements PremisesService {

    @Autowired
    private SspMachineNumMapper machineNumMapper;

    @Autowired
    private PremisesCustomerMapper premisesCustomerMapper;

    @Autowired
    private DataDictionaryBMapper dataDictionaryBMapper;

    @Autowired
    private AreasMapper areasMapper;

    @Override
    public List<PremisesVo> getByMachineNum(List<String> numList) {
        SspMachineNumExample example = new SspMachineNumExample();
        example.createCriteria().andMachineNumIn(numList);
        List<SspMachineNum> machineList = machineNumMapper.selectByExample(example);
        StringBuilder sb = new StringBuilder();
        List<TableReq> queryList = new ArrayList<>();
        machineList.forEach(machine -> {
            TableReq req = new TableReq();
            sb.delete(0, sb.length());
            req.setTable(sb.append("ssp_scr_").append(machine.getFlag()).append("_").append(machine.getScrType()).toString());
            req.setMachineNum(machine.getMachineNum());
            queryList.add(req);
        });
        List<PremisesVo> premisesVoList = premisesCustomerMapper.searchPremisesByNum(queryList, DictionaryEnum.PREMISES_TYPE.getCode());
        return premisesVoList;
    }

    @Override
    public List<PremisesGPSVo> getPremisesByIds(List<Integer> pids) {
        List<PremisesGPSVo> voList = premisesCustomerMapper.getPremisesByIds(pids);
        return voList;
    }

    @Override
    public List<PremisesGPSVo> getPremisesNameLike(String searchWord, List<String> cityCodes) {
        List<PremisesGPSVo> voList = premisesCustomerMapper.getPremisesNameLike(cityCodes, searchWord);
        return voList;
    }

    @Override
    public List<SellAppPremisesVo> getAppPremisesByIds(List<String> pidList) {
        List<Integer> queryList = pidList.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        List<SellAppPremisesVo> premisesList = premisesCustomerMapper.getAppPremisesByIds(queryList);
        List<Integer> areas = new ArrayList<>();
        List<String> types = new ArrayList<>();
        for (SellAppPremisesVo vo : premisesList) {
            areas.add(vo.getAreaId());
            areas.add(vo.getCityId());
            areas.add(vo.getProvinceId());
            types.add(vo.getPropertyType());
        }
        //项目类型code
        List<String> typeQueryList = types.stream().distinct().collect(Collectors.toList());
        Map<String, String> dicMap = getDicBById(typeQueryList);
        //城市、地区、省份id
        List<Integer> areaQueryList = areas.stream().distinct().collect(Collectors.toList());
        Map<Integer, String> areaMap = getAreaById(areaQueryList);
        for (SellAppPremisesVo vo : premisesList) {
            vo.setCity(areaMap.get(vo.getCityId()));
            vo.setProvince(areaMap.get(vo.getProvinceId()));
            vo.setArea(areaMap.get(vo.getAreaId()));
            vo.setPropertyTypeStr(dicMap.get(vo.getPropertyType()));
        }
        return premisesList;
    }

    public Map<String, String> getDicBById(List<String> idList) {
        DataDictionaryBExample example = new DataDictionaryBExample();
        example.createCriteria().andACodeEqualTo(DictionaryEnum.PREMISES_TYPE.getCode()).andCodeIn(idList);
        List<DataDictionaryB> dictionaryBList = dataDictionaryBMapper.selectByExample(example);
        Map<String, String> dicMap = dictionaryBList.stream().collect(Collectors.toMap(DataDictionaryB::getCode, DataDictionaryB::getCodeName));
        return dicMap;
    }

    public Map<Integer, String> getAreaById(List<Integer> idList) {
        AreasExample example = new AreasExample();
        example.createCriteria().andIdIn(idList);
        List<Areas> areasList = areasMapper.selectByExample(example);
        Map<Integer, String> areaMap = areasList.stream().collect(Collectors.toMap(Areas::getId, Areas::getName));
        return areaMap;
    }
}
