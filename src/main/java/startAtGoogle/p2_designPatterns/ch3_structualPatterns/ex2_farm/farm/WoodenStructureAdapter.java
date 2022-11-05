package startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex2_farm.farm;

public class WoodenStructureAdapter implements WoodenStructures {
    Animal animal;

    public WoodenStructureAdapter(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void roll() {
        animal.move();
    }

    @Override
    public AbstractAnimal replicate(AbstractAnimal animal) {
        return animal.mate(animal);
    }
}
