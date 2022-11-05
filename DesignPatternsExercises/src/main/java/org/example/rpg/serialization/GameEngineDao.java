package org.example.rpg.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.rpg.gameengine.GameEngine;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class GameEngineDao implements Dao<GameEngine> {
    GameEngine gameEngine = GameEngine.INSTANCE;

    @Override
    public void save() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("C:\\Users\\bartl\\Desktop\\gra.json")) {
            gson.toJson(gameEngine, writer);
        } catch (IOException e) {
            System.out.println("Error -> IOException");
        }
    }

    @Override
    public GameEngine read() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader("C:\\Users\\bartl\\Desktop\\gra.json")) {
            return gson.fromJson(reader, GameEngine.class);
        } catch (IOException e) {
            System.out.println("Error -> IOException");
        }
        return null;
    }
}
