package com.natanek.templete;

public class TeaBeverage extends CaffeineBeverage {
    @Override
    protected void brewBeverage() {
        System.out.println("Brewing tea");
    }
}
