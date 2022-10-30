package org.example.rpg.item;

//Eliksiry zwykłe mogą odnowić obecny stan zdrowia, magii lub siły gracza po wypiciu (w zależności od eliksiru)
public class NormalElixir extends Elixir {
    NormalElixir(Integer valueInGold, Integer weight) {
        super(valueInGold, weight);
    }
}
