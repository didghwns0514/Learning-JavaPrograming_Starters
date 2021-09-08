package com.main.Chapter2.template;

import org.junit.jupiter.api.Test;

public class TotalCarTest {

    @Test
    void totalCarTest() {
        Car car1 = new HumanDriver();
        car1.driveScenario();

        System.out.println("=======================");
        Car car2 = new AutonomousDriver();
        car2.driveScenario();

    }
}
