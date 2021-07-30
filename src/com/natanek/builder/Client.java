package com.natanek.builder;

public class Client {
    public static void main(String[] args) {
        House house = new HouseBuilderImpl().withGarage().withGarden().withFloors(3).build();
        System.out.println(house);
    }

}
