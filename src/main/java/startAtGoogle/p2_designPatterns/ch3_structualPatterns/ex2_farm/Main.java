package startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex2_farm;

import startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex2_farm.farm.*;

public class Main {
    public static void main(String[] args) {
//        Farmer ana = new Farmer();
//        System.out.println(ana);

//        ana.makeAnimalMove("Horse");                    // make the first horse move


        Horse horse1  = new Horse();
        Horse horse2  = new Horse();

        System.out.println("\nwoodenStructureAdapter - roll:");
        WoodenStructureAdapter woodenHorse1 = new WoodenStructureAdapter(horse1);
        WoodenStructureAdapter woodenHorse2 = new WoodenStructureAdapter(horse2);
        woodenHorse1.roll();

        System.out.println("\nwoodenStructureAdapter - replicate:");
//        AbstractAnimal animal =  woodenStructureAdapter.replicate(horse2);
//        System.out.println(animal);
//        System.out.println(woodenHorse1.replicate(woodenHorse2));

    }
}
