package com.natanek.decorator;

public class WhipDecorator extends CafeBaseDecorator {

    public WhipDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double calculateCost() {
        System.out.println("Adding cost of whip");
        return cafe.calculateCost() + 0.5;
    }
}
