package com.main.Chapter2.conceal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

class BirthDayTest {

    BirthDay date;

    @BeforeEach
    void setUp() {
        date = new BirthDay(2, 30, 2018);
    }

    @Test
    @DisplayName("Attribute access block 체크하기")
    void checkAttributeAccessDenial() {
        Field fieldDay = null;
        Field fieldMonth = null;
        Field fieldYear = null;
        try {
            fieldDay = date.getClass().getDeclaredField("day");
            fieldDay.setAccessible(true);

            fieldMonth = date.getClass().getDeclaredField("month");
            fieldMonth.setAccessible(true);

            fieldYear = date.getClass().getDeclaredField("year");
            fieldYear.setAccessible(true);

            int dayValue = (int)fieldDay.get(date);
            int monthValue = (int)fieldMonth.get(date);
            int yearValue = (int)fieldYear.get(date);

            Assertions.assertEquals(dayValue, 2);
            Assertions.assertEquals(monthValue, 30);
            Assertions.assertEquals(yearValue, 2018);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}