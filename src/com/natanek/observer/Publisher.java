package com.natanek.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private final List<Subscriber> listOfSubscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        listOfSubscribers.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {
        listOfSubscribers.remove(subscriber);
    }

    public void notifySubscribers(String message) {
        for (Subscriber subscriber : listOfSubscribers) {
            subscriber.update(message);
        }
    }


}
