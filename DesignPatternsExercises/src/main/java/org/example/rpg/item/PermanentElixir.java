package org.example.rpg.item;

//Eliksiry trwałe mogą na stałe zwiększać zdrowie, magię lub siłę gracza po wypiciu (w zależności od eliksiru)
public class PermanentElixir extends Elixir {
    PermanentElixir(Integer valueInGold, Integer weight) {
        super(valueInGold, weight);
    }
}
