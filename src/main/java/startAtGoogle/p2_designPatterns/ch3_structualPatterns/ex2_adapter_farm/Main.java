package startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex2_adapter_farm;

import startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex2_adapter_farm.farm.*;

public class Main {
    public static void main(String[] args) {
        // use a wooden horse as an Animal - adapter

        // ------------------------------ move ---------------------------
        System.out.println("\n-------------------Move-------------------");
        // horse
        System.out.println("Horse:");
        Horse horse1  = new Horse();
        horse1.move();

        // wooden horse
        System.out.println("\nWooden horse");
        WoodenStructure woodenHorse1 = new WoodenHorse("johnny");
        woodenHorse1.roll();

        // wooden horse adapter
        System.out.println("\nWoodenStructureAdapter:");
        Animal woodenHorseAdapter1 = new WoodenStructureToAnimalAdapter(woodenHorse1);
        woodenHorseAdapter1.move();


        // --------------------------- replicate -------------------------
        System.out.println("\n-----------------Replicate-----------------");
        WoodenStructure woodenHorse2 = new WoodenHorse("shoko");
        Animal woodenHorseAdapter2 = new WoodenStructureToAnimalAdapter(woodenHorse2);

        // woodenAdapter + woodenAdapter
        System.out.println("WoodenAdapter + WoodenAdapter:");
        Animal woodenAnimal =  woodenHorseAdapter1.mate(woodenHorseAdapter2);            // do replicate.
        System.out.println(woodenAnimal);

        // woodenAdapter + animal
        System.out.println("\nWoodenAdapter + Horse:");
        Animal woodenAnimal2 =  woodenHorseAdapter1.mate(horse1);                        // don't match.
        System.out.println(woodenAnimal2);

    }
}
