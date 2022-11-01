package startAtGoogle.designPatterns.ch1_creationalPatterns.ex1_agency.vehicles;

import startAtGoogle.designPatterns.ch1_creationalPatterns.ex1_agency.Passenger;
import startAtGoogle.designPatterns.ch1_creationalPatterns.ex1_agency.VehicleType;

public class Taxi implements Vehicle {
    private VehicleType type = VehicleType.TAXI;

    public Taxi() {
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "type=" + type +
                '}';
    }

    public void transport(Passenger passenger) {
        System.out.println(passenger.getName() + " - favourite vehicle: " + passenger.getFavouriteVehicle() + " - get taxi");

    }
}
