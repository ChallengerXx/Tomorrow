package com.controller;

import com.controller.config.dubbo.DubboServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

    @Autowired
    private DubboServiceFactory dubboServiceFactory;

    @PostMapping(value = "/app/{serviceModule}/{serviceName}")
    public Map<String, Object> servicePost(
            @PathVariable("serviceModule") String serviceModule,
            @PathVariable("serviceName") String serviceName,
            @CookieValue(value = "token", required = false) String token,
            @RequestBody(required = false) Map<String, Object> parameters) {

        System.out.println(serviceModule);
        System.out.println(serviceName);
        System.out.println(token);
        System.out.println(parameters);
        Map<String, Object> map = new HashMap<>();
        map.put("serviceName", serviceName);
        map.put("token", token);
        map.put("parameters", parameters);
        Map<String, Object> map1 = dubboServiceFactory.genericInvoke(map);
        return map1;
    }
}
