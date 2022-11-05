package startAtGoogle.p1_javaBestPracties.ch4_classesIntefaces.ex2_farm.farm;


import java.util.ArrayList;
import java.util.List;

public class Farmer {
    private Farm farm;
    private List<Animal> animalList;


    public Farmer() {
        this.farm = new Farm();
        this.animalList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nFarmer{" +
                "farm=" + farm +
                ", animalList=" + animalList +
                '}';
    }

    public Farm getFarm() {
        return farm;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }


    public void makeAnimalMove(String animalName) {
//        make the first animal move
        for (Animal animal : farm.getAnimals()) {
            if (animal.toString().contains(animalName)) {
                animal.move();
                break;
            }
        }
    }

    public void requestAnimal(AnimalType type) {
        AbstractAnimal animal;
        switch (type) {
            case HORSE:
                animal = farm.requestAnimaltoFarmer(AnimalType.HORSE);
                break;
            case PIG:
                animal = farm.requestAnimaltoFarmer(AnimalType.PIG);
                break;
            case MONKEY:
                animal =  farm.requestAnimaltoFarmer(AnimalType.MONKEY);
                break;
            default: animal =  farm.requestAnimaltoFarmer(AnimalType.MONKEY);
            break;
        }

        this.animalList.add(animal);
    }
}
