package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory.vehicles;

import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory.Passenger;
import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory.VehicleType;

public class Boat implements Vehicle {
    private VehicleType type = VehicleType.BOAT;
    public Boat() {
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "type=" + type +
                '}';
    }

    public void transport(Passenger passenger) {
        System.out.println(passenger.getName() + " - favourite vehicle: " + passenger.getFavouriteVehicle() + " - get boat");
    }
}
