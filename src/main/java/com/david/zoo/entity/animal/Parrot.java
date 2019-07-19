package com.david.zoo.entity.animal;

public class Parrot extends Bird {
    private boolean speakable;

    public Parrot(String name, String favoriteFood, double wingsLength, boolean speakable) {
        super(name, favoriteFood, wingsLength);
        this.speakable = speakable;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        String speakable = this.speakable ? "Can speak" : "Can not speak";
        System.out.println(speakable);
        printFriends();
    }
}
