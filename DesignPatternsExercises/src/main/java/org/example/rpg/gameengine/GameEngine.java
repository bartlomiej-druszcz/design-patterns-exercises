package org.example.rpg.gameengine;

import org.example.rpg.gamecharacter.GameCharacter;
import org.example.rpg.gamecharacter.builder.*;

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

    public void run() {
        GameCharacter player = new HumanBuilder().create();
        GameCharacter elf = new ElfBuilder().create();
        GameCharacter dwarf = new DwarfBuilder().create();
        GameCharacter monster = new MonsterBuilder().create();
        GameCharacter merchant = new MerchantBuilder().create();

        characterList.add(player);
        characterList.add(elf);
        characterList.add(dwarf);
        characterList.add(monster);
        characterList.add(merchant);

        boolean flag = true;
        while (flag) {
            if (true)
                flag = false;
            System.out.println("Game over!");
        }
    }
}
