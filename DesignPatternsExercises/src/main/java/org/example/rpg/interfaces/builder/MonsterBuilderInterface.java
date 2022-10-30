package org.example.rpg.interfaces.builder;

import org.example.rpg.gamecharacter.Monster;

public interface MonsterBuilderInterface extends StatisticsBuilderInterface, IdentityBuilderInterface {
    Monster getMonster();
}
