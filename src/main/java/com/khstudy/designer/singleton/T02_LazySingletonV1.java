package com.khstudy.designer.singleton;

public class T02_LazySingletonV1 {
    private static T02_LazySingletonV1 s;

    private T02_LazySingletonV1() {
    }

    public static T02_LazySingletonV1 getInstance() {
        if(s==null)
        {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s=new T02_LazySingletonV1();
        }
        System.out.println(s.hashCode());
        return s;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(T02_LazySingletonV1.getInstance().hashCode());
            }).start();
        }
    }

}
