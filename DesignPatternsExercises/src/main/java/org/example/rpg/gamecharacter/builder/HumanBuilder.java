package org.example.rpg.gamecharacter.builder;

import org.example.rpg.gamecharacter.characteristic.*;

public class HumanBuilder extends PlayerBuilder {
    public HumanBuilder() {
        super();
    }

    @Override
    public void buildIdentity() {
        this.getPlayer().setIdentity(new Identity(Race.HUMAN, "Human"));
    }

    @Override
    public void buildStatistics() {
        this.getPlayer().setStatisticsOfPlayer(new Statistics(100, 0, 30));
    }

    @Override
    public void buildEquipment() {
        this.getPlayer().setEquipmentOfPlayer(new Equipment(null, 50, 5));
    }
}
