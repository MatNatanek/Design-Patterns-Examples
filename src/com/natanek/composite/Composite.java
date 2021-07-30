package com.natanek.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final int price;
    private final List<Component> components = new ArrayList<>();

    public Composite(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        int totalPrice = price;
        for (Component component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }

    public void addComponent(Component component) {
        components.add(component);
    }
}
