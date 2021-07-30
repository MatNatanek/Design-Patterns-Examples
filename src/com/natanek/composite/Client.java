package com.natanek.composite;


public class Client {
    public static void main(String[] args) {
        Composite component1 = new Composite(1);
        Component component2 = new Leaf(4);
        Component component3 = new Leaf(7);

        component1.addComponent(component2);
        component1.addComponent(component3);
        System.out.println(component3.getPrice());
        System.out.println(component1.getPrice());

    }
}
