package org.example.rpg.item;

//Artefakty mogą zwiększać punkty zdrowia, magii lub siły (w zależności od artefaktu, dopóki są założone)
public abstract class Artifact extends Item {
    protected Artifact(Integer valueInGold, Integer weight, Integer additionalHealthPoints, Integer additionalMagicPoints, Integer additionalStrengthPoints) {
        super(valueInGold, weight, additionalHealthPoints, additionalMagicPoints, additionalStrengthPoints);
    }
}
