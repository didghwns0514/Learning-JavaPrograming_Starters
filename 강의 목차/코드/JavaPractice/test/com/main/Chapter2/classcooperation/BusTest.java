package com.main.Chapter2.classcooperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {
    Bus bus;
    int busIdentificationNumber;
    int passengerNumber;
    int incomeToday;

    @BeforeEach
    void beforeEach() {
        busIdentificationNumber = 1100;
        passengerNumber = 25;
        incomeToday = 25000;
        bus = new Bus(busIdentificationNumber, passengerNumber, incomeToday);
    }

    @Test
    @DisplayName("승객수 업데이트 확인")
    void passengerNumberUpdate() {
        bus.passengerNumberUpdate();
        Assertions.assertEquals(bus.getPassengerNumber(), passengerNumber + 1);
    }

    @Test
    @DisplayName("수입 증가 확인")
    void todayIncomeUpdate() {
        bus.todayIncomeUpdate();
        Assertions.assertEquals(bus.getIncomeToday(), incomeToday + FeeTable.BUS_FEE.getFee());
    }
}