package domain;

/**
 * Created by Mohammad on 11-3-2017.
 */
public class Ride {
    private int hoursTravelled;
    private int power;
    private Train train;

    public Ride(int hoursTravelled, int power, Train train) {
        this.hoursTravelled = hoursTravelled;
        this.train = train;
        this.power = power;
    }

    public int calculateEnergyUsage() {
        int energyConsumption = 0;
        energyConsumption = (this.power *  (this.hoursTravelled * 6 * 60)) / (1000);
        return energyConsumption;
    }

    public double getEnergyTravelled(double hours) {
        return this.calculateEnergyUsage() * hours / this.hoursTravelled;
    }
}
