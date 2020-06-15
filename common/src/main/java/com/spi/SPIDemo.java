package com.spi;

import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SPIDemo {

    public static void main(String[] args) {
        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);

        for (SPIService spiService : load) {
            spiService.execute();
        }

        System.out.println("==================分割线====================");

        Iterator<SPIService> providers = Service.providers(SPIService.class);

        while (providers.hasNext()){
            SPIService next = providers.next();
            next.execute();
        }

    }
}
