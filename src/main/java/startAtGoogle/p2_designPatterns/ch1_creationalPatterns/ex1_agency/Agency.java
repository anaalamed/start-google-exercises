package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency;

import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency.vehicles.Vehicle;
import startAtGoogle.p2_designPatterns.ch1_creationalPatterns.ex1_agency.vehicles.VehicleFactory;

import java.util.*;

public class Agency {
    private static Agency instance;
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private final Map< Vehicle, Passenger> vehiclePassengerMap = new HashMap<>();


    public static Agency getInstance(){
        if(instance==null){
            instance = new Agency();
        }
        return instance;
    }

    private Agency() {
        VehicleFactory vehicleFactory = new VehicleFactory();
        HashMap<VehicleType, Integer> mapVehicles = new HashMap<>();
        mapVehicles.put(VehicleType.BUS, 4);
        mapVehicles.put(VehicleType.PLANE, 1);
        mapVehicles.put(VehicleType.BOAT, 3);
        mapVehicles.put(VehicleType.TAXI, 8);

        for (VehicleType vehicleType: mapVehicles.keySet() ) {
            for (int i = 0; i < mapVehicles.get(vehicleType); i++) {
                vehicles.add(vehicleFactory.createVehicle(vehicleType));
            }
        }
    }

    @Override
    public String toString() {
        return "Agency{" +
                "vehicles=" + vehicles +
                '}';
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void assignVehicleToPassenger(Passenger passenger) {
        Vehicle vehicleToPassenger;

        Optional<Vehicle> tryFavouriteVehicle = vehicles.stream().filter(vehicle -> vehicle.getType() == passenger.getFavouriteVehicle())
                .findFirst();

        if ( tryFavouriteVehicle.isPresent()) {
            vehicleToPassenger = tryFavouriteVehicle.get();
        } else {
             Optional<Vehicle> firstVehicle =  vehicles.stream().findFirst();
             if (firstVehicle.isPresent()) {
                 vehicleToPassenger = firstVehicle.get();
             } else {
                 invokeAllTransportMethods();
                 throw new NullPointerException("no more vehicles at agency");
             }
        }

        vehicles.remove(vehicleToPassenger);
        vehiclePassengerMap.put( vehicleToPassenger, passenger);
    }

    private void invokeAllTransportMethods() {
        // sort map by name: 1-n and transport
        vehiclePassengerMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Vehicle, Passenger>comparingByValue())
                .forEach(e -> e.getKey().transport(vehiclePassengerMap.get(e.getKey())));
    }
}
