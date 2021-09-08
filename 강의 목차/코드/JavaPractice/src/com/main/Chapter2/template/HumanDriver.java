package com.main.Chapter2.template;

public class HumanDriver extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다");
        System.out.println("사람이 핸들을 조작합니다");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크를 밟습니다");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 와이퍼를 작동시킵니다");
    }

    @Override
    public void washCar() {
        System.out.println("사람이 세차를 진행합니다");
    }
}
