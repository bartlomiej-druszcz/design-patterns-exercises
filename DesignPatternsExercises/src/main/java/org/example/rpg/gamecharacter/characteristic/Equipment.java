package org.example.rpg.gamecharacter.characteristic;

import org.example.rpg.item.*;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private List<Item> itemList = new ArrayList<>();
    private Integer liftingCapacityLimit;
    private Integer amountOfGold;

    public Equipment(List<Item> itemList, Integer liftingCapacityLimit, Integer amountOfGold) {
        this.itemList = itemList;
        this.liftingCapacityLimit = liftingCapacityLimit;
        this.amountOfGold = amountOfGold;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public Integer getLiftingCapacityLimit() {
        return liftingCapacityLimit;
    }

    public Integer getAmountOfGold() {
        return amountOfGold;
    }
}
