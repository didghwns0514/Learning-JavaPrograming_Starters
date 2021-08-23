package com.main.Chapter2.classcooperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentVehicleTest {
    Bus bus;
    Subway subway;
    Student student;

    int studentMoney;

    @BeforeEach
    void beforeEach() {
        bus = new Bus(1100, 25, 25000);
        subway = new Subway(25, 1000, 50000);

        studentMoney = 14000;
        student = new Student("호준", 3, studentMoney);
    }


    @Test
    @DisplayName("학생 버스 요금 차감")
    void takeBus() {
        student.takeBus(bus);
        Assertions.assertEquals(student.getMoney(), studentMoney - FeeTable.BUS_FEE.getFee());

    }

    @Test
    @DisplayName("학생 지하철 요금 차감")
    void takeSubway() {
        student.takeSubway(subway);
        Assertions.assertEquals(student.getMoney(), studentMoney - FeeTable.SUBWAY_FEE.getFee());

    }
}