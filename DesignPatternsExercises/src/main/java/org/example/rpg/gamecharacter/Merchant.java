package org.example.rpg.gamecharacter;

import org.example.rpg.gamecharacter.characteristic.*;

public class Merchant extends GameCharacterWithEquipment {
    public Merchant(Identity identity, Statistics statisticsOfPlayer, Equipment equipmentOfPlayer) {
        super(identity, statisticsOfPlayer, equipmentOfPlayer);
    }

    @Override
    public String toString() {
        return "Merchant {" +
                "\nidentity = " + super.getIdentity() +
                ",\nstatisticsOfPlayer = " + super.getStatisticsOfPlayer() +
                ",\nequipmentOfPlayer = " + super.getEquipmentOfPlayer() +
                "}\n";
    }
}
