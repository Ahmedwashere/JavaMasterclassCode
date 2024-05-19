package com.google;

public class Horse extends Mammal{

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " is shedding hair");
    }

    @Override
    public void makeNoise() {

    }
}
