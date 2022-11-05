package startAtGoogle.p1_javaBestPracties.ch4_classesIntefaces.ex2_farm;

import startAtGoogle.p1_javaBestPracties.ch4_classesIntefaces.ex2_farm.farm.AnimalType;
import startAtGoogle.p1_javaBestPracties.ch4_classesIntefaces.ex2_farm.farm.Farmer;

public class Main {
    public static void main(String[] args) {

        Farmer ana = new Farmer();
        System.out.println(ana);

        ana.makeAnimalMove("Horse");                    // make the first horse move
        ana.makeAnimalMove("Pig");
        ana.makeAnimalMove("Monkey");

        ana.requestAnimal(AnimalType.HORSE);                       // remove the first horse from the farm, add to the farmer
        System.out.println(ana);

        //mateFarm
    }
}
