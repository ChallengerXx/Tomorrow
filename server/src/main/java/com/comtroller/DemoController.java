package com.comtroller;

import com.business.dao.mapper.projectMapper.Task0Mapper;
import com.comtroller.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Autowired
    private Task0Mapper task0Mapper;
    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public String test1(){

        Boolean test = testService.test();
        return "success";
    }


}
