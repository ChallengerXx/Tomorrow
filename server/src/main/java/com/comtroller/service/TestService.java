package com.comtroller.service;

import com.business.dao.entity.projectEntity.Task0;
import com.business.dao.mapper.projectMapper.Task0Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class TestService {

    @Autowired
    private Task0Mapper task0Mapper;

    @Transactional(rollbackFor = Exception.class)
    public Boolean test(){
        for (int i = 0; i < 5; i++) {
            String uuid = UUID.randomUUID().toString();
            Task0 task = new Task0();
            task.setTaskNo(String.valueOf(i));
            task.setStatus("1");
            task.setResult("success");

            if (i == 3){
                throw new RuntimeException();
            }

            task0Mapper.insert(task);
            System.out.println("insert task success:" + task.toString());
        }
        return true;
    }
}
