package com.business.dubbo.service.impl;

import com.business.dubbo.service.TestDubboService;
import org.springframework.stereotype.Component;

@Component

public class TestDubboServiceImpl implements TestDubboService {
    @Override
    public String test(Object object) {
        return "success";
    }
}
