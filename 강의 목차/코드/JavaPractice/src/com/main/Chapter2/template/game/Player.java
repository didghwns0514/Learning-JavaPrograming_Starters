package com.main.Chapter2.template.game;

public class Player {

    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
        this.level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void setLevel(PlayerLevel level) {
        this.level = level; //업캐스팅 발생
    }


    public void upgradeLevel(PlayerLevel playerLevel) {
        setLevel(playerLevel);
        playerLevel.showLevelMessage();
    }

    public void play(int level) {
        this.level.gamePlay(level);
    }
}
