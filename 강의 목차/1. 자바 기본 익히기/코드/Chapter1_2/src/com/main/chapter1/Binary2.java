/**
* <pre>
* com.main.binary
* -> Binary2.java
* </pre>
* @date : 2021/08/04 8:47 오전
* @author : HoJun Yang
* @email : didghwns0514@gmail.com
* @version : 1.0.0
* @see :
*/
package com.main.chapter1;

public class Binary2 {
    /**
     * Role
    * @param :
    * @return :
    * @date : 2021/08/04 8:48 오전
    * @author : HoJun Yang
    * @email : didghwns0514@gmail.com
    * @see :
    */

    public static void main(String[] args) {
        int num1 = 0B00000000000000000000000000000101; // 5
        int num2 = 0B11111111111111111111111111111011; // -5, 보수 공식 사용

        int sum = num1 + num2;

        System.out.println(sum);

    }
}
