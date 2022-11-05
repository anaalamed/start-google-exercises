package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory.vehicles;

import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory.Passenger;
import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory.VehicleType;

public interface Vehicle {
    public void transport(Passenger passenger);
    public VehicleType getType();

}
