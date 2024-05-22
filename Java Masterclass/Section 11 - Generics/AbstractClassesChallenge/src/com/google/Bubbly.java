package com.google;

public class Bubbly extends ProductForSale{
    private String flavor;
    private int ounces;

    public Bubbly(String type, double price, String description, String flavor,
                  int ounces) {
        super(type, price, description);
        this.flavor = flavor;
        this.ounces = ounces;
    }


    @Override
    public void showDetails() {
        System.out.println("Product Description: \n" + super.description + "\n" +
                String.format("Flavor: %s %n Ounces: %d %n", flavor, ounces));
    }
}
