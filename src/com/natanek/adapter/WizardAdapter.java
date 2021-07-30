package com.natanek.adapter;

public class WizardAdapter implements Fighter {
    private final Wizard wizard = new Wizard();

    @Override
    public void attack() {
        wizard.castSpell();
    }
}
