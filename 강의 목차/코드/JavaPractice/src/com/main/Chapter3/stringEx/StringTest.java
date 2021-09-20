package com.main.Chapter3.stringEx;

public class StringTest {

    public static void main(String[] args) {
        func2();


    }

    public static void func2() {
        String str1 = new String("abc");
        String str2 = new String("def");

        str1 = str1.concat(str2);
        System.out.println("str1 = " + str1);

    }

    public static void func1() {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println("str1 == str2 = " + str1 == str2);
        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        String str3 = "test";
        String str4 = "test";

        System.out.println("str3 == str4 = " + str3 == str4);
    }
}


