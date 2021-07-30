package com.natanek.decorator;

public class Espresso implements Cafe {

    @Override
    public double calculateCost() {
        System.out.println("Adding cost of espresso");
        return 2.5;
    }
}
