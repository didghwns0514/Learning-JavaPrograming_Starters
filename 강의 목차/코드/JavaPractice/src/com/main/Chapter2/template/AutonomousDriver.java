package com.main.Chapter2.template;

public class AutonomousDriver extends Car {
    @Override
    public void drive() {
        System.out.println("자율주행이 운전합니다");
        System.out.println("자율주행 핸들을 조작합니다");
    }

    @Override
    public void stop() {
        System.out.println("자율주행이 브레이크를 밟습니다");

    }

    @Override
    public void wiper() {
        System.out.println("자율주행이 와이퍼를 작동시킵니다");

    }
}
