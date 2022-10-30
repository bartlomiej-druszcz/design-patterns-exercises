package org.example.rpg;

import org.example.rpg.gameengine.GameEngine;

public class Main {
    public static void main(String[] args) {
        GameEngine gameEngine = GameEngine.INSTANCE;

        gameEngine.run();

    }
}
