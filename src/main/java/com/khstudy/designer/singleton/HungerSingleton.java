package com.khstudy.designer.singleton;

/**
 * 饿汉模式
 */
public class HungerSingleton {

    private final static HungerSingleton INSTANCE = new HungerSingleton();

    private HungerSingleton() {
    }

    public HungerSingleton getInstance() {
        return INSTANCE;
    }
}
