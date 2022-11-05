package org.example.rpg.gamecharacter;

import org.example.rpg.gamecharacter.characteristic.*;

public class Monster extends GameCharacter {
    public Monster(Identity identity, Statistics statisticsOfPlayer) {
        super(identity, statisticsOfPlayer);
    }

    @Override
    public String toString() {
        return "Monster {" +
                "\nidentity = " + super.getIdentity() +
                ",\nstatisticsOfPlayer = " + super.getStatisticsOfPlayer() +
                "}\n";
    }
}
