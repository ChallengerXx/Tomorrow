package com.business.strategy.service;

import org.springframework.stereotype.Service;

@Service
public class CodeScanChildService extends CodeScanService {

    @Override
    public void execute() {
        System.out.println("child execute code scan...");
    }
}
