package com.main.Chapter2.interfaceEx.example1;

public interface Calc {

    double PI = 3.14; // 자동으로 public static final double PI = 3.14; 로 변환
    int ERROR = -999999999;

    int add(int num1, int num2); // 자동으로 public abstract int add() 로 변환

    int subtract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);
}
