package org.example.rpg.gamecharacter.characteristic;

public class Identity {
    private final Race race;
    private final String playerName;

    public Identity(Race race, String playerName) {
        this.race = race;
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "Identity {" +
                "race = " + race +
                ", playerName = '" + playerName + '\'' +
                '}';
    }
}
