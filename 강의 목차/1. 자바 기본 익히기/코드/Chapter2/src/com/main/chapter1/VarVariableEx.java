package com.main.chapter1;

public class VarVariableEx {

    int abc;

    public static void main(String[] args) {
        fucn1();
    }

    private static void fucn1() {
        var vari = 10; // 10이상부터만 사용 가능
        //vari = 10.4 // 오류, 바뀌지 않음
    }
}
