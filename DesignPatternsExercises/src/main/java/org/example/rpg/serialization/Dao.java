package org.example.rpg.serialization;

public interface Dao<T> {

    void save();

    T read();
}
