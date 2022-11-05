package org.example.rpg.interfaces;

import org.example.rpg.item.Item;

import javax.management.OperationsException;

public interface PurchaseInterface {
    void buy(Item item) throws OperationsException;
}
