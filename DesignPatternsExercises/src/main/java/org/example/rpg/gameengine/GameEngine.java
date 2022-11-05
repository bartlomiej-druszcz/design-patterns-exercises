package org.example.rpg.gameengine;

import org.example.rpg.gamecharacter.*;
import org.example.rpg.gamecharacter.characteristic.Race;

import java.util.ArrayList;
import java.util.List;

public enum GameEngine {
    INSTANCE;

    private List<GameCharacter> characterList = new ArrayList<>();

    GameEngine() {

    }

    public List<GameCharacter> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<GameCharacter> characterList) {
        this.characterList = characterList;
    }

    public void start() {
        GameCharacterFactory characterFactory = new GameCharacterFactory();
        GameCharacter player = characterFactory.createGameCharacter(Race.HUMAN);
        GameCharacter elf = characterFactory.createGameCharacter(Race.ELF);
        GameCharacter dwarf = characterFactory.createGameCharacter(Race.DWARF);
        GameCharacter monster = characterFactory.createGameCharacter(Race.MONSTER);
        GameCharacter merchant = characterFactory.createGameCharacter(Race.MERCHANT);

        characterList.add(player);
        characterList.add(elf);
        characterList.add(dwarf);
        characterList.add(monster);
        characterList.add(merchant);

    }

    public void play(){
        System.out.println("Gram!");
    }
}
