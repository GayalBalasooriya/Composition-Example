package com.company;

public class Room {
    private Furniture furniture;
    private ElectronicEq electronicEq;

    public Room(Furniture furniture, ElectronicEq electronicEq) {
        this.furniture = furniture;
        this.electronicEq = electronicEq;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public ElectronicEq getElectronicEq() {
        return electronicEq;
    }
}
