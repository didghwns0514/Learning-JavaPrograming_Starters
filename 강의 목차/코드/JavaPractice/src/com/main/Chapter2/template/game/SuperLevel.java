package com.main.Chapter2.template.game;

public class SuperLevel extends PlayerLevel {

    public SuperLevel() {
        super.setLevel("상급자");
    }

    @Override
    public void run() {
        System.out.println("아주 빠르게 달리는 중!");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 점프하는 중!");
    }

    @Override
    public void turn() {
        System.out.println("상급자용 공격!");
    }

    @Override
    public void specialAction() {
        System.out.println("상급 freezing 기술!!!");
    }
}
