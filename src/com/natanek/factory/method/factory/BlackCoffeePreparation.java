package com.natanek.factory.method.factory;

public class BlackCoffeePreparation extends CoffeePreparation {

    @Override
    Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (type.equals("Lungo")) {
            coffee = new Lungo();
        }
        return coffee;
    }
}
