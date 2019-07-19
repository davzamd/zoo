package com.david.zoo.entity.animal;

public class Chicken extends Bird {
    private boolean boiler;

    public Chicken(String name, String favoriteFood, double wingsLength, boolean boiler) {
        super(name, favoriteFood, wingsLength);
        this.boiler = boiler;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        String boiler = this.boiler ? "Boiler" : "Not a boiler";
        System.out.println(boiler);
        printFriends();
    }
}
