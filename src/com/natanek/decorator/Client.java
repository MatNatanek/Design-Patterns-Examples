package com.natanek.decorator;

public class Client {
    public static void main(String[] args) {
        Cafe espresso = new Espresso();
        Cafe espressoWithWhip = new WhipDecorator(espresso);
        System.out.println("the price of coffee: " + espressoWithWhip.calculateCost());
    }
}
