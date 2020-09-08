package com.khstudy.designer.singleton;

/**
 * 静态内部类方法
 * 当jvm加载类时之后加载外部类，内部类只有在调用时才会初始化
 * jvm保证了单例
 */
public class T07_StaticInnerClassSingleton {
    private T07_StaticInnerClassSingleton() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(new T07_StaticInnerClassSingleton().getInstance());
            }).start();

        }
    }

    //静态内部类实例化方法
    T07_StaticInnerClassSingleton.InnerClass b=new T07_StaticInnerClassSingleton.InnerClass();
    //非静态内部类实例化方法
    T07_StaticInnerClassSingleton.NInnerClass n=new T07_StaticInnerClassSingleton().new NInnerClass();

    public T07_StaticInnerClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }

    /**
     * 非静态内部类
     * 不能拥有静态属性方法，因为非静态内部类需要依赖外部类，需要外部类先实例化
     * 静态属性和方法是在类加载的时候就加载进内存，当外部类还没实例化，直接访问静态属性和方法就冲突了
     * 所以不能拥有静态属性方法
     */
    class NInnerClass{

    }

    /**
     * 静态内部类
     * 既可以有静态属性方法也可以拥有非静态属性方法
     */
    static class InnerClass {
        private static T07_StaticInnerClassSingleton INSTANCE = new T07_StaticInnerClassSingleton();
        private int a=10;
    }
}
