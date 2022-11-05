package org.example.rpg.interfaces;

import org.example.rpg.item.Item;

import javax.management.OperationsException;

public interface PlacementInterface {
    void putIntoEquipment(Item item) throws OperationsException;
}
