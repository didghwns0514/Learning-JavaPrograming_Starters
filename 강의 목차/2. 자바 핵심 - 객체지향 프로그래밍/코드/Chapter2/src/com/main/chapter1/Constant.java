package com.main.chapter1;

public class Constant {
    public static void main(String[] args) {
        func1();
        func2();
    }

    private static void func2() {
        final int STUDENT_TOTAL_NUMBER = 30;
        int num = 30;
        if (num == STUDENT_TOTAL_NUMBER) {
            System.out.println("Student number : " + STUDENT_TOTAL_NUMBER);
        }
    }

    private static void func1() {
        final int MAX_NUM = 100;
        final float PI = 3.14F;

        // PI = 3.13F; 는 오류가 나서 동작하지 않음

    }

}
