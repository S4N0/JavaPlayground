package org.example;

public class Store {

    String productType;

    public Store(String product) {
        this.productType = product;
    }

    public void advertise() {
        System.out.println("We sell "+productType+ " ! Buy now!");
    }
}
