package startAtGoogle.javaBestPracties.ch4_classesIntefaces;
// a static factory that creates the city Tel Aviv once and returns it whenever it is called.
public class City {
    private final String name;
    private final String country;
    private int population;

    private static City telaviv;      // for lazy init

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    // only population can be changes
    public void setPopulation(int population) {
        this.population = population;
    }



    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

//    static factory method
    public City createTelAviv(int population) {
        if (telaviv == null) {
            telaviv = new City("Tel Aviv", "Israel", population);
        }
        return telaviv;
    }
}
