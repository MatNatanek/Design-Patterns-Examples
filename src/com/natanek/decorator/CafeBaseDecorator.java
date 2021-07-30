package com.natanek.decorator;

public abstract class CafeBaseDecorator implements Cafe {

    Cafe cafe;

    public CafeBaseDecorator(Cafe cafe) {
        this.cafe = cafe;
    }


}
