package com.company;

public class Main {
    public static void main(String[] args) {
        Colt colt = new Colt();
//        colt.shoot();
//        colt.recharge();

        GrenadeLauncher grenadeLauncher = new GrenadeLauncher();
//        grenadeLauncher.shoot();
//        grenadeLauncher.recharge();
//
//        Weapon weapon = new Colt();
//        weapon.shoot();
//
//        weapon = new GrenadeLauncher();
//        weapon.recharge();

        Weapon[] weapons = {grenadeLauncher, colt};
        for (Weapon w :
                weapons) {
            w.shoot();
            w.recharge();
        }

        Object object = new Colt();
        ((Colt) object).recharge();

    }
}
