package com.main.Chapter2.interfaceEx.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompleteCalcTest { // 클라이언트 부분(or 다른 서버코드를 가져다 쓰는 서버일 수도)

    @Test
    void completeCalcTest() {

        int num1 = 2;
        int num2 = 4;

        Calc calc = new CompleteCalc(); // 인터페이스 + 인터페이스 클라스 ; 클라이언트 코드 라고도 함(서버/기능 가져다 쓰기)

        calc.description();

        Assertions.assertEquals(calc.add(num1, num2), 6);
    }

    @Test
    @DisplayName("Test static method of interface")
    void interfaceStaticTest() {
        int[] arr = new int[]{
                10, 15, 40
        };

        Assertions.assertEquals(Calc.calculateTotalInArr(arr), 65);
    }
}
