package com.khstudy.designer.template_mehtod;

public class BenCh extends Car {
    @Override
    protected void start() {
        System.out.println("奔驰启动。。。");
    }

    @Override
    protected void alarm() {
            System.out.println("奔驰鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰引擎声音。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停止。。。");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
