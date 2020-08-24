package com.controller.config.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.alibaba.dubbo.rpc.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DubboServiceFactory {

    @Autowired
    private ApplicationConfig applicationConfig;

    @Autowired
    private RegistryConfig registryConfig;


    public Map<String, Object> genericInvoke(Map<String, Object> map) {
        ReferenceConfig<GenericService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);

        referenceConfig.setInterface("com.dubbo.service.DemoDubboService");

        referenceConfig.setGeneric(true);
        referenceConfig.setRetries(0);
        referenceConfig.setTimeout(60000);
        ReferenceConfigCache cache = ReferenceConfigCache.getCache();

        GenericService genericService = cache.get(referenceConfig);
        Map<String, Object> result =(Map<String, Object>) genericService.$invoke("test", new String[]{"com.dubbo.service.request.DubboRequestDTO"}, new Object[]{map});
        return result;
    }
}
