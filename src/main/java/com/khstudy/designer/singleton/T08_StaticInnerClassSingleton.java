package com.khstudy.designer.singleton;

/**
 * 静态内部类方法
 * 当jvm加载类时之后加载外部类，内部类只有在调用时才会初始化
 * jvm保证了单例
 */
public class T08_StaticInnerClassSingleton {
    private T08_StaticInnerClassSingleton() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(new T08_StaticInnerClassSingleton().getInstance());
            }).start();

        }
    }

    //静态内部类实例化方法
    T08_StaticInnerClassSingleton.InnerClass b=new T08_StaticInnerClassSingleton.InnerClass();
    //非静态内部类实例化方法
    T08_StaticInnerClassSingleton.NInnerClass n=new T08_StaticInnerClassSingleton().new NInnerClass();

    public T08_StaticInnerClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }

    /**
     * 非静态内部类
     */
    class NInnerClass{

    }

    /**
     * 静态内部类
     */
    static class InnerClass {
        private static T08_StaticInnerClassSingleton INSTANCE = new T08_StaticInnerClassSingleton();
        private int a=10;
    }
}
