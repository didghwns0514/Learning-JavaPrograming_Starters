package com.main.Chapter2.classpart;

public class FunctionExample {

    private int number1;
    private int number2;

    public FunctionExample(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;

    }

    /**
     * Role
    * @param : n1, n2
    * @return : int
    * @date : 2021/08/18 12:17 오전
    * @author : HoJun Yang
    * @email : didghwns0514@gmail.com
    * @see : -
    */
    public int addNum(){

        return this.number1 + this.number2;
    }
}
