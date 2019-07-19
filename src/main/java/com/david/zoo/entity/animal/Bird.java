package com.david.zoo.entity.animal;

public abstract class Bird extends Animal {
    protected double wingsLength;

    public Bird(String name, String favoriteFood, double wingsLength) {
        super(name, favoriteFood);
        this.wingsLength = wingsLength;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Wings Length: "+wingsLength);
    }
}
