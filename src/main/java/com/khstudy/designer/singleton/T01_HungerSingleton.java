package com.khstudy.designer.singleton;

/**
 * 饿汉模式
 */
public class T01_HungerSingleton {

    private final static T01_HungerSingleton INSTANCE = new T01_HungerSingleton();

    private T01_HungerSingleton() {
    }

    public T01_HungerSingleton getInstance() {
        return INSTANCE;
    }
}
