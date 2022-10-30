package org.example.rpg.gamecharacter;

import org.example.rpg.exception.WrongActivityException;
import org.example.rpg.gamecharacter.characteristic.Equipment;
import org.example.rpg.gamecharacter.characteristic.Identity;
import org.example.rpg.gamecharacter.characteristic.Statistics;
import org.example.rpg.interfaces.PlacementInterface;
import org.example.rpg.interfaces.PurchaseInterface;
import org.example.rpg.interfaces.SalesInterface;
import org.example.rpg.interfaces.UsageInterface;
import org.example.rpg.item.Item;

public abstract class GameCharacter implements UsageInterface, PlacementInterface, PurchaseInterface, SalesInterface {
    private Identity identity;
    private Statistics statisticsOfPlayer;
    private Equipment equipmentOfPlayer;

    public GameCharacter() {

    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public void setStatisticsOfPlayer(Statistics statisticsOfPlayer) {
        this.statisticsOfPlayer = statisticsOfPlayer;
    }

    public void setEquipmentOfPlayer(Equipment equipmentOfPlayer) {
        this.equipmentOfPlayer = equipmentOfPlayer;
    }

    @Override
    public void use(Item item) {

        statisticsOfPlayer.addHealthPoints(item.getAdditionalHealthPoints());
        statisticsOfPlayer.addMagicPoints(item.getAdditionalMagicPoints());
        statisticsOfPlayer.addStrengthPoints(item.getAdditionalStrengthPoints());
    }

    @Override
    public void putDown(Item item) throws WrongActivityException {
        statisticsOfPlayer.subtractStrengthPoints(item.getAdditionalHealthPoints());
        statisticsOfPlayer.subtractMagicPoints(item.getAdditionalMagicPoints());
        statisticsOfPlayer.subtractStrengthPoints(item.getAdditionalStrengthPoints());
    }

    @Override
    public void putIntoEquipment(Item item) {

    }

    @Override
    public void buy(Item item) {

    }

    @Override
    public void sell(Item item) {

    }
}
