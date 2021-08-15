/**
* <pre>
* com.main.binary
* -> Binary.java 
* </pre>
* @date : 2021/08/04 8:27 오전
* @author : HoJun Yang
* @email : didghwns0514@gmail.com
* @version : 1.0.0
* @see : 
**/
package com.main.chapter1;

public class Binary {
    /**
     * Role 각 변수 한번씩 print 해보기
    * @param :
    * @return :
    * @date : 2021/08/04 8:40 오전
    * @author : HoJun Yang
    * @email : didghwns0514@gmail.com
    * @see :
    */
    public static void main(String[] args) {
        int num = 10;
        int bNum = 0B1010; // 파이썬과 동일
        int oNum = 012; // 8진수
        int hNum = 0XA; // 16진수

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(hNum);
    }
}
