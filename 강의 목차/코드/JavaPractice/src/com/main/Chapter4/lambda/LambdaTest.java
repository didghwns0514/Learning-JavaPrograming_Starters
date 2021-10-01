package com.main.Chapter4.lambda;

interface PrintString {
    void showString(String str);
}


public class LambdaTest {

    public static void main(String[] args) {
        // 1) 정직한 방식
        PrintString printString = s -> System.out.println("s = " + s);
        printString.showString("TEST!");

        // 2) Lambda 생성하고 받은 후, 출력 부를 함수로 wrapping
        showMyString(printString, "hi");

        // 3) Lambda 생성 및 출력을 둘다 wrapping
        showMyString(returnPrint(), "bye");
    }

    private static void showMyString(PrintString lambda, String string) {
        // lambda를 받을 수 있음, first class citizen
        lambda.showString("TEST! - 2" + string);

    }

    public static PrintString returnPrint() {
        return s -> System.out.println("s = " + s);

    }

}
