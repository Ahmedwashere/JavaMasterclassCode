package com.google;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(super.type + " moves " + speed);
    }

    @Override
    public void makeNoise() {

        if (super.type == "Wolf"){
            System.out.print("Howling ");
        } else {
            System.out.println("Roof");
        }
    }
}
