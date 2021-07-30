package com.natanek.observer;

public class ConcreteSubscriber implements Subscriber {

    @Override
    public void update(String message) {
        System.out.println("ConcreteSubscriber receive message: " + message);
    }
}
