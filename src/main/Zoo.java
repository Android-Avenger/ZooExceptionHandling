package main;

import model.Animal;
import model.Keeper;
import model.Manager;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList();
        System.out.println("Zoo is open");

        for (int i = 0; i < 3; i++) {

            animals.add(new Animal());
        }

        Keeper keeper = new Keeper();
        Animal animal = new Animal();
        Manager manager = new Manager(animal, keeper);
    }
}
