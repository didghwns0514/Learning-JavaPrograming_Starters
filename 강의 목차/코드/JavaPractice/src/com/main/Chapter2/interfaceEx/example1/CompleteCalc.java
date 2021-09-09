package com.main.Chapter2.interfaceEx.example1;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;

        } else {
            return ERROR;
        }
    }

    public void showInformation() {
        System.out.println("Calc 인터페이스를 모두 구현하였습니다!");
    }
}
