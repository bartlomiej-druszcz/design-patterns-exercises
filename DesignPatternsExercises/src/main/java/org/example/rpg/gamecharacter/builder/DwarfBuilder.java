package org.example.rpg.gamecharacter.builder;

import org.example.rpg.gamecharacter.characteristic.*;

public class DwarfBuilder extends PlayerBuilder {
    public DwarfBuilder() {
        super();
    }

    @Override
    public void buildIdentity() {
        this.getPlayer().setIdentity(new Identity(Race.DWARF, "Dwarf"));
    }

    @Override
    public void buildStatistics() {
        this.getPlayer().setStatisticsOfPlayer(new Statistics(40, 60, 20));
    }

    @Override
    public void buildEquipment() {
        this.getPlayer().setEquipmentOfPlayer(new Equipment(null, 35, 50));
    }
}
