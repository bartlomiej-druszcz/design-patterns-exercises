package org.example.rpg.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.rpg.gameengine.GameEngine;

import java.io.*;

public class JSON_IO extends Serialization {

    JSON_IO(String path, String fileName) {
        super(path, fileName);
    }

    @Override
    void writeToFile(GameEngine gameEngine) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(super.getPath() + "\\" + super.getFileName() +
                this.extension)) {
            gson.toJson(gameEngine, writer);
        } catch (IOException e) {
            System.out.println("Error -> IOException");
        }
    }

    @Override
    GameEngine readFromFile() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(super.getPath() + "\\" + super.getFileName() +
                this.extension)) {
            return gson.fromJson(reader, GameEngine.class);
        } catch (IOException e) {
            System.out.println("Error -> IOException");
        }
        return null;
    }

    @Override
    void setExtension() {
        this.extension = ".json";
    }
}