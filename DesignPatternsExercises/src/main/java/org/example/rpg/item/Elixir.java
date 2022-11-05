package org.example.rpg.item;

public abstract class Elixir extends Item {
    protected Elixir(Integer valueInGold, Integer weight, ItemType itemType) {
        super(valueInGold, weight, itemType);
    }
}
