package startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex2_farm.farm;

class Pig extends AbstractAnimal {
    @Override
    public String toString() {
        return "\nPig{" +
                "id=" + id +
                ", weight=" + weight +
                ", gender=" + gender +
                "}";
    }

    public Pig(int id, Gender gender, double weight) {
        super(id, gender, weight);
    }

    public Pig() {
        super();
    }

    public Pig mate(AbstractAnimal partner) {
        if (this.gender != partner.gender) {
            return new Pig();  // random
        } else return null;
    }

    public void move() {
        System.out.println("pig mooving");
    }
}
