package com.business.strategy.service;

import com.business.annotation.RuleStrategy;
import org.springframework.stereotype.Service;

@Service
@RuleStrategy(rule = "sql")
public class SqlScanService extends StrategyService {


    @Override
    public void execute() {
        System.out.println("execute sql scan...");
    }
}
