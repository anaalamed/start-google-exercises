package startAtGoogle.designPatterns.ch1_creationalPatterns.ex1_agency.vehicles;

import startAtGoogle.designPatterns.ch1_creationalPatterns.ex1_agency.Passenger;
import startAtGoogle.designPatterns.ch1_creationalPatterns.ex1_agency.VehicleType;

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
