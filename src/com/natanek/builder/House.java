package com.natanek.builder;

public class House {
    boolean hasGarage;
    boolean hasSwimmingPool;
    boolean hasGarden;
    int numberOfFloors;

    protected House(boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden, int numberOfFloors) {
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
