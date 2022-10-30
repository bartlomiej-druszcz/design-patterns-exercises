package org.example.rpg.gamecharacter.builder;

import org.example.rpg.gamecharacter.Merchant;
import org.example.rpg.gamecharacter.characteristic.*;
import org.example.rpg.interfaces.builder.MerchantBuilderInterface;

public class MerchantBuilder implements MerchantBuilderInterface {
    private Merchant merchant;

    public MerchantBuilder() {
        this.merchant = new Merchant();
    }

    @Override
    public void buildIdentity() {
        this.getMerchant().setIdentity(new Identity(Race.MERCHANT, "Merchant"));
    }

    @Override
    public void buildEquipment() {
        this.getMerchant().setEquipmentOfPlayer(new Equipment(null, 150, 1000));
    }

    @Override
    public Merchant getMerchant() {
        return merchant;
    }

    public Merchant create() {
        this.buildIdentity();
        this.buildEquipment();
        return getMerchant();
    }
}
