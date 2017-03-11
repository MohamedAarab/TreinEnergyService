package domain;

/**
 * Created by Mohammad on 11-3-2017.
 */
public class Main {
    public static void main(String[] args){
        Station station = new Station("Utrecht Centraal");


        System.out.println(station.getTotalEnergyConsumption(2));
    }
}
