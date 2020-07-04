package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args){
        HouseCat mainHouseCat = new HouseCat("Boris",10);
        mainHouseCat.eat();
        System.out.println(mainHouseCat.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());// prints 13

        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

        Cat suki = new HouseCat("Suki", 8);
// Calls HouseCat's noise() method
        suki.noise(); // Hello, my name is Suki!
        //Using casting - As long as suki really is a HouseCat, this works
        ((HouseCat) suki).isSatisfied();
    }

}
