package com.khstudy.designer.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {

        AbastractFactory f=new ModernFactory();
        Vehicle v=f.createVehicle();
        v.go();
        Weapon weapon=f.createWeapon();
        weapon.shoot();
        Food food=f.createFood();
        f.createFood();
    }
}
