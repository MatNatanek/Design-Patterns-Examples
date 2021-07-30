package com.natanek.observer;

public class Client {
    public static void main(String[] args) {
        final Publisher publisher = new Publisher();
        final Subscriber concreteSubscriber = new ConcreteSubscriber();
        publisher.subscribe(concreteSubscriber);
        publisher.notifySubscribers("Test message");
    }
}
