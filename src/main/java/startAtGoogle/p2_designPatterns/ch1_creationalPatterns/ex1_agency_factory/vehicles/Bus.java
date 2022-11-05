package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory.vehicles;

import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory.Passenger;
import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory.VehicleType;

public class Bus implements Vehicle {
    private VehicleType type = VehicleType.BUS;

    public Bus() {
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public String   toString() {
        return "Bus{" +
                "type=" + type +
                '}';
    }

    public void transport(Passenger passenger) {
        System.out.println(passenger.getName() + " - favourite vehicle: " + passenger.getFavouriteVehicle() + " - get bus");
    }
}
