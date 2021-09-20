package com.main.Chapter3.stringEx;

public class StringBuildTest {

    public static void main(String[] args) {

        String str1 = new String("java1");

        StringBuilder str2 = new StringBuilder("java2");
        System.out.println("str2.hashCode() = " + str2.hashCode());

        str2.append(" is perect!");
        str2.append(" also learn Android!");
        System.out.println("str2.hashCode() after append = " + str2.hashCode());

        String str3 = str2.toString();
        System.out.println("str3.hashCode() = " + str3.hashCode());
    }
}
