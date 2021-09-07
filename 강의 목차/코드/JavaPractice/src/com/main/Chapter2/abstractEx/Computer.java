package com.main.Chapter2.abstractEx;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켰습니다.");
    }
    public void turnOff() {
        System.out.println("전원을 껐습니다.");
    }

}
