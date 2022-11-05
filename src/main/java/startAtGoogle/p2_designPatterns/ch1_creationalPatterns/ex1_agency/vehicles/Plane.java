package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency.vehicles;

import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency.Passenger;
import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency.VehicleType;

public class Plane implements Vehicle{
    private VehicleType type = VehicleType.PLANE;


    public Plane() {
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "type=" + type +
                '}';
    }

    public void transport(Passenger passenger) {
        System.out.println(passenger.getName() + " - favourite vehicle: " + passenger.getFavouriteVehicle() + " - get plane");
    }
}
