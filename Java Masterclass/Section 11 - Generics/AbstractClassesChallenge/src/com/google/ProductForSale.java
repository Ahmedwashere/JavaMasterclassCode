package com.google;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity * price;
    }

    public void pricedLineItem(int quantity){
        System.out.printf("--> %20s \tQuantity: %5d \t Total Price: %6.2f%n", type, quantity,
                getSalesPrice(quantity));
    }

    public abstract void showDetails();
}
