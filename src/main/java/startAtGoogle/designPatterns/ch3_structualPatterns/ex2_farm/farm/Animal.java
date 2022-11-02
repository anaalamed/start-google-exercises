package startAtGoogle.javaBestPracties.ch4_classesIntefaces.ex2_farm.farm;

import java.util.concurrent.ThreadLocalRandom;

interface Animal {
    public void move();

    public AbstractAnimal mate(AbstractAnimal partner);

}

abstract class AbstractAnimal implements Animal {
    // skelethon implementation :
    protected final int id;
    protected final double weight;
    protected Gender gender;

    public AbstractAnimal(int id, Gender gender, double weight ) {
        this.id = id;
        this.gender = gender;
        this.weight = weight;
    }

    public AbstractAnimal() {
        this.id = ThreadLocalRandom.current().nextInt(9999);
        this.gender = Gender.values()[ThreadLocalRandom.current().nextInt(Gender.values().length)];
        this.weight = ThreadLocalRandom.current().nextDouble(100, 200);
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }


    public void move() {
        System.out.println("mooving - animal abstract method");
    }

}
