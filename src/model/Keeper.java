package model;

import main.NotHungry;

import java.util.ArrayList;
import java.util.List;

public class Keeper {

    public List<Animal> animalToFeed ;
    public void animalsToFeed(List<Animal> animals){ animalToFeed = animals;}

    public void feed() throws NotHungry {
        System.out.println("Animal is feeding");
        for (Animal animal: animalToFeed ){
            if (!animal.isHungry()){

                int eaten = animal.eat();
                System.out.println(eaten);
            }
        }
    }
}
