package startAtGoogle.javaBestPracties.ch4_classesIntefaces.ex2_farm.farm;

class Monkey extends AbstractAnimal {
    @Override
    public String toString() {
        return "\nMonkey{" +
                "id=" + id +
                ", weight=" + weight +
                ", gender=" + gender +
                "}";
    }

    public Monkey() {
        super();
    }

    public Monkey mate(AbstractAnimal partner) {
        if (this.gender != partner.gender) {
            return new Monkey();  // random
        } else return null;
    }

    public void move() {
        System.out.println("monkey mooving");
    }
}
