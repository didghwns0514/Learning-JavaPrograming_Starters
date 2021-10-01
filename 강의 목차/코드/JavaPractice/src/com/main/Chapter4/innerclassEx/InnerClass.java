package com.main.Chapter4.innerclassEx;


public class InnerClass {

    private static int sNum = 20;
    private int num = 10;
    private SubInnerClass subInnerClass;

    public InnerClass() {
        subInnerClass = new SubInnerClass();
    }

    public static void main(String[] args) {

        // 인스턴스 클래스
        InnerClass innerClass = new InnerClass();
        // InnerClass.SubInnerClass subInnerClass = innerClass.new SubInnerClass(); // private으로 안 막혀있으면 이렇게 사용가능
        innerClass.test();


        // Static 클래스
        InnerClass.StaticSubInnerClass staticSubInnerClass = new InnerClass.StaticSubInnerClass();
        staticSubInnerClass.inTest();
    }

    public void test() {
        subInnerClass.inTest();

    }


    static class StaticSubInnerClass {
        static int sInNum = 200;
        int iNum = 100;

        void inTest() {
            System.out.println("StaticSubInnerClass.inTest");
            sNum += 10;
        }
    }


    class SubInnerClass {
        int inNum = 200;
        // static int sInNum = 300; // 내부 class 가 static으로 전체가 선언되어야 됨

        void inTest() {
            System.out.println("SubInnerClass.inTest");
            System.out.println("inNum = " + inNum);
            System.out.println("sNum = " + sNum);
        }
    }


}
