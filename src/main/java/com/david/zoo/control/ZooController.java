package com.david.zoo.control;

import com.david.zoo.entity.Zoo;

import java.util.Scanner;

public class ZooController {

    private Zoo zoo;

    public ZooController() {
        this.zoo = new Zoo();
    }

    public void start() {
        int option;

        zoo.loadAnimals();
        zoo.printAnimals();

        do {
            option = askForOption();
            actionByOption(option);
        } while (option != 3);
    }

    private int askForOption() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            printMenu();
            option = scanner.nextInt();
        } while (option < 1 || option > 3);

        return option;
    }

    private void printMenu() {
        System.out.println("1. Print animals");
        System.out.println("2. Live one day");
        System.out.println("3. Exit!");
    }

    private void actionByOption(int option) {
        switch (option) {
            case 1:
                zoo.printAnimals();
                break;
            case 2:
                zoo.liveOneDay();
                break;
        }
    }
}
