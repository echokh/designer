package com.khstudy.designer.singleton;

public class T06_DCLSingleton {
    private static volatile T06_DCLSingleton INSTANCE;

    private T06_DCLSingleton() {
    }

    public T06_DCLSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (T06_DCLSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new T06_DCLSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
