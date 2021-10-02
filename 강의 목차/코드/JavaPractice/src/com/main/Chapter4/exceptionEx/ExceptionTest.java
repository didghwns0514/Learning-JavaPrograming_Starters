package com.main.Chapter4.exceptionEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    FileInputStream fileInputStream;

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.createObjAutoClose();

    }

    public void createTextStream() { // Method에서 throw Exception 사용하면, compile로 넘어가기 전에도 에러가 나옴
        try {
            fileInputStream = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("fileInputStream = " + fileInputStream);
            }
            System.out.println("finally");
        }

        System.out.println("end");


    }

    public void createTextStreamResources() {
        try (FileInputStream fis = new FileInputStream("a.txt")) { //  Close 자동으로 호출

        } catch (IOException e) {
            System.out.println("e = " + e);
        } finally {
            System.out.println("finally");
        }
        System.out.println("end");


    }

    public void createObjAutoClose() {
        try (AutoCloseObj autoCloseObj = new AutoCloseObj()) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("e = " + e);

        } finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }


}
