package org.example.rpg.item;

import org.example.rpg.exception.UnknownOperationException;

public class ItemFactory {

    public Item createItem(ItemType itemType) throws UnknownOperationException {
        return switch (itemType) {
            case SWORD -> new Sword(10, 15);
            case ARMOR -> new Armor(20, 10);
            case ARTIFACT -> new ArtifactHealth(5, 5);
            case NORMAL_ELIXIR -> new NormalElixir(10, 1);
            case PERMANENT_ELIXIR -> new PermanentElixir(15, 1);
            default -> throw new UnknownOperationException("Unknown type of items!");
        };
    }
}
