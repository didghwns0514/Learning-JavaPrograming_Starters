package com.main.chapter1;

public class ExplicitConversion {
    public static void main(String[] args) {

        int iNum = 1000;
        byte bNum = (byte)iNum; // 작아지는 방향은 casting으로 명시를 할 것
        System.out.println(bNum); // int 4byte인데 bNum은 1byte이므로 1 바이트까지만 잘려버림 : -24

        // 명시적으로 소수점 버리는 경우
        double dNum = 3.14;
        iNum = (int)dNum;
        System.out.println(iNum); // 소수점 이하 잘려버림 : 3

        // 소수점 유실 : truncated
        float fNum = 0.9F;
        int num1 = (int)dNum + (int)fNum; // 3 + 0 => 3
        int num2 = (int)(dNum+fNum); // 4.1x => 4

        System.out.println(num1);
        System.out.println(num2);

    }
}
