package com.natanek.factory.simple;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        if (type.equals("Latte")) {
            return new Latte();
        } else if (type.equals("Cappuccino")) {
            return new Cappuccino();
        } else return null;
    }

}
