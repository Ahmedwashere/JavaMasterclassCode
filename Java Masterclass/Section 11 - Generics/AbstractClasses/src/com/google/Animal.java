package com.google;

abstract class Mammal extends Animal{
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + " ");
        System.out.println( speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // Abstract methods cannot be declared with a method body
    // Cannot use a private access modifier for abstract methods.
    // Why? Because we need to modify the method in other subclasses.
    public abstract void move(String speed);

    public abstract void makeNoise();

    // Concrete methods
    public final String getExplicitType(){
        return getClass().getSimpleName() + " ( " + type + ")";
    }
}
