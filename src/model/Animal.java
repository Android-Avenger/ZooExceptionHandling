package model;

import main.NotHungry;

public class Animal {

   static Boolean isHungry = false;
   static   Boolean hungry = false;
   static int eaten = 0;

    public static int eat() throws NotHungry {

        if(!isHungry){
            throw new NotHungry();
        }
        System.out.println("Animal is eating");
        isHungry = false;
        eaten++;
        return eaten;
    }

    public Boolean isHungry() {
        return hungry;
    }
}