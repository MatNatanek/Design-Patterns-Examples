package com.natanek.adapter;

public class Client {
    public static void main(String[] args) {
        final Fighter knight = new Knight();
        final Fighter fighter = new WizardAdapter();

        testFighter(knight);
        testFighter(fighter);
    }

    static void testFighter(Fighter fighter) {
        fighter.attack();
    }

}
