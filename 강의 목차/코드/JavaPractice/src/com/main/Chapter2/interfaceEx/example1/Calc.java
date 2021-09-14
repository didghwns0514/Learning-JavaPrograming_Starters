package com.main.Chapter2.interfaceEx.example1;

public interface Calc {

    double PI = 3.14; // 자동으로 public static final double PI = 3.14; 로 변환
    int ERROR = -999999999;

    static int calculateTotalInArr(int[] arr) {

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }

    int add(int num1, int num2); // 자동으로 public abstract int add() 로 변환

    int subtract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    default void description() { // 공통적으로 사용하는 메서드(원래는 제한자 default...)
        System.out.println("정수 계산기를 구현합니다");

    }
}
