package com.natanek.strategy;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using Axe");
    }
}
