package org.example.rpg.gamecharacter.builder;

import org.example.rpg.gamecharacter.characteristic.*;

public class ElfBuilder extends PlayerBuilder {
    public ElfBuilder() {
        super();
    }

    @Override
    public void buildIdentity() {
        this.getPlayer().setIdentity(new Identity(Race.ELF, "Elf"));
    }

    @Override
    public void buildStatistics() {
        this.getPlayer().setStatisticsOfPlayer(new Statistics(50, 50, 10));
    }

    @Override
    public void buildEquipment() {
        this.getPlayer().setEquipmentOfPlayer(new Equipment(null, 25, 10));
    }
}
