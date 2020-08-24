package com.create.singleton;

/**
 * 双重校验锁-线程安全
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getInstance(){
        if (doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

}
