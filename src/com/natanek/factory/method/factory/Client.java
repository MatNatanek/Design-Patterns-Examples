package com.natanek.factory.method.factory;

public class Client {
    public static void main(String[] args) {
        final CoffeePreparation coffeePreparation = new WhiteCoffeePreparation();
        Coffee coffee = coffeePreparation.createCoffee("Cappuccino");
    }
}
