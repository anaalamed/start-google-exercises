package startAtGoogle.p1_javaBestPracties.ch4_classesIntefaces.ex2_farm.farm;

class Horse extends AbstractAnimal {
    @Override
    public String toString() {
        return "\nHorse{" +
                "id=" + id +
                ", weight=" + weight +
                ", gender=" + gender +
                "}";
    }

    public Horse() {
        super();
    }

    public AbstractAnimal mate(AbstractAnimal partner) {
        if (this.gender != partner.getGender()) {
            return new Horse();  // random
        } else return null;
    }

    public void move() {
        System.out.println("horse mooving");
    }

}