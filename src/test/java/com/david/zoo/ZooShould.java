package com.david.zoo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZooShould {
    @Test
    public void have_animals_when_load() {
        Zoo zoo = new Zoo();
        zoo.loadAnimals();
        assertFalse(zoo.getAnimals().isEmpty());
    }
}