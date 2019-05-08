package com.company;

public class ElectronicEq {
    private String name;
    private String model;
    private int price;

    public ElectronicEq(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
