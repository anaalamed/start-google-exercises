package startAtGoogle.designPatterns.ch1_creationalPatterns.ex1_agency;

import java.util.concurrent.ThreadLocalRandom;

public class Passenger implements Comparable<Passenger> {
    private String name;
    private VehicleType favouriteVehicle;

    public Passenger(String name) {
        this.name = name;
        this.favouriteVehicle = VehicleType.values()[ThreadLocalRandom.current().nextInt(VehicleType.values().length)];
    }

    public String getName() {
        return name;
    }

    public VehicleType getFavouriteVehicle() {
        return favouriteVehicle;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", favouriteVehicle=" + favouriteVehicle +
                '}';
    }

    @Override
    public int compareTo(Passenger o) {
        if(Integer.parseInt(this.name) < ( Integer.parseInt(o.name)))
            return -1;
        if(Integer.parseInt(this.name) > ( Integer.parseInt(o.name)))
            return 1;
        return 0;
    }
}
