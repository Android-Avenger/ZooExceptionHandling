package model;

import main.NotHungry;

public class Manager {

    Animal animal;
    Keeper keeper;

    public Manager(Animal animal, Keeper keeper) {
        this.animal = animal;
        this.keeper = keeper;
    }
    public void manager(){
        try {
            keeper.feed();
        } catch (NotHungry e) {
            e.printStackTrace();
        }
    }
}
