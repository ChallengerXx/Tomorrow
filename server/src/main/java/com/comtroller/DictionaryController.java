package com.comtroller;

import com.business.dao.entity.projectEntity.DataDictionaryA;
import com.business.dao.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping("/getAllDic")
    public List<DataDictionaryA>  getAllDic(){
        List<DataDictionaryA> list = dictionaryService.getAll();
        return list;
    }
}
