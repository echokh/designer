package com.khstudy.designer.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化
 */
public enum T08_SingletonEnum {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(T08_SingletonEnum.INSTANCE.hashCode());
            }).start();
        }
    }
}
