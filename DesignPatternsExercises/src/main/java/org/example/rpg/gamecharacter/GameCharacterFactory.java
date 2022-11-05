package org.example.rpg.gamecharacter;

import org.example.rpg.gamecharacter.characteristic.*;
import org.example.rpg.item.ItemFactory;

public class GameCharacterFactory {
    public GameCharacter createGameCharacter(Race gameCharacter) {
        ItemFactory factory = new ItemFactory();
        return switch (gameCharacter) {
            case HUMAN -> new Player(new Identity(Race.HUMAN, "Human"),
                    new Statistics(100, 0, 30),
                    new Equipment(factory.createItemStartEquipmentForHuman(), 50, 5));
            case DWARF -> new Player(new Identity(Race.DWARF, "Dwarf"),
                    new Statistics(40, 60, 20),
                    new Equipment(factory.createItemStartEquipmentForDwarf(), 35, 50));
            case ELF -> new Player(new Identity(Race.ELF, "Elf"),
                    new Statistics(50, 50, 10),
                    new Equipment(factory.createItemStartEquipmentForElf(), 25, 10));
            case MERCHANT -> new Merchant(new Identity(Race.MERCHANT, "Merchant"),
                    new Statistics(100, 0, 50),
                    new Equipment(factory.createItemStartEquipmentForMerchant(), 150, 1000));
            case MONSTER -> new Monster(new Identity(Race.MONSTER, "Monster"),
                    new Statistics(150, 150, 150));
            default -> throw new IllegalArgumentException("Unknown type of game character!");
        };
    }
}
