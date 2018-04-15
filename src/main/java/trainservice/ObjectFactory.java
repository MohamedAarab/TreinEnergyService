
package trainservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trainservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Energy_QNAME = new QName("http://mohamed.nl/treinservice/response/", "energy");
    private final static QName _Rides_QNAME = new QName("http://mohamed.nl/treinservice/response/", "rides");
    private final static QName _Totalrides_QNAME = new QName("http://mohamed.nl/treinservice/response/", "totalrides");
    private final static QName _Error_QNAME = new QName("http://mohamed.nl/treinservice/error/", "error");
    private final static QName _Station_QNAME = new QName("http://mohamed.nl/treinservice/request/", "station");
    private final static QName _StationedTrains_QNAME = new QName("http://mohamed.nl/treinservice/response/", "stationed-trains");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trainservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StationHours }
     * 
     */
    public StationHours createStationHours() {
        return new StationHours();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mohamed.nl/treinservice/response/", name = "energy")
    public JAXBElement<Integer> createEnergy(Integer value) {
        return new JAXBElement<Integer>(_Energy_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mohamed.nl/treinservice/response/", name = "rides")
    public JAXBElement<String> createRides(String value) {
        return new JAXBElement<String>(_Rides_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mohamed.nl/treinservice/response/", name = "totalrides")
    public JAXBElement<Integer> createTotalrides(Integer value) {
        return new JAXBElement<Integer>(_Totalrides_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mohamed.nl/treinservice/error/", name = "error")
    public JAXBElement<String> createError(String value) {
        return new JAXBElement<String>(_Error_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mohamed.nl/treinservice/request/", name = "station")
    public JAXBElement<String> createStation(String value) {
        return new JAXBElement<String>(_Station_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mohamed.nl/treinservice/response/", name = "stationed-trains")
    public JAXBElement<String> createStationedTrains(String value) {
        return new JAXBElement<String>(_StationedTrains_QNAME, String.class, null, value);
    }

}
