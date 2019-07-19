package com.david.zoo.entity.animal;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalShould {

    private List<Animal> animalList;

    @Before
    public void setUp() {
        animalList = new ArrayList<>();

        animalList.add(new Dog("Kilian", "Meat", "Hunting Dog"));
        animalList.add(new Dog("Peter", "Pedigree", "Sport Dog"));
        animalList.add(new Dog("Rocky", "Fresh Meat", "Sport Dog"));
        animalList.add(new Chicken("Chicky", "Corn", 0.75, true));
        animalList.add(new Chicken("Turk", "Caviar", 0.75, false));
        animalList.add(new Parrot("Pirate", "Grain", 0.25, false));
        animalList.add(new Parrot("Parvy", "Corn", 0.5, true));
    }

    @Test
    public void make_a_friend_when_live_one_day() {
        Animal animal = animalList.get(0);
        animal.liveOneDay(animalList);

        assertEquals(1, animal.friends.size());
    }

    @Test
    public void make_a_friend_when_live_three_days() {
        Animal animal = animalList.get(0);

        animal.liveOneDay(animalList);
        animal.liveOneDay(animalList);
        animal.liveOneDay(animalList);

        assertEquals(1, animal.friends.size());
    }

    @Test
    public void make_no_friend_when_live_one_day_and_there_are_no_animals() {
        Animal animal = new Parrot("Pirate", "Grain", 0.25, false);
        animal.liveOneDay(new ArrayList<>());

        assertEquals(0, animal.friends.size());
    }

    @Test
    public void make_no_friend_when_live_one_day_and_the_only_animal_is_already_a_friend() {
        Animal animal = new Parrot("Pirate", "Grain", 0.25, false);
        Animal animal2 = new Dog("Peter", "Pedigree", "Sport Dog");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal2);

        animal.liveOneDay(animals);
        animal.liveOneDay(animals);

        assertEquals(0, animal.friends.size());
    }

}