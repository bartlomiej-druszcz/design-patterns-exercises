package org.example.rpg.item;

import java.util.ArrayList;
import java.util.List;

public class ItemFactory {

    public Item createItem(ItemType itemType) {
        return switch (itemType) {
            case SWORD -> new Sword(10, 15, itemType);
            case ARMOR -> new Armor(20, 10, itemType);
            case ARTIFACT_HEALTH,
                    ARTIFACT_MAGIC,
                    ARTIFACT_STRENGTH -> new Artifact(5, 5, itemType);
            case NORMAL_ELIXIR_HEALTH,
                    NORMAL_ELIXIR_MAGIC,
                    NORMAL_ELIXIR_STRENGTH -> new NormalElixir(10, 1, itemType);
            case PERMANENT_ELIXIR_HEALTH,
                    PERMANENT_ELIXIR_MAGIC,
                    PERMANENT_ELIXIR_STRENGTH -> new PermanentElixir(15, 1, itemType);
            default -> throw new IllegalArgumentException("Unknown type of items!");
        };
    }

    public List<Item> createItemStartEquipmentForHuman() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(createItem(ItemType.SWORD));
        itemList.add(createItem(ItemType.ARTIFACT_HEALTH));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_STRENGTH));
        return itemList;
    }

    public List<Item> createItemStartEquipmentForElf() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(createItem(ItemType.ARTIFACT_HEALTH));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_STRENGTH));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_HEALTH));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_MAGIC));
        itemList.add(createItem(ItemType.PERMANENT_ELIXIR_MAGIC));
        return itemList;
    }

    public List<Item> createItemStartEquipmentForDwarf() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(createItem(ItemType.ARMOR));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_STRENGTH));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_HEALTH));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_MAGIC));
        itemList.add(createItem(ItemType.PERMANENT_ELIXIR_STRENGTH));
        return itemList;
    }

    public List<Item> createItemStartEquipmentForMerchant() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(createItem(ItemType.SWORD));
        itemList.add(createItem(ItemType.ARMOR));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_STRENGTH));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_HEALTH));
        itemList.add(createItem(ItemType.NORMAL_ELIXIR_MAGIC));
        itemList.add(createItem(ItemType.PERMANENT_ELIXIR_STRENGTH));
        itemList.add(createItem(ItemType.PERMANENT_ELIXIR_MAGIC));
        itemList.add(createItem(ItemType.PERMANENT_ELIXIR_HEALTH));
        return itemList;
    }
}
