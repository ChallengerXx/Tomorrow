package com.structural.Decorator;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.cloud.context.restart.RestartListener;
import org.springframework.util.StopWatch;

import java.text.NumberFormat;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DecoratorDemo {


    public static void main(String[] args) throws InterruptedException {
//        People people = new ShoesDecorator(new SuitDecorator(new ShirtDecorator(new PantsDecorator(new Jane()))));
//        people.wear();
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start("1");
//
//        Thread.sleep(1000);
//        stopWatch.stop();
//        stopWatch.start("2");
//
//        Thread.sleep(2000);
//        stopWatch.stop();
//        System.out.println(stopWatch.currentTaskName());
//        System.out.println(stopWatch.getTotalTimeMillis());
//        System.out.println(stopWatch.prettyPrint());
//
//        NumberFormat nf = NumberFormat.getNumberInstance();
//        nf.setMinimumIntegerDigits(5);
//        nf.setGroupingUsed(true);
//        System.out.println(nf.format("1236.7887"));
//        nf.setMaximumIntegerDigits(5);
//        System.out.println(nf.format(System.currentTimeMillis()));
//        System.out.println(SpringApplicationRunListener.class.getName());

        registerSingleton("1", new Object());
    }
    private static Map<String, Object> beanDefinitionMap = new ConcurrentHashMap<>(256);
    private static volatile Set<String> manualSingletonNames = new LinkedHashSet<>(16);
    static {
//        manualSingletonNames.add("1");
//        beanDefinitionMap.put("1", new Object());
    }

    public static void registerSingleton(String name, Object o) {
        updateManualSingletonNames(set -> set.add(name), test -> !beanDefinitionMap.containsKey(name));
    }

    public static void updateManualSingletonNames(Consumer<Set<String>> action,  Predicate condition) {
        System.out.println(condition.test(""));
        if (condition.test("")){
            Set<String> updatedSingletons = new LinkedHashSet<>(manualSingletonNames);
            action.accept(updatedSingletons);
            manualSingletonNames = updatedSingletons;
        }else {
            // Still in startup registration phase
            System.out.println("else");
            if (condition.test("")) {
                action.accept(manualSingletonNames);
            }
        }

        System.out.println(manualSingletonNames);
        System.out.println(beanDefinitionMap);
    }
}
