package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency_factory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // create agency
        Agency agency = Agency.getInstance();

        // create passengers. (name=i)
        ArrayList<Passenger> passengers = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            passengers.add(new Passenger(String.valueOf(i))) ;
        }

        // assign vehicles to passenger
        try {
            for ( Passenger passenger: passengers  ) {
                agency.assignVehicleToPassenger(passenger);
            }
        } catch (NullPointerException ex) {
            System.out.println("no more vehicles ex -> " + ex);
        }

    }
}
