package com.main.Chapter2.interfaceEx.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompleteCalcTest {

    @Test
    void completeCalcTest() {

        int num1 = 2;
        int num2 = 4;

        Calc calc = new CompleteCalc();
        Assertions.assertEquals(calc.add(num1, num2), 6);
    }
}
