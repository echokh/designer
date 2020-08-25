package com.khstudy.designer.singleton;

public class T04_LazySingletonV3 {
    private static T04_LazySingletonV3 s;

    private T04_LazySingletonV3() {
    }

    public static T04_LazySingletonV3 getInstance() {
        if (s == null) {

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (T04_LazySingletonV3.class) {
                s = new T04_LazySingletonV3();
            }
        }
        return s;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(T04_LazySingletonV3.getInstance().hashCode());
            }).start();
        }
    }

}
