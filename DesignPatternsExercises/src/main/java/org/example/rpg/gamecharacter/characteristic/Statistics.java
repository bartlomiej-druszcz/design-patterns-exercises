package org.example.rpg.gamecharacter.characteristic;

import org.example.rpg.exception.WrongActivityException;

//Statistics mogą się wyczerpywać oraz odnawiać.
// Ich maksymalny poziom może być powiększany na stałe za pomocą eliksirów oraz tymczasowo za pomocą przedmiotów z ekwipunku.
public class Statistics {
    private Integer healthPoints;
    private Integer magicPoints;
    private Integer strengthPoints;

    public Statistics(Integer healthPoints, Integer magicPoints, Integer strengthPoints) {
        this.healthPoints = healthPoints;
        this.magicPoints = magicPoints;
        this.strengthPoints = strengthPoints;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void addHealthPoints(Integer healthPoints) {
        this.healthPoints += healthPoints;
    }

    public void subtractHealthPoints(Integer healthPoints) throws WrongActivityException {
        if (this.healthPoints <= healthPoints) {
            throw new WrongActivityException("This action cannot be performed. Not enough health points. You will lose!");
        } else {
            this.healthPoints -= healthPoints;
        }
    }

    public Integer getMagicPoints() {
        return magicPoints;
    }

    public void addMagicPoints(Integer magicPoints) {
        this.magicPoints += magicPoints;
    }

    public void subtractMagicPoints(Integer magicPoints) throws WrongActivityException {
        if (this.magicPoints <= magicPoints) {
            throw new WrongActivityException("This action cannot be performed. Not enough magic points. You will lose!");
        } else {
            this.magicPoints -= magicPoints;
        }
    }

    public Integer getStrengthPoints() {
        return strengthPoints;
    }

    public void addStrengthPoints(Integer strengthPoints) {
        this.strengthPoints += strengthPoints;
    }

    public void subtractStrengthPoints(Integer strengthPoints) throws WrongActivityException {
        if (this.strengthPoints <= strengthPoints) {
            throw new WrongActivityException("This action cannot be performed. Not enough strength points. You will lose!");
        } else {
            this.strengthPoints -= strengthPoints;
        }
    }
}
