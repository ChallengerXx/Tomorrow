package com.business.strategy.service;

import com.business.annotation.RuleStrategy;
import org.springframework.stereotype.Service;

@Service
@RuleStrategy(rule = "code")
public class CodeScanService extends StrategyService {


    @Override
    public void execute() {
        System.out.println("execute code scan...");
    }
}
