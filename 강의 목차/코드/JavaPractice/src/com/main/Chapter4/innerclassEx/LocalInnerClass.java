package com.main.Chapter4.innerclassEx;

class Outer {

    // Outer 클래스 인스턴스 생성 시점에 생성되는 변수
    static int sNum = 200;
    int outNum = 100;
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Outer.run -> runnable");
        }
    };

    public Runnable getRunnable(int i) {

        int localNum = 250; // getRunnable 실행 시점에 생성되는 변수, Stack에 저장됨(지역 변수이기 때문)

        return new Runnable() {
            @Override
            public void run() {
                outNum += 10;

                System.out.println("outNum = " + outNum);
                System.out.println("sNum = " + sNum);
                System.out.println("localNum = " + localNum);
            }
        };
    }
}


public class LocalInnerClass {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.getRunnable(20).run();

        outer.runnable.run();
    }

}
