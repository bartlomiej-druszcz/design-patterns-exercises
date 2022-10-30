package org.example.rpg.interfaces.builder;

import org.example.rpg.gamecharacter.Merchant;

public interface MerchantBuilderInterface extends EquipmentBuilderInterface, IdentityBuilderInterface {
    Merchant getMerchant();
}
