package com.khstudy.designer.template_mehtod;

public class BaoMa extends Car {
    @Override
    protected void start() {
        System.out.println("宝马启动。。。");
    }

    @Override
    protected void alarm() {
        if(isAlarm())
        {
            System.out.println("宝马鸣笛。。。");
        }
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎声音。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止。。。");
    }

    @Override
    protected boolean isAlarm() {
        return true;
    }
}
