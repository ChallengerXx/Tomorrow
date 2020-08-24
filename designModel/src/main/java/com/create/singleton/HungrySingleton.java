package com.create.singleton;

/**
 * 饿汉式-线程安全
 */
public class HungrySingleton {

    private static HungrySingleton uniqueInstance = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getUniqueInstance() {
        return uniqueInstance;
    }
}
