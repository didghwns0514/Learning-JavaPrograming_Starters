package com.main.chapter1.assignment;

public class OperationEx1 {

    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) > 10) && ((i = i + 2) > 10); // 여기서 앞에 항이 true여야 뒤로 가서 평가

        System.out.println("value = " + value);
        System.out.println("num1 = " + num1);
        System.out.println("i = " + i);
    }
}
