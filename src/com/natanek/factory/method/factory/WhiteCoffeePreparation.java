package com.natanek.factory.method.factory;

public class WhiteCoffeePreparation extends CoffeePreparation {

    @Override
    Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (type.equals("Latte")) {
            coffee = new Latte();
        } else if (type.equals("Cappucino")) {
            coffee = new Cappuccino();
        }
        return coffee;
    }
}
