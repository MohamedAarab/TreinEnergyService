package implementation;

import domain.Ride;
import domain.Station;
import domain.Train;
import Trein.ObjectFactory;
import Trein.Request;
import Trein.Response;
import Trein.WSInterface;

import javax.jws.WebService;
import java.math.BigInteger;

@WebService( endpointInterface= "Trein.WSInterface")
public class TrainServiceImpl implements WSInterface {

    @Override
    public Response calculateTotalEnergy(Request request) {
        ObjectFactory factory = new ObjectFactory();
        Response response = factory.createResponse();
        Station station = new Station("Utrecht Centraal");
        Train train1 = new Train("C01-1");
        Train train2 = new Train("C01-2");
        Ride ride1 = new Ride(5, 100, train1);
        Ride ride2 = new Ride(5, 220, train2);
        station.addRide(ride1);
        station.addRide(ride2);
        int result = station.getTotalEnergyConsumption(request.getHours());
//        BigInteger actualResult = BigInteger.valueOf(result);
        response.setResult(result);
        response.setRides(station.getTotalRides());
        return response;
    }

}