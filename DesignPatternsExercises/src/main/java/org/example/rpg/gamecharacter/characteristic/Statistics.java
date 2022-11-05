package org.example.rpg.gamecharacter.characteristic;

public class Statistics {
    private Integer healthPoints;
    private Integer magicPoints;
    private Integer strengthPoints;

    public Statistics(Integer healthPoints, Integer magicPoints, Integer strengthPoints) {
        this.healthPoints = healthPoints;
        this.magicPoints = magicPoints;
        this.strengthPoints = strengthPoints;
    }

    public void updateHealthPointsBy(Integer healthPoints) {
        if (this.healthPoints + healthPoints <= 0) {
            throw new IllegalArgumentException("You will lost! Game over!");
        } else if (this.healthPoints + healthPoints <= 5) {
            throw new IllegalArgumentException("Use elixir, armor  or artifact!");
        } else {
            this.healthPoints += healthPoints;
        }
    }

    public void updateMagicPointsBy(Integer magicPoints) {
        if (this.magicPoints + magicPoints <= 0) {
            throw new IllegalArgumentException("Use elixir or artifact!");
        } else {
            this.magicPoints += magicPoints;
        }
    }

    public void updateStrengthPointsBy(Integer strengthPoints) {
        if (this.strengthPoints + strengthPoints <= 0) {
            throw new IllegalArgumentException("Use elixir, sword  or artifact!");
        } else {
            this.strengthPoints += strengthPoints;
        }
    }

    @Override
    public String toString() {
        return "Statistics {" +
                "healthPoints = " + healthPoints +
                ", magicPoints = " + magicPoints +
                ", strengthPoints = " + strengthPoints +
                '}';
    }
}
