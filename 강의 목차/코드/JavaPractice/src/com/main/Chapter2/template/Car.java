package com.main.Chapter2.template;

public abstract class Car {

    // 차의 종류에 따라 다른 구현 방식
    public abstract void drive();

    public abstract void stop();

    // 추가된 매서드 -> 동일하게 override 하거나, 하위 클래스를 abstract로 변경
    public abstract void wiper();

    public void washCar() {

    }

    public void startCar() {
        System.out.println("시동을 켭니다");
    }

    public void turnOffCar() {
        System.out.println("시동을 끕니다");
    }

    public final void driveScenario() { // final 로 변경을 막음
        // 어느 차든 가져야 하는 driving 시나리오, 매번 동일한 템플릿
        startCar();
        drive();
        wiper();
        stop();
        turnOffCar();
        washCar();
    }
}
