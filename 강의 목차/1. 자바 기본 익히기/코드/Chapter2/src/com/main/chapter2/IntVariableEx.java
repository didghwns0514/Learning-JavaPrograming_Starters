/**
* <pre>
* com.main.chapter2
* -> IntVariableEx.java
* </pre>
* @date : 2021/08/08 7:13 오후
* @author : HoJun Yang
* @email : didghwns0514@gmail.com
* @version : 1.0.0
* @see :
*/

package com.main.chapter2;

public class IntVariableEx {
    public static void main(String[] args) {

        func1();
        func2();

    }

    public static void func1() {
        int num; // 리터럴, 주소 값이 있고, 그 주소에 10을 이후에 대입
        num = 10; // 10이라는 리터럴 값을 대입
        // num = 1234567890 // 이거는 리터럴 자체가 int라서 수행 자체가 안됨
        // long num = 1234567890L 으로 8 byte로 저장하도록 함(변수도 long으로 변경해야 함)

        System.out.println(num);
    }

    public static void func2() {
        int level = 20; // assign과 동시에 20 대입

        System.out.println(level);
    }

}
