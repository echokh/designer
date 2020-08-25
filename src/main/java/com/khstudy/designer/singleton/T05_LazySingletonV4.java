package com.khstudy.designer.singleton;

public class T05_LazySingletonV4 {
    private static T05_LazySingletonV4 s;

    private T05_LazySingletonV4() {
    }

    public static T05_LazySingletonV4 getInstance() {
        if (s == null) {

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (T05_LazySingletonV4.class) {
                if (s == null) {
                    s = new T05_LazySingletonV4();
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(T05_LazySingletonV4.getInstance().hashCode());
            }).start();
        }
    }

}
