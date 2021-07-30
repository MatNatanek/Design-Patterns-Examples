package com.natanek.prototype;

public class Client {
    public static void main(String[] args) {
        final Prototype someObject = new SomeObject("1", "2");
        final Prototype someObject2 = someObject.getClone();
        System.out.println(someObject2);
    }
}
