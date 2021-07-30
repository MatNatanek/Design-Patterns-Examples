package com.natanek.strategy;


public class Client {
    public static void main(String[] args) {
        final AxeBehavior axeBehavior = new AxeBehavior();
        final BowBehavior bowBehavior = new BowBehavior();
        final Warrior warrior = new Warrior();

        warrior.setWeapon(axeBehavior);
        warrior.attack();
        warrior.setWeapon(bowBehavior);
        warrior.attack();

    }
}
