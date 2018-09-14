package com.business.dao.service.impl;

import com.business.dao.entity.projectEntity.SspPremises;
import com.business.dao.entity.projectEntity.SspPremisesExample;
import com.business.dao.mapper.projectMapper.SspPremisesMapper;
import com.business.dao.service.PremisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PremissesServiceImpl implements PremisesService {

    @Autowired
    private SspPremisesMapper premisesMapper;

    @Override
    public List<SspPremises> getAll() {
        SspPremisesExample example = new SspPremisesExample();
        example.createCriteria();
        List<SspPremises> list = premisesMapper.selectByExample(example);
        return list;
    }
}
