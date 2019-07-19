package com.david.zoo;

import com.david.zoo.animal.Animal;
import com.david.zoo.animal.Chicken;
import com.david.zoo.animal.Dog;
import com.david.zoo.animal.Parrot;

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void loadAnimals() {
        animals.add(new Dog("Kilian", "Meat", "Hunting Dog"));
        animals.add(new Dog("Peter", "Pedigree", "Sport Dog"));
        animals.add(new Dog("Rocky", "Fresh Meat", "Sport Dog"));
        animals.add(new Chicken("Chicky", "Corn", 0.75, true));
        animals.add(new Chicken("Turk", "Caviar", 0.75, false));
        animals.add(new Parrot("Pirate", "Grain", 0.25, false));
        animals.add(new Parrot("Parvy", "Corn", 0.5, true));
    }

    public void liveOneDay() {
        for (Animal animal : animals) {
            animal.liveOneDay(animals);
        }
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            animal.printInfo();
            System.out.println("===========");
        }
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
