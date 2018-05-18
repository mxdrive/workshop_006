package com.company;

public class GrenadeLauncher implements Weapon {
    private int cartridgeQuantity;
    private int damage;

    GrenadeLauncher() {
        cartridgeQuantity = 1;
        damage = -30;
    }

    @Override
    public int shoot() {
        cartridgeQuantity--;
        System.out.printf("You inflicted damage on your opponent using Grenade Launcher: %s. %s cartridges left\n", damage, cartridgeQuantity);
        return -damage;
    }

    @Override
    public void recharge() {
        cartridgeQuantity = 1;
        System.out.printf("You have %s cartridges!\n", cartridgeQuantity);
    }
}
