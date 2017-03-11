package domain;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Mohammad on 11-3-2017.
 */
public class Station {
    private String name;
    private ArrayList<Ride> allRides;

    public Station(String name) {
        this.name = name;
        this.allRides = new ArrayList<Ride>();
    }

    public void addRide(Ride rd) {
        this.allRides.add(rd);
    }

    public int getTotalEnergyConsumption(int totalHours) {
        int total = 0;
        for (Ride ride : allRides) {
            total += ride.getEnergyTravelled(totalHours);
        }
        return total;
    }




}
