package com.natanek.templete;

public class CoffeeBeverage extends CaffeineBeverage {
    @Override
    protected void brewBeverage() {
        System.out.println("Brewing coffee");
    }
}
