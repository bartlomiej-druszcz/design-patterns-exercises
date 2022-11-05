package org.example.rpg.gamecharacter;

import org.example.rpg.gamecharacter.characteristic.*;

public abstract class GameCharacter {
    private Identity identity;
    private Statistics statisticsOfPlayer;

    public GameCharacter(Identity identity, Statistics statisticsOfPlayer) {
        this.identity = identity;
        this.statisticsOfPlayer = statisticsOfPlayer;
    }

    public Identity getIdentity() {
        return identity;
    }

    public Statistics getStatisticsOfPlayer() {
        return statisticsOfPlayer;
    }

    @Override
    public String toString() {
        return "GameCharacter {" +
                "\nidentity = " + identity +
                ",\nstatisticsOfPlayer = " + statisticsOfPlayer +
                "}\n";
    }
}
