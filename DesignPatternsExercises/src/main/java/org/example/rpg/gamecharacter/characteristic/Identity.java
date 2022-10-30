package org.example.rpg.gamecharacter.characteristic;

public class Identity {
    private final Race race;
    private final String playerName;

    public Identity(Race race, String playerName) {
        this.race = race;
        this.playerName = playerName;
    }

    public Race getRace() {
        return race;
    }

    public String getPlayerName() {
        return playerName;
    }
}
