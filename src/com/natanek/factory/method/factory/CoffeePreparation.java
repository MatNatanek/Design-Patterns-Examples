package com.natanek.factory.method.factory;

public abstract class CoffeePreparation {
    public Coffee orderCoffee(String type) {
        Coffee coffee;
        coffee = createCoffee(type);
        return coffee;
    }

    abstract Coffee createCoffee(String type);
}
