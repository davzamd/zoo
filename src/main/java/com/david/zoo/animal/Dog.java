package com.david.zoo.animal;

public class Dog extends Animal {

    private String dogType;

    public Dog(String name, String favoriteFood, String dogType) {
        super(name, favoriteFood);
        this.dogType = dogType;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Dog Type: "+dogType);
        printFriends();
    }
}
