package com.khstudy.designer.singleton;

public class DCLSingleton {
    private static DCLSingleton INSTANCE;

    private DCLSingleton() {
    }

    public DCLSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DCLSingleton.class) {
                //既然已经加了synchronized,那么同一个时间内只有一个线程进入到临界区
                //就算是进行了指令重排序，先执行了astore_1，也不会其他的线程读到这个状态？
                //再继续执行 invokespecial #3 <T.<init>>是不是就完成了全初始化？
                if (INSTANCE == null) {
                    INSTANCE = new DCLSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
