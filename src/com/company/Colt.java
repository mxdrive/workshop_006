package com.company;

public class Colt implements Weapon {
    private int cartridgeQuantity;
    private int damage;

    Colt() {
        cartridgeQuantity = 6;
        damage = -10;
    }

    @Override
    public int shoot() {
        cartridgeQuantity--;
        System.out.printf("You inflicted damage on your opponent using Colt: %s. %s cartridges left\n", damage, cartridgeQuantity);
        return -damage;
    }

    @Override
    public void recharge() {
        cartridgeQuantity = 6;
        System.out.printf("You have %s cartridges!\n", cartridgeQuantity);
    }

    public void setCartridgeQuantity(int cartridgeQuantity) {
        this.cartridgeQuantity = cartridgeQuantity;
    }
}

