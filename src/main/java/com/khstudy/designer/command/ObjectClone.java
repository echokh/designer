package com.khstudy.designer.command;

public class ObjectClone {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p1.aa==p2.aa);

    }

    static class Person implements Cloneable {
        String aa = new String("123");

        @Override
        public Object clone() throws CloneNotSupportedException {
            Person p = (Person) super.clone();
            return p;
        }
    }

}
