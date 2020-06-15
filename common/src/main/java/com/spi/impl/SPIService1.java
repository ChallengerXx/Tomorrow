package com.spi.impl;

import com.spi.SPIService;

public class SPIService1 implements SPIService {
    @Override
    public void execute() {
        System.out.println("execute SPI one");
    }
}
