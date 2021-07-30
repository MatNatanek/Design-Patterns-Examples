package com.natanek.singleton;

public class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {
    }

    public SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
