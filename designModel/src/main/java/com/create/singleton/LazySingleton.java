package com.create.singleton;

/**
 * 懒汉式-线程不安全
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){

    }

    public static LazySingleton getUniqueInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
