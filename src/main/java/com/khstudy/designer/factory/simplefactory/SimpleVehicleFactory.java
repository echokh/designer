package com.khstudy.designer.factory.simplefactory;

public class SimpleVehicleFactory {

    /**
     * 简单工厂
     * @return
     */
    public Car createCar(){
        //前置处理
        return new Car();
    }

    /**
     * 简单工厂
     * @return
     */
    public Plane createPlane(){
        //前置处理
        return new Plane();
    }

}
