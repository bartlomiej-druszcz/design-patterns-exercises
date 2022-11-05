package org.example.rpg.gamecharacter;

import org.example.rpg.gamecharacter.characteristic.Equipment;
import org.example.rpg.gamecharacter.characteristic.Identity;
import org.example.rpg.gamecharacter.characteristic.Statistics;
import org.example.rpg.interfaces.PlacementInterface;
import org.example.rpg.interfaces.PurchaseInterface;
import org.example.rpg.interfaces.SalesInterface;
import org.example.rpg.interfaces.UsageInterface;
import org.example.rpg.item.Item;

import javax.management.OperationsException;

public class GameCharacterWithEquipment extends GameCharacter implements UsageInterface, PurchaseInterface, SalesInterface, PlacementInterface {
    private Equipment equipmentOfPlayer;

    public GameCharacterWithEquipment(Identity identity, Statistics statisticsOfPlayer, Equipment equipmentOfPlayer) {
        super(identity, statisticsOfPlayer);
        this.equipmentOfPlayer = equipmentOfPlayer;
    }

    public Equipment getEquipmentOfPlayer() {
        return equipmentOfPlayer;
    }

    @Override
    public void putIntoEquipment(Item item) throws OperationsException {
        if (item.getWeight() > equipmentOfPlayer.getLiftingCapacityLimit() - equipmentOfPlayer.weightEquipment()) {
            throw new OperationsException("Item cannot be added.");
        } else {
            equipmentOfPlayer.getItemList().add(item);
        }
    }

    @Override
    public void use(Item item) {
        super.getStatisticsOfPlayer().updateHealthPointsBy(item.getItemType().getAdditionalHealthPoints());
        super.getStatisticsOfPlayer().updateMagicPointsBy(item.getItemType().getAdditionalMagicPoints());
        super.getStatisticsOfPlayer().updateStrengthPointsBy(item.getItemType().getAdditionalStrengthPoints());
    }

    @Override
    public void putDown(Item item) {
        super.getStatisticsOfPlayer().updateHealthPointsBy(-(item.getItemType().getAdditionalHealthPoints()));
        super.getStatisticsOfPlayer().updateMagicPointsBy(-(item.getItemType().getAdditionalMagicPoints()));
        super.getStatisticsOfPlayer().updateStrengthPointsBy(-(item.getItemType().getAdditionalStrengthPoints()));
    }

    @Override
    public void buy(Item item) throws OperationsException {
        if (equipmentOfPlayer.getAmountOfGold() >= item.getValueInGold()) {
            putIntoEquipment(item);
            equipmentOfPlayer.setAmountOfGold(equipmentOfPlayer.getAmountOfGold() - item.getValueInGold());
        } else {
            throw new OperationsException("Not enough money.");
        }
    }

    @Override
    public void sell(Item item) {
        equipmentOfPlayer.getItemList().remove(item);
        equipmentOfPlayer.setAmountOfGold(equipmentOfPlayer.getAmountOfGold() + item.getValueInGold());
    }
}
