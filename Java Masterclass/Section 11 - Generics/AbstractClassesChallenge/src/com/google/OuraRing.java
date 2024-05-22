package com.google;

public class OuraRing extends ProductForSale{

    private String batteryLife;
    private String appForRing;

    public OuraRing(String type, double price, String description,
                    String batteryLife, String appForRing) {
        super(type, price, description);
        this.appForRing = appForRing;
        this.batteryLife = batteryLife;
    }


    @Override
    public void showDetails() {
        System.out.println("Product Description: \n" + super.description + "\n" +
                String.format("Battery Life: %s %n App For Ring: %s %n", batteryLife, appForRing));
    }

}
