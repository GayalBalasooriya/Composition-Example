package com.company;

public class Main {

    public static void main(String[] args) {
        Furniture furniture = new Furniture("v55",4589,"chair");
        ElectronicEq electronicEq = new ElectronicEq("fan","kdk",6700);

        Room room = new Room(furniture,electronicEq);

        System.out.println(room.getFurniture().getModel());
    }
}
