package com.main.Chapter4.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length <= s2.getBytes().length) { // 람다식에서 Binary Operator를 직접 구현
            return s1;
        } else return s2;
    }

}


public class ReduceTest {

    public static void main(String[] args) {
        String[] strings = {"Hello!", "hi", "Nice to meet you!"};

        String result1 = method1(strings);
        String result2 = method2(strings);


    }

    public static String method1(String[] inputString) {
        String s = Arrays.stream(inputString).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) { // 람다식에서 Binary Operator를 직접 구현
                return s1;
            } else return s2;
        });
        System.out.println("s = " + s);

        return s;
    }

    public static String method2(String[] inputString) {
        String s = Arrays.stream(inputString).reduce(new CompareString()).get();
        System.out.println("s = " + s);
        return s;
    }
}
