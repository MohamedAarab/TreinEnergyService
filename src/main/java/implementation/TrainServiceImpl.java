package implementation;

import domain.Ride;
import domain.Station;
import domain.Train;
import trainservice.*;

import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import java.math.BigInteger;
import java.util.ArrayList;

@WebService( endpointInterface= "trainservice.TrainPortType")
public class TrainServiceImpl implements TrainPortType {
    ArrayList<Station> allStations = new ArrayList<Station>();
    public TrainServiceImpl () {

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

    /**
     * Haalt het totale aantal ritjes op die gereden zijn door treinen die gestationeerd zijn in een station.
     * @param station
     * @return
     * @throws GetTotalRidesError
     */
    @Override
    public int getTotalRides(String station) throws GetTotalRidesError {
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> request = factory.createStation(station);
        JAXBElement<Integer> response = factory.createTotalrides(0);

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            response.setValue(foundStation.getTotalRides());
        } else {
            throw new GetTotalRidesError("Geen station gevonden","Station");
        }

        return response.getValue();
    }

    /**
     * Haalt totale energie op voor een station
     * @param station
     * @return
     * @throws GetTotalEnergyConsumptionError
     */
    @Override
    public int getTotalEnergyConsumption(String station) throws GetTotalEnergyConsumptionError {
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> request = factory.createStation(station);
        JAXBElement<Integer> response = factory.createEnergy(0);

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            response.setValue(foundStation.getTotalEnergyConsumption());
        } else {
            throw new GetTotalEnergyConsumptionError("Geen station gevonden","Station");
        }

        return response.getValue();
    }

    /**
     * Haalt totale energie consumptie op per uur voor een station
     * @param station
     * @return
     * @throws GetTotalEnergyConsumptionPerHourError
     */
    @Override
    public int getTotalEnergyConsumptionPerHour(String station) throws GetTotalEnergyConsumptionPerHourError {
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> request = factory.createStation(station);
        JAXBElement<Integer> response = factory.createEnergy(0);

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            response.setValue(foundStation.getTotalEnergyConsumptionPerHour());
        } else {
            throw new GetTotalEnergyConsumptionPerHourError("Geen station gevonden","Station");
        }

        return response.getValue();
    }

    /**
     * Haalt totale energie consumptie op voor het aantal uren dat opgegeven is voor een station
     * @param station
     * @return
     * @throws GetTotalEnergyConsumptionHourError
     */
    @Override
    public int getTotalEnergyConsumptionHour(StationHours station) throws GetTotalEnergyConsumptionHourError {
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<Integer> response = factory.createEnergy(0);

        Station foundStation = findStation(station.getStation().toString());
        if(foundStation != null) {
            response.setValue(foundStation.getTotalEnergyConsumptionHours(station.getHours()));
        } else {
            throw new GetTotalEnergyConsumptionHourError("Geen station gevonden","Station");
        }

        return response.getValue();
    }

    /**
     * Haalt alle ritjes op die gereden zijn door treinen die gestationeerd zijn in een station.
     * @param station
     * @return
     * @throws GetAllRidesError
     */
    @Override
    public String getAllRides(String station) throws GetAllRidesError {
        ObjectFactory factory = new ObjectFactory();

        JAXBElement<String> request = factory.createStation(station);
        JAXBElement<String> response = factory.createRides("");

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            for(String ride: foundStation.getAllRides()) {
                response.setValue(response.getValue() + ride + "\n");
            }
        } else {
            throw new GetAllRidesError("Geen station gevonden","Station");
        }

        return response.getValue();
    }

    /**
     * Haalt alle gestationeerde treins op van een station.
     * @param station
     * @return
     * @throws GetStationedTrainsError
     */
    @Override
    public String getStationedTrains(String station) throws GetStationedTrainsError {
        ObjectFactory factory = new ObjectFactory();

        JAXBElement<String> request = factory.createStation(station);
        JAXBElement<String> response = factory.createStationedTrains("");

        Station foundStation = findStation(request.getValue());
        if(foundStation != null) {
            for(Train train: foundStation.getStationedTrains()) {
                response.setValue(response.getValue() + train.name + "\n");
            }

        } else {
            throw new GetStationedTrainsError("Geen station gevonden","Station");
        }

        return response.getValue();
    }

    /**
     * Find the station in the ArrayList
     * @param name
     * @return
     */
    private Station findStation(String name) {
        for(Station station : this.allStations) {
            if(station.equals(name)) {
                return station;
            }
        }
        return null;
    }

}