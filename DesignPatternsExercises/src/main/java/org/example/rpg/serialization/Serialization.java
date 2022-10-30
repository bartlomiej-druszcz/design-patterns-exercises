package org.example.rpg.serialization;

import org.example.rpg.gameengine.GameEngine;

public abstract class Serialization {

    private String path;
    private String fileName;
    protected String extension;

    Serialization(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
        setExtension();
    }

    abstract void writeToFile(GameEngine gameEngine);

    abstract GameEngine readFromFile();

    abstract void setExtension();

    String getPath() {
        return path;
    }

    String getFileName() {
        return fileName;
    }

    String getExtension() {
        return extension;
    }
}
