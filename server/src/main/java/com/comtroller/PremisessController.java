package com.comtroller;

import com.business.dao.entity.projectEntity.SspPremises;
import com.business.service.PremisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PremisessController {

    @Autowired
    private PremisesService premisesService;

    @RequestMapping("/getAllPremisess")
    public List<SspPremises> getAllPresess(){
        List<SspPremises> list = premisesService.getAll();
        return list;
    }
}
