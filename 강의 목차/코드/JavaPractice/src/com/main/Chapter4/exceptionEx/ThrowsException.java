package com.main.Chapter4.exceptionEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public static void main(String[] args) {
        ThrowsException throwsException = new ThrowsException();
        try {
            throwsException.loadClass("b.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) { // 전역 오류(혹시 모르기 때문에) 는 catch의 마지막에 수행
            System.out.println("e = " + e);
        } finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }

    // Throws로 해당 에러들을 미뤄놓았기 때문에, 이 Class를 쓰는 쪽에서 해당 Exception들을 구현해야 함
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(fileName);
        // 동적으로 Class 할당
        Class c = Class.forName(className);

        return c;
    }
}
