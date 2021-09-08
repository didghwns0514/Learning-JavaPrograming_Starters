package com.main.Chapter2.template.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainGameTest {

    @Test
    @DisplayName("전체 게임 패키지 테스트")
    void mainGameTest() {
        Player player = new Player();
        player.play(1);

        AdvancedLevel advancedLevel = new AdvancedLevel();
        player.upgradeLevel(advancedLevel);
        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);
    }
}
