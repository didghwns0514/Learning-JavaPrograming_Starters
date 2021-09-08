package com.main.Chapter2.template.game;

public class AdvancedLevel extends PlayerLevel {

    public AdvancedLevel() {
        super.setLevel("중급자");
    }

    @Override
    public void run() {
        System.out.println("빠르게 달리는 중!");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프하는 중!");
    }

    @Override
    public void turn() {
        System.out.println("중급자용 공격!");
    }

    @Override
    public void specialAction() {
        System.out.println("중급 회피기술 발동!!");
    }
}
