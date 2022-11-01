package startAtGoogle.designPatterns.ch1_creationalPatterns.ex1;

import java.util.ArrayList;
import java.util.HashMap;

public class Agency {
    private static Agency instance;
    ArrayList<Vehicle> vehicles;
    HashMap<VehicleType, Integer> agencyMap;

    // hold the connection between vehicle to passenger!

    public static Agency getInstance(){
        if(instance==null){
            instance = new Agency();
        }
        return instance;
    }

    public Agency() {
        HashMap<VehicleType, Integer> mapVehicles = new HashMap<>();
        mapVehicles.put(VehicleType.BUS, 4);
        mapVehicles.put(VehicleType.PLANE, 1);
        mapVehicles.put(VehicleType.BOAT, 3);
        mapVehicles.put(VehicleType.TAXI, 8);

//        this.vehicles = mapVehicles;
//        this.agencyMap = new HashMap<>();
    }
}
