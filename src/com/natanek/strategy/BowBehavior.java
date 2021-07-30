package com.natanek.strategy;

public class BowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using bow");
    }
}
