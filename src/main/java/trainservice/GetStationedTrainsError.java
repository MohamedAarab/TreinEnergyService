
package trainservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "error", targetNamespace = "http://mohamed.nl/treinservice/error/")
public class GetStationedTrainsError
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private String faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public GetStationedTrainsError(String message, String faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public GetStationedTrainsError(String message, String faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: java.lang.String
     */
    public String getFaultInfo() {
        return faultInfo;
    }

}
