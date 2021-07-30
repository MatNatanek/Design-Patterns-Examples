package com.natanek.strategy;

public class Warrior {
    private WeaponBehavior weaponBehavior;

    public void attack() {
        weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
