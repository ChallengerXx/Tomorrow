package com.business.factory;

import com.business.annotation.RuleStrategy;
import com.business.strategy.service.StrategyService;
import org.apache.commons.lang.StringUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class RulePoolFactory implements BeanPostProcessor, ApplicationContextAware {


    /**
     * 规则池
     */
    private ConcurrentHashMap<String, StrategyService> rulePool = new ConcurrentHashMap<>();

    private ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (!(bean instanceof StrategyService)) {
            return bean;
        }
        RuleStrategy ruleStrategy = AnnotationUtils.findAnnotation(AopUtils.getTargetClass(bean), RuleStrategy.class);
        if (ruleStrategy == null) {
            return bean;
        }
        String rule = ruleStrategy.rule();
        if (StringUtils.isNotBlank(rule)) {
            rulePool.put(rule, (StrategyService) bean);
        }
        return bean;
    }

    public List<StrategyService> getRuleList(List<String> ruleList) {
        List<StrategyService> list = new ArrayList<>();
        if (CollectionUtils.isEmpty(ruleList)) {
            return list;
        }
        for (String rule : ruleList) {
            if (StringUtils.isBlank(rule)) {
                continue;
            }
            StrategyService strategyService = rulePool.get(rule);
            if (strategyService != null) {
                list.add(strategyService);
                continue;
            }
            strategyService = (StrategyService) applicationContext.getBean(rule);
            if (strategyService != null) {
                list.add(strategyService);
            }
        }
        return list;
    }
}
