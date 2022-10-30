package org.example.rpg.gamecharacter.builder;

import org.example.rpg.gamecharacter.Monster;
import org.example.rpg.gamecharacter.characteristic.*;
import org.example.rpg.interfaces.builder.MonsterBuilderInterface;

public class MonsterBuilder implements MonsterBuilderInterface {
    private Monster monster;

    public MonsterBuilder() {
        this.monster = new Monster();
    }

    @Override
    public void buildIdentity() {
        this.getMonster().setIdentity(new Identity(Race.MONSTER, "Monster"));
    }

    @Override
    public void buildStatistics() {
        this.getMonster().setStatisticsOfPlayer(new Statistics(150, 150, 150));
    }

    @Override
    public Monster getMonster() {
        return monster;
    }

    public Monster create() {
        this.buildIdentity();
        this.buildStatistics();
        return getMonster();
    }
}
