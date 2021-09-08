package com.main.Chapter2.template.game;

public class BeginnerLevel extends PlayerLevel {

    public BeginnerLevel() {
        super.setLevel("초보자");
    }

    @Override
    public void run() {
        System.out.println("느리게 달리는 중!");
    }

    @Override
    public void jump() {
        System.out.println("낮게 점프하는 중!");
    }

    @Override
    public void turn() {
        System.out.println("초보자용 공격!");
    }


}
