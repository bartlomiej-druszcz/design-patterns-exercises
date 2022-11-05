package org.example.rpg.item;

public enum ItemType {
    ARMOR(50, 0, 0),
    SWORD(0, 0, 100),
    ARTIFACT_HEALTH(100, 0, 0),
    ARTIFACT_MAGIC(0, 100, 0),
    ARTIFACT_STRENGTH(0, 0, 100),
    NORMAL_ELIXIR_HEALTH(50, 0, 0),
    NORMAL_ELIXIR_MAGIC(0, 50, 0),
    NORMAL_ELIXIR_STRENGTH(0, 0, 50),
    PERMANENT_ELIXIR_HEALTH(200, 0, 0),
    PERMANENT_ELIXIR_MAGIC(0, 200, 0),
    PERMANENT_ELIXIR_STRENGTH(0, 0, 200);

    private Integer additionalHealthPoints;
    private Integer additionalMagicPoints;
    private Integer additionalStrengthPoints;

    ItemType(Integer additionalHealthPoints, Integer additionalMagicPoints, Integer additionalStrengthPoints) {
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
