package org.example.rpg.item;

public abstract class Elixir extends Item {
    protected Elixir(Integer valueInGold, Integer weight) {
        super(valueInGold, weight, 0,0,0);
    }
}
