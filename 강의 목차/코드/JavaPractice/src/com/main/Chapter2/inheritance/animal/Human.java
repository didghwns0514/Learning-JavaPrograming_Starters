package com.main.Chapter2.inheritance.animal;

public class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void read() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
