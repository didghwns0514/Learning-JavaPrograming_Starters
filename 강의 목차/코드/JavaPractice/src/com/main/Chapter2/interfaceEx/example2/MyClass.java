package com.main.Chapter2.interfaceEx.example2;

public class MyClass implements MyInterface {
    public static void main(String[] args) {
        MyClass mc = new MyClass();

        X xClass = mc;
        xClass.x();

        Y yClass = mc;
        yClass.y();
    }

    @Override
    public void myMethod() {
        System.out.println("my Method");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }
}
