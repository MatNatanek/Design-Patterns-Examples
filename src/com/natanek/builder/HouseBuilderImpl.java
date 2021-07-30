package com.natanek.builder;

public class HouseBuilderImpl implements HouseBuilder {

    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private int numberOfFloors = 1;

    @Override
    public HouseBuilder withGarage() {
        this.hasGarage = true;
        return this;
    }

    @Override
    public HouseBuilder withSwimmingPool() {
        this.hasSwimmingPool = true;
        return this;
    }

    @Override
    public HouseBuilder withGarden() {
        this.hasGarden = true;
        return this;
    }

    @Override
    public HouseBuilder withFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
        return this;
    }

    @Override
    public House build() {
        return new House(hasGarage, hasSwimmingPool, hasGarden, numberOfFloors);
    }
}
