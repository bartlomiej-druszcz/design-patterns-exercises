package org.example.rpg.gamecharacter;

import org.example.rpg.gamecharacter.characteristic.*;

public class Player extends GameCharacterWithEquipment {
    public Player(Identity identity, Statistics statisticsOfPlayer, Equipment equipmentOfPlayer) {
        super(identity, statisticsOfPlayer, equipmentOfPlayer);
    }

    @Override
    public String toString() {
        return "Player {" +
                "\nidentity = " + super.getIdentity() +
                ",\nstatisticsOfPlayer = " + super.getStatisticsOfPlayer() +
                ",\nequipmentOfPlayer = " + super.getEquipmentOfPlayer() +
                "}\n";
    }
}
