package implementation;

import Trein.ObjectFactory;
import Trein.Request;
import domain.Ride;
import domain.Station;
import domain.Train;
import org.junit.Assert;
import org.junit.Test;
import trainservice.*;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;

/**
 * Created by Mohammad on 12-3-2017.
 */
public class TrainServiceImplTest {
    ArrayList<Station> allStations = new ArrayList<Station>();

    public TrainServiceImplTest () {

        allStations.add(new Station("Utrecht Centraal"));
        allStations.add(new Station("Amsterdam Centraal"));
        allStations.add(new Station("Rotterdam Centraal"));
        allStations.add(new Station("Limburg Centraal"));
        allStations.add(new Station("Brabant Centraal"));
        allStations.add(new Station("Leiden Centraal"));
        allStations.add(new Station("Den Haag Centraal"));

        Train train1 = new Train("C23-1", 5000);
        Train train2 = new Train("C01-2", 6500);
        Train train3 = new Train("C64-1", 3200);
        Train train4 = new Train("C74-8", 4700);
        Train train5 = new Train("C89-0", 9000);
        Train train6 = new Train("C66-3", 3900);
        Train train7 = new Train("C27-5", 5900);
        Train train8 = new Train("C12-1", 6200);
        Train train9 = new Train("C54-9", 4500);
        Train train10 = new Train("C33-2", 8300);


        train1.addRide(new Ride(allStations.get(0), allStations.get(1), 2));
        train1.addRide(new Ride(allStations.get(1), allStations.get(3), 5));
        train1.addRide(new Ride(allStations.get(2), allStations.get(0), 3));
        train1.addRide(new Ride(allStations.get(0), allStations.get(6), 3));
        train1.addRide(new Ride(allStations.get(1), allStations.get(0), 2));

        train2.addRide(new Ride(allStations.get(2), allStations.get(3), 2));
        train2.addRide(new Ride(allStations.get(0), allStations.get(5), 3));
        train2.addRide(new Ride(allStations.get(1), allStations.get(6), 3));
        train2.addRide(new Ride(allStations.get(0), allStations.get(2), 2));
        train2.addRide(new Ride(allStations.get(2), allStations.get(3), 4));

        train3.addRide(new Ride(allStations.get(5), allStations.get(1), 1));
        train3.addRide(new Ride(allStations.get(0), allStations.get(5), 2));
        train3.addRide(new Ride(allStations.get(0), allStations.get(6), 3));
        train3.addRide(new Ride(allStations.get(2), allStations.get(6), 4));
        train3.addRide(new Ride(allStations.get(1), allStations.get(0), 5));

        train4.addRide(new Ride(allStations.get(0), allStations.get(1), 2));
        train4.addRide(new Ride(allStations.get(0), allStations.get(3), 3));
        train4.addRide(new Ride(allStations.get(4), allStations.get(1), 4));
        train4.addRide(new Ride(allStations.get(3), allStations.get(6), 1));
        train4.addRide(new Ride(allStations.get(2), allStations.get(0), 2));

        train5.addRide(new Ride(allStations.get(0), allStations.get(1), 3));
        train5.addRide(new Ride(allStations.get(1), allStations.get(4), 4));
        train5.addRide(new Ride(allStations.get(2), allStations.get(6), 5));
        train5.addRide(new Ride(allStations.get(0), allStations.get(5), 1));
        train5.addRide(new Ride(allStations.get(1), allStations.get(0), 2));

        train6.addRide(new Ride(allStations.get(2), allStations.get(1), 2));
        train6.addRide(new Ride(allStations.get(0), allStations.get(0), 4));
        train6.addRide(new Ride(allStations.get(5), allStations.get(0), 3));
        train6.addRide(new Ride(allStations.get(0), allStations.get(2), 2));
        train6.addRide(new Ride(allStations.get(1), allStations.get(4), 1));

        train7.addRide(new Ride(allStations.get(0), allStations.get(1), 3));
        train7.addRide(new Ride(allStations.get(1), allStations.get(2), 1));
        train7.addRide(new Ride(allStations.get(2), allStations.get(0), 2));
        train7.addRide(new Ride(allStations.get(0), allStations.get(2), 3));
        train7.addRide(new Ride(allStations.get(1), allStations.get(4), 4));

        train8.addRide(new Ride(allStations.get(0), allStations.get(3), 5));
        train8.addRide(new Ride(allStations.get(3), allStations.get(6), 4));
        train8.addRide(new Ride(allStations.get(4), allStations.get(3), 3));
        train8.addRide(new Ride(allStations.get(0), allStations.get(3), 2));
        train8.addRide(new Ride(allStations.get(1), allStations.get(0), 1));

        train9.addRide(new Ride(allStations.get(1), allStations.get(3), 3));
        train9.addRide(new Ride(allStations.get(0), allStations.get(3), 4));
        train9.addRide(new Ride(allStations.get(0), allStations.get(2), 1));
        train9.addRide(new Ride(allStations.get(1), allStations.get(1), 2));
        train9.addRide(new Ride(allStations.get(0), allStations.get(5), 3));

        train10.addRide(new Ride(allStations.get(0), allStations.get(1), 2));
        train10.addRide(new Ride(allStations.get(1), allStations.get(3), 3));
        train10.addRide(new Ride(allStations.get(2), allStations.get(0), 4));
        train10.addRide(new Ride(allStations.get(0), allStations.get(6), 1));
        train10.addRide(new Ride(allStations.get(1), allStations.get(0), 2));

        allStations.get(0).addStationedTrain(train1);
        allStations.get(0).addStationedTrain(train2);
        allStations.get(0).addStationedTrain(train3);
        allStations.get(0).addStationedTrain(train4);
        allStations.get(0).addStationedTrain(train5);
        allStations.get(0).addStationedTrain(train6);
        allStations.get(0).addStationedTrain(train7);
        allStations.get(0).addStationedTrain(train8);
        allStations.get(0).addStationedTrain(train9);
        allStations.get(0).addStationedTrain(train10);
    }

    @Test
    public void getTotalRides() throws GetTotalRidesError {
        trainservice.ObjectFactory factory = new trainservice.ObjectFactory();
        JAXBElement<String> request = factory.createStation("Utrecht Centraal");
        JAXBElement<Integer> response = factory.createTotalrides(0);

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            response.setValue(foundStation.getTotalRides());
        } else {
            throw new GetTotalRidesError("Geen station gevonden","Station");
        }

        Assert.assertEquals(50, response.getValue(), 0);
    }

    @Test
    public void getTotalEnergyConsumption() throws GetTotalEnergyConsumptionError {
        trainservice.ObjectFactory factory = new trainservice.ObjectFactory();
        JAXBElement<String> request = factory.createStation("Utrecht Centraal");
        JAXBElement<Integer> response = factory.createEnergy(0);

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            response.setValue(foundStation.getTotalEnergyConsumption());
        } else {
            throw new GetTotalEnergyConsumptionError("Geen station gevonden","Station");
        }

        Assert.assertEquals(780000.0, response.getValue(), 0);
    }


    @Test
    public void getTotalEnergyConsumptionPerHour() throws GetTotalEnergyConsumptionPerHourError {
        trainservice.ObjectFactory factory = new trainservice.ObjectFactory();
        JAXBElement<String> request = factory.createStation("Utrecht Centraal");
        JAXBElement<Integer> response = factory.createEnergy(0);

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            response.setValue(foundStation.getTotalEnergyConsumptionPerHour());
        } else {
            throw new GetTotalEnergyConsumptionPerHourError("Geen station gevonden","Station");
        }

        Assert.assertEquals(57200.0, response.getValue(), 0);
    }

    @Test
    public void getTotalEnergyConsumptionHour() throws GetTotalEnergyConsumptionHourError {
        trainservice.ObjectFactory factory = new trainservice.ObjectFactory();
        JAXBElement<Integer> response = factory.createEnergy(0);
        StationHours stationHours = new StationHours();
        stationHours.setHours(3);
        stationHours.setStation("Utrecht Centraal");

        Station foundStation = findStation(stationHours.getStation().toString());
        if(foundStation != null) {
            response.setValue(foundStation.getTotalEnergyConsumptionHours(stationHours.getHours()));
        } else {
            throw new GetTotalEnergyConsumptionHourError("Geen station gevonden","Station");
        }

        Assert.assertEquals(171600.0, response.getValue(), 0);
    }

    @Test
    public void getAllRides() throws GetAllRidesError {
        trainservice.ObjectFactory factory = new trainservice.ObjectFactory();

        JAXBElement<String> request = factory.createStation("Utrecht Centraal");
        JAXBElement<String> response = factory.createRides("");

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            for(String ride: foundStation.getAllRides()) {
                response.setValue(response.getValue() + ride + "\n");
            }
        } else {
            throw new GetAllRidesError("Geen station gevonden","Station");
        }
        Assert.assertEquals("Trein [C23-1] heeft een ritje gehad van Utrecht Centraal naar Amsterdam Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C23-1] heeft een ritje gehad van Amsterdam Centraal naar Limburg Centraal en duurde 5 uurtje(s)\n" +
                "Trein [C23-1] heeft een ritje gehad van Rotterdam Centraal naar Utrecht Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C23-1] heeft een ritje gehad van Utrecht Centraal naar Den Haag Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C23-1] heeft een ritje gehad van Amsterdam Centraal naar Utrecht Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C01-2] heeft een ritje gehad van Rotterdam Centraal naar Limburg Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C01-2] heeft een ritje gehad van Utrecht Centraal naar Leiden Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C01-2] heeft een ritje gehad van Amsterdam Centraal naar Den Haag Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C01-2] heeft een ritje gehad van Utrecht Centraal naar Rotterdam Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C01-2] heeft een ritje gehad van Rotterdam Centraal naar Limburg Centraal en duurde 4 uurtje(s)\n" +
                "Trein [C64-1] heeft een ritje gehad van Leiden Centraal naar Amsterdam Centraal en duurde 1 uurtje(s)\n" +
                "Trein [C64-1] heeft een ritje gehad van Utrecht Centraal naar Leiden Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C64-1] heeft een ritje gehad van Utrecht Centraal naar Den Haag Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C64-1] heeft een ritje gehad van Rotterdam Centraal naar Den Haag Centraal en duurde 4 uurtje(s)\n" +
                "Trein [C64-1] heeft een ritje gehad van Amsterdam Centraal naar Utrecht Centraal en duurde 5 uurtje(s)\n" +
                "Trein [C74-8] heeft een ritje gehad van Utrecht Centraal naar Amsterdam Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C74-8] heeft een ritje gehad van Utrecht Centraal naar Limburg Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C74-8] heeft een ritje gehad van Brabant Centraal naar Amsterdam Centraal en duurde 4 uurtje(s)\n" +
                "Trein [C74-8] heeft een ritje gehad van Limburg Centraal naar Den Haag Centraal en duurde 1 uurtje(s)\n" +
                "Trein [C74-8] heeft een ritje gehad van Rotterdam Centraal naar Utrecht Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C89-0] heeft een ritje gehad van Utrecht Centraal naar Amsterdam Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C89-0] heeft een ritje gehad van Amsterdam Centraal naar Brabant Centraal en duurde 4 uurtje(s)\n" +
                "Trein [C89-0] heeft een ritje gehad van Rotterdam Centraal naar Den Haag Centraal en duurde 5 uurtje(s)\n" +
                "Trein [C89-0] heeft een ritje gehad van Utrecht Centraal naar Leiden Centraal en duurde 1 uurtje(s)\n" +
                "Trein [C89-0] heeft een ritje gehad van Amsterdam Centraal naar Utrecht Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C66-3] heeft een ritje gehad van Rotterdam Centraal naar Amsterdam Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C66-3] heeft een ritje gehad van Utrecht Centraal naar Utrecht Centraal en duurde 4 uurtje(s)\n" +
                "Trein [C66-3] heeft een ritje gehad van Leiden Centraal naar Utrecht Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C66-3] heeft een ritje gehad van Utrecht Centraal naar Rotterdam Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C66-3] heeft een ritje gehad van Amsterdam Centraal naar Brabant Centraal en duurde 1 uurtje(s)\n" +
                "Trein [C27-5] heeft een ritje gehad van Utrecht Centraal naar Amsterdam Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C27-5] heeft een ritje gehad van Amsterdam Centraal naar Rotterdam Centraal en duurde 1 uurtje(s)\n" +
                "Trein [C27-5] heeft een ritje gehad van Rotterdam Centraal naar Utrecht Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C27-5] heeft een ritje gehad van Utrecht Centraal naar Rotterdam Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C27-5] heeft een ritje gehad van Amsterdam Centraal naar Brabant Centraal en duurde 4 uurtje(s)\n" +
                "Trein [C12-1] heeft een ritje gehad van Utrecht Centraal naar Limburg Centraal en duurde 5 uurtje(s)\n" +
                "Trein [C12-1] heeft een ritje gehad van Limburg Centraal naar Den Haag Centraal en duurde 4 uurtje(s)\n" +
                "Trein [C12-1] heeft een ritje gehad van Brabant Centraal naar Limburg Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C12-1] heeft een ritje gehad van Utrecht Centraal naar Limburg Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C12-1] heeft een ritje gehad van Amsterdam Centraal naar Utrecht Centraal en duurde 1 uurtje(s)\n" +
                "Trein [C54-9] heeft een ritje gehad van Amsterdam Centraal naar Limburg Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C54-9] heeft een ritje gehad van Utrecht Centraal naar Limburg Centraal en duurde 4 uurtje(s)\n" +
                "Trein [C54-9] heeft een ritje gehad van Utrecht Centraal naar Rotterdam Centraal en duurde 1 uurtje(s)\n" +
                "Trein [C54-9] heeft een ritje gehad van Amsterdam Centraal naar Amsterdam Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C54-9] heeft een ritje gehad van Utrecht Centraal naar Leiden Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C33-2] heeft een ritje gehad van Utrecht Centraal naar Amsterdam Centraal en duurde 2 uurtje(s)\n" +
                "Trein [C33-2] heeft een ritje gehad van Amsterdam Centraal naar Limburg Centraal en duurde 3 uurtje(s)\n" +
                "Trein [C33-2] heeft een ritje gehad van Rotterdam Centraal naar Utrecht Centraal en duurde 4 uurtje(s)\n" +
                "Trein [C33-2] heeft een ritje gehad van Utrecht Centraal naar Den Haag Centraal en duurde 1 uurtje(s)\n" +
                "Trein [C33-2] heeft een ritje gehad van Amsterdam Centraal naar Utrecht Centraal en duurde 2 uurtje(s)\n", response.getValue());
    }

    @Test
    public void getStationedTrains() throws GetStationedTrainsError {
        trainservice.ObjectFactory factory = new trainservice.ObjectFactory();

        JAXBElement<String> request = factory.createStation("Utrecht Centraal");
        JAXBElement<String> response = factory.createStationedTrains("");

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            for(Train train: foundStation.getStationedTrains()) {
                response.setValue(response.getValue() + train.name + "\n");
            }

        } else {
            throw new GetStationedTrainsError("Geen station gevonden","Station");
        }

        Assert.assertEquals("C23-1\n" +
                "C01-2\n" +
                "C64-1\n" +
                "C74-8\n" +
                "C89-0\n" +
                "C66-3\n" +
                "C27-5\n" +
                "C12-1\n" +
                "C54-9\n" +
                "C33-2\n", response.getValue());
    }

    private Station findStation(String name) {
        for(Station station : this.allStations) {
            if(station.equals(name)) {
                return station;
            }
        }
        return null;
    }


}
