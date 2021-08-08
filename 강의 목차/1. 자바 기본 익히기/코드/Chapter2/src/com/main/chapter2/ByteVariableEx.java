package com.main.chapter2;

public class ByteVariableEx {

    public static void main(String[] args) {
        func1();
        func2();
    }

    public static void func1() {
        byte bData = -128;
        System.out.println(bData);

        // bData = 128; // This is error
    }
    public static void func2(){
        byte bData2 = 127;
        System.out.println(bData2);
    }
}
