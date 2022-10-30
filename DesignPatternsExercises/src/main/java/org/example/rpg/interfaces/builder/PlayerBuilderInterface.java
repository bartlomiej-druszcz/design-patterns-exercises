package org.example.rpg.interfaces.builder;

import org.example.rpg.gamecharacter.Player;

public interface PlayerBuilderInterface extends IdentityBuilderInterface, EquipmentBuilderInterface, StatisticsBuilderInterface {
    Player getPlayer();
}
