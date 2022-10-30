package org.example.rpg.gamecharacter.builder;

import org.example.rpg.gamecharacter.Player;
import org.example.rpg.interfaces.builder.PlayerBuilderInterface;

public abstract class PlayerBuilder implements PlayerBuilderInterface {
    private Player player;

    PlayerBuilder() {
        this.player = new Player();
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    public Player create() {
        this.buildIdentity();
        this.buildStatistics();
        this.buildEquipment();
        return getPlayer();
    }
}
