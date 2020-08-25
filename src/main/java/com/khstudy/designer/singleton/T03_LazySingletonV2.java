package com.khstudy.designer.singleton;

public class T03_LazySingletonV2 {
    private static T03_LazySingletonV2 s;

    private T03_LazySingletonV2() {
    }

    public static synchronized T03_LazySingletonV2 getInstance() {
        if(s==null)
        {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s=new T03_LazySingletonV2();
        }
        return s;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(T03_LazySingletonV2.getInstance().hashCode());
            }).start();
        }
    }

}
