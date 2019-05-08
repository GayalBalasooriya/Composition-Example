package com.company;

public class Furniture {
    private String model;
    private int price;
    private String name;

    public Furniture(String model, int price, String name) {
        this.model = model;
        this.price = price;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
