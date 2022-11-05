package org.example.rpg.item;

public abstract class Item {
    private final Integer valueInGold;
    private final Integer weight;
    private final ItemType itemType;

    protected Item(Integer valueInGold, Integer weight, ItemType itemType) {
        this.valueInGold = valueInGold;
        this.weight = weight;
        this.itemType = itemType;
    }

    public Integer getValueInGold() {
        return valueInGold;
    }

    public Integer getWeight() {
        return weight;
    }

    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return "Item {" +
                "valueInGold = " + valueInGold +
                ", weight = " + weight +
                ", itemType = " + itemType +
                '}';
    }
}
