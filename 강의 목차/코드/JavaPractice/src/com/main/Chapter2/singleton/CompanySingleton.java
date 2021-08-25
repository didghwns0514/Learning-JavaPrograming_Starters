package com.main.Chapter2.singleton;

public class CompanySingleton {

    // instance또한 외부에서 접근하면 안되므로 private으로 막아줌
    // final로 변경을 막아줌
    // static으로 전역에서 접근 가능하도록 함
    private final static CompanySingleton instance = new CompanySingleton();

    private CompanySingleton() {
        // 컨스트럭터 없으면 JVM이 pre-compile 단계에서 만들어줌
        // 만약 이 blank를 선언하지 않으면 자동으로 public으로 선언되고, new 키워드로 여러개의 인스턴스를 생성할 수 있게 됨
        // private으로 차단
    }

    // static 변수 이므로, 인스턴스 메서드 말고 클래스 메서드로 선언
    public static CompanySingleton getInstance() {
        return instance;
    }

}
