package org.example.rpg;

import org.example.rpg.gameengine.GameEngine;
import org.example.rpg.serialization.GameEngineDao;

public class Main {
    public static void main(String[] args) {
        GameEngineDao game = new GameEngineDao();
        GameEngine gameEngine = game.read();

//        gameEngine.start();
        gameEngine.play();

        System.out.println(gameEngine.getCharacterList());
        game.save();
    }
}
