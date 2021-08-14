package com.main.chapter1;

public class ImplicitConversion {

    public static void main(String[] args) {

        byte bNum = 10;
        int num = bNum; // 형변환

        System.out.println(num);

        long lNum = 10;
        float fNum = lNum;

        System.out.println(fNum);


        double dNum = fNum + num; // num이 float형으로 변환, 더해질 때 double로 형변환

    }
}
