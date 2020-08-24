package com.create.singleton;

/**
 * 静态内部类实现  懒加载，线程安全（JVM 提供了对线程安全的支持）
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){

    }

    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static class SingletonHolder {
        private final static StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}
