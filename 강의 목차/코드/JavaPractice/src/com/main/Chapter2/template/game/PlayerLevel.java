package com.main.Chapter2.template.game;

public abstract class PlayerLevel {

    private String level;


    public abstract void run();

    public abstract void jump();

    public abstract void turn();

    public void specialAction() {
    }

    public void showLevelMessage() {
        System.out.println(getLevel() + " 레벨입니다!");
    }

    final public void gamePlay(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
        specialAction();

    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
