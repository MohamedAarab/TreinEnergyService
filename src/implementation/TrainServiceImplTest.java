package implementation;

import Trein.ObjectFactory;
import Trein.Request;
import Trein.Response;
import domain.Ride;
import domain.Station;
import domain.Train;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mohammad on 12-3-2017.
 */
public class TrainServiceImplTest {

    @Test
    public void calculateTotalEnergy() {
        ObjectFactory factory = new ObjectFactory();
        Request req = new Request();
        req.setHours(1);
        Station station = new Station("Utrecht Centraal");
        Train train1 = new Train("C01-1");
        Train train2 = new Train("C01-2");
        Ride ride1 = new Ride(5, 100, train1);
        Ride ride2 = new Ride(5, 220, train2);
        station.addRide(ride1);
        station.addRide(ride2);
        Assert.assertEquals(115, station.getTotalEnergyConsumption(req.getHours()), 0);
//        BigInteger actualResult = BigInteger.valueOf(result);
    }
}
