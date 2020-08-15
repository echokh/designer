package com.khstudy.designer.singleton;

/**
 * 懒汉模式
 */
public class LazySingleton {

    private final static LazySingleton INSTANCE = new LazySingleton();

    private LazySingleton() {
    }

    public LazySingleton getInstance() {
        return INSTANCE;
    }
}
