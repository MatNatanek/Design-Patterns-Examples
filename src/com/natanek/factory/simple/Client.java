package com.natanek.factory.simple;

public class Client {

    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.createCoffee("Latte");
        assert latte != null;
        latte.description();
    }

}
