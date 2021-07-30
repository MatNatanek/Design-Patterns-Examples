package com.natanek.factory.simple;

public class Latte implements Coffee {
    @Override
    public void description() {
        System.out.println("Coffee latte");
    }
}
