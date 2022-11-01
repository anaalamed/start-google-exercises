package startAtGoogle.designPatterns.ch1_creationalPatterns.ex1_agency.vehicles;

import startAtGoogle.designPatterns.ch1_creationalPatterns.ex1_agency.VehicleType;

public class VehicleFactory {
    public Vehicle createVehicle(VehicleType type){
        switch (type){
            case PLANE:
                return new Plane();
            case BOAT:
                return new Boat();
            case BUS:
                return new Bus();
            case TAXI:
                return new Taxi();
            default:
                throw new IllegalArgumentException(String.format("Vehicle type not supported: %s", type));
        }
    }
}
