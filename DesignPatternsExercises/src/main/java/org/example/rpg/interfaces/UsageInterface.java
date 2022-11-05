package org.example.rpg.interfaces;

import org.example.rpg.item.Item;

public interface UsageInterface {
    void use(Item item);

    void putDown(Item item);
}
