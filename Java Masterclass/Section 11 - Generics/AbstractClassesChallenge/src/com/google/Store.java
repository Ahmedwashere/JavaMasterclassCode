package com.google;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {

        // Products
        OuraRing oura = new OuraRing("Titanium Gold Ring V2", 179.34,
                "Color: Beautiful Gold Titanium \nPrice: 179.34", "24Hrs",
                "Oura Attack App");
        Bubbly bubbly = new Bubbly("Carbonated Water", 12.99, "Water: Carbonated Water \n" +
                "Price: 12.99", "Lemon Lime", 12);

        //ArrayList to Hold items
        ArrayList<OrderItem> itemsOrdered = new ArrayList<>();

        itemsOrdered.addAll(List.of(new OrderItem(3, oura), new OrderItem(7, bubbly)));

        for(OrderItem order : itemsOrdered){
            order.getProduct().pricedLineItem(order.getQuantity());
            order.getProduct().showDetails();
        }


    }
}
