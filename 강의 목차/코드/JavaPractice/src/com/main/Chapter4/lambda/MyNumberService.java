package com.main.Chapter4.lambda;

public class MyNumberService {

    public int getMaxNumber(int num1, int num2) {
        // if 문으로 구현
//        if (num1 >= num2) {
//            return num1;
//        } else {
//            return num2;
//        }

        // Math 라이브러리 사용
        // Math.max(num1, num2);

        // 람다식 사용
        MyNumber maxNumber = (int x1, int y1) -> {
            return (x1 >= y1) ? x1 : y1;
        };

        return maxNumber.getMaxNumber(num1, num2);
    }
}
