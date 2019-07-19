package com.david.zoo.entity.animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    protected String name;
    protected String favoriteFood;
    protected List<Animal> friends;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        friends = new ArrayList<>();
    }

    public void liveOneDay(List<Animal> animals) {
        Animal friend;
        Animal enemy;

        do {
            friend = getRandomAnimal(animals);
            enemy = getRandomAnimal(friends);
        } while ((friend == enemy || isFriend(friend)) && animals.size() > 1);

        this.makeAFriend(friend);
        this.breakFriendship(enemy);
    }

    protected Animal getRandomAnimal(List<Animal> list) {
        if (list.isEmpty()) {
            return null;
        }

        Animal animal;

        do {
            int friendIndex = getRandomIndex(list);
            animal = list.get(friendIndex);
        } while (animal == this);

        return animal;
    }

    private int getRandomIndex(List<Animal> list) {
        return (int) (Math.random() * list.size());
    }

    protected void makeAFriend(Animal animal) {
        if (animal==null || isFriend(animal)){
            return;
        }

        this.addAFriend(animal);
        animal.addAFriend(this);
        System.out.println(this.name + " has established friendship with " + animal.getName());
    }

    private void addAFriend(Animal animal) {
        this.friends.add(animal);
    }

    protected void breakFriendship(Animal animal) {
        if (animal == null) {
            return;
        }

        this.removeFriend(animal);
        animal.removeFriend(this);
        System.out.println(this.name + " has lost friendship with " + animal.getName());
    }

    private void removeFriend(Animal animal) {
        this.friends.remove(animal);
    }

    private boolean isFriend(Animal animal) {
        return this.friends.contains(animal);
    }

    private String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Favorite Food: " + this.favoriteFood);
    }

    protected void printFriends() {
        System.out.println("Friendships:");
        for (Animal animal : friends) {
            System.out.println("\t" + animal.getName());
        }
    }

}
