package com.main.chapter2;

public class CharacterEx {

    public static void main(String[] args) {
        func1();
    }

    public static void func1(){
        char ch = 'A';

        System.out.println(ch);
        System.out.println((int)ch);

        ch = 66; // B
        System.out.println(ch);

        int ch2 = 67; // C
        System.out.println(ch2);
        System.out.println((char)ch2);

    }
}
