package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.DemoDubboService;
import com.dubbo.service.ResultDTO;
import com.dubbo.service.request.DubboRequestDTO;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Service(interfaceClass = DemoDubboService.class, filter = "dubboFilter")
public class DemoDubboServiceImpl implements DemoDubboService {
    @Override
    public ResultDTO test(DubboRequestDTO dubboRequestDTO) {
        System.out.println("======================================");
        System.out.println(dubboRequestDTO);
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        map.put("key1", "value1");
        return new ResultDTO("0000", "success", map);
    }
}
