package com.main.Chapter2.abstractEx;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TotalComputerTest {

    @Test
    @DisplayName("컴퓨터 추상클래스 종합 테스트")
    void allTest() {

        Computer com1 = new Computer() {
            @Override
            public void display() {
                System.out.println("Com 원래 인스턴스 안됨, 이방식도 있음");
            }

            @Override
            public void typing() {
                System.out.println("Com 원래 인스턴스 안됨, 이방식도 있음");

            }
        };

        Computer com2 = new DeskTop(); // 업캐스팅과 동일, 가상메서드 동작
        Computer com3 = new Notebook() {
            @Override
            public void typing() {
                // com1 과 동일
            }
        };

        Notebook com4 = new PersonalNotebook();

        com2.display();
        com4.display();

    }
}
