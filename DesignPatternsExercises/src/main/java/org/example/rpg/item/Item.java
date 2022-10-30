package org.example.rpg.item;

public abstract class Item {
    private final Integer valueInGold;
    private final Integer weight;
    private final Integer additionalHealthPoints;
    private final Integer additionalMagicPoints;
    private final Integer additionalStrengthPoints;

    protected Item(Integer valueInGold, Integer weight, Integer additionalHealthPoints, Integer additionalMagicPoints, Integer additionalStrengthPoints) {
        this.valueInGold = valueInGold;
        this.weight = weight;
        this.additionalHealthPoints = additionalHealthPoints;
        this.additionalMagicPoints = additionalMagicPoints;
        this.additionalStrengthPoints = additionalStrengthPoints;
    }

    public Integer getAdditionalHealthPoints() {
        return additionalHealthPoints;
    }

    public Integer getAdditionalMagicPoints() {
        return additionalMagicPoints;
    }

    public Integer getAdditionalStrengthPoints() {
        return additionalStrengthPoints;
    }
}
