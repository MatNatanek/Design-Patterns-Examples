package com.natanek.templete;

public abstract class CaffeineBeverage {

    public void prepareBeverage() {
        boilWater();
        brewBeverage();
        pourWaterInCup();
    }

    protected abstract void brewBeverage();

    private void pourWaterInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
