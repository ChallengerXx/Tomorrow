package com.business.dispatcher;

import com.business.factory.RulePoolFactory;
import com.business.strategy.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

@Service
public class RuleDispatcherService {

    private static Map<String, List<String>> mockData = new HashMap<>();

    @Autowired
    private RulePoolFactory rulePoolFactory;

    @Resource(name = "ruleThreadPoolExecutor")
    private ThreadPoolExecutor threadPoolExecutor;

    static {
        mockData.put("1", Arrays.asList("sql", "code"));
        mockData.put("2", Arrays.asList("sql"));
        mockData.put("3", Arrays.asList("code"));
    }

    public void dispatcher(String channel) {
        List<String> ruleList = mockData.get(channel);
        List<StrategyService> ruleExecutorList = rulePoolFactory.getRuleList(ruleList);
        for (StrategyService ruleExecutor : ruleExecutorList) {
            threadPoolExecutor.execute(() -> ruleExecutor.execute());
        }
    }
}
