package com.business.service.impl;

import com.business.dao.entity.projectEntity.DataDictionaryA;
import com.business.dao.entity.projectEntity.DataDictionaryAExample;
import com.business.dao.mapper.projectMapper.DataDictionaryAMapper;
import com.business.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private DataDictionaryAMapper dataDictionaryAMapper;

    @Override
    public List<DataDictionaryA> getAll() {
        DataDictionaryAExample example = new DataDictionaryAExample();
        example.createCriteria();
        List<DataDictionaryA> list = dataDictionaryAMapper.selectByExample(example);
        return list;
    }
}
