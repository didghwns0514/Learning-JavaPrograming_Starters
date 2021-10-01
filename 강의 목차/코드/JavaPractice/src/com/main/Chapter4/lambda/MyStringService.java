package com.main.Chapter4.lambda;

public class MyStringService {

    public static void main(String[] args) {
        MyStringService myStringService = new MyStringService();
        String tempResult = myStringService.makeString("This is ", "Java");
        System.out.println("tempResult = " + tempResult);
    }

    public String makeString(String s1, String s2) {
        StringConcat stringConcat = (str1, str2) -> str1.concat(str2);
        String stringOutput = stringConcat.makeString(s1, s2);

        System.out.println("stringOutput = " + stringOutput);
        return stringOutput;
    }
}
