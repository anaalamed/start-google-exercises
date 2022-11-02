package startAtGoogle.javaBestPracties.ch4_classesIntefaces.ex2_farm.farm;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

class Farm {
    static int count = 1;
    private ArrayList<AbstractAnimal> animals = new ArrayList<>();

    public Farm(ArrayList<AbstractAnimal> animals) {
        this.animals = animals;
    }

    public Farm() {
        generateNewAnimals(5);
    }

    public ArrayList<AbstractAnimal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "\nFarm{" +
                "animals=" + animals +
                "}\n";
    }

    public void acquire(AnimalType type) {
//        generating new animal according to animalName
        AbstractAnimal newAnimal = null;
        switch (type) {
            case HORSE:
                newAnimal =  new Horse();
                break;
            case PIG:
                newAnimal = new Pig();
                break;
            case MONKEY:
                newAnimal = new Monkey();
                break;
        }
        if (newAnimal != null) {
            animals.add(newAnimal);
        }
    }

    public void generateNewAnimals(int lenght) {
        for (int i = 0; i < lenght; i++) {
            acquire(AnimalType.values()[ThreadLocalRandom.current().nextInt(AnimalType.values().length)]);
        }
    }

    public AbstractAnimal mateFarm(AbstractAnimal animal1, AbstractAnimal animal2) {
//        mate new animal if it's possible
        AbstractAnimal newAnimal = animal1.mate(animal2);
        if (newAnimal != null) {
            animals.add(newAnimal);
            return newAnimal;
        }
        return null;
    }

    public AbstractAnimal provideAnimal(AnimalType type) {
        // get the first animal of the animalName (Horse, Pig..)
        for (AbstractAnimal animal : animals) {
            if (animal.getClass().toString().toLowerCase().contains(type.toString().toLowerCase())) {
                return animal;
            }
        }
        return null;
    }

    public AbstractAnimal requestAnimaltoFarmer(AnimalType type) {
        // get the first animal of the animalName (Horse, Pig..) and remove it
        AbstractAnimal animal = this.provideAnimal(type);
        animals.remove(animal);
        return animal;
    }


}
