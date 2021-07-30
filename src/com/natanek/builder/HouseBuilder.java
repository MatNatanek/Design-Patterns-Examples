package com.natanek.builder;

public interface HouseBuilder {
    HouseBuilder withGarage();

    HouseBuilder withSwimmingPool();

    HouseBuilder withGarden();

    HouseBuilder withFloors(int numberOfFloors);

    House build();
}

