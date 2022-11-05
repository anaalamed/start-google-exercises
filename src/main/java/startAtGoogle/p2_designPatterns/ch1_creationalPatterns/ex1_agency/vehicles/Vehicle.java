package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency.vehicles;

import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency.Passenger;
import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency.VehicleType;

public interface Vehicle {
    public void transport(Passenger passenger);
    public VehicleType getType();

}
