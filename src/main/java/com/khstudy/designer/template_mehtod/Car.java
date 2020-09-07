package com.khstudy.designer.template_mehtod;

/**
 * TemplateMehtod模式就是在模板方法中按照一个的规则和顺序调用基本方法
 * 是通过汇总或排序基本方法产生的结果集
 */
public abstract class Car {
    //汽车启动
    protected abstract void start();

    //汽车鸣笛
    protected abstract void alarm();

    //发动机响声
    protected abstract void engineBoom();

    //汽车停止
    protected abstract void stop();

    //钩子函数
    protected boolean isAlarm() {
        return true;
    }

    /**
     * 汽车跑起来
     * 定义了调用其他方法的顺序，并且子类不能修改，run()叫做模板方法
     * run()中的四个方法是基本方法
     * 具体方法：在抽象类中实现的基本方法
     * 抽象方法：在抽象类中没有实现，在子类中实现的方法
     * 钩子函数：　
     * 局部钩子仅钩挂您自己进程的事件。
     * 远程的钩子还可以将钩挂其它进程发生的事件
     */
    public final void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
