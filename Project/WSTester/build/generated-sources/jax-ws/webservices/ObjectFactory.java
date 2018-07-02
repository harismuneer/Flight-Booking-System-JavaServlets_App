
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
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

    private final static QName _GetAvailableSeatsResponse_QNAME = new QName("http://webservices/", "GetAvailableSeatsResponse");
    private final static QName _GetSeatPrice_QNAME = new QName("http://webservices/", "GetSeatPrice");
    private final static QName _GetSeatPriceResponse_QNAME = new QName("http://webservices/", "GetSeatPriceResponse");
    private final static QName _GetAvailableSeats_QNAME = new QName("http://webservices/", "GetAvailableSeats");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAvailableSeats }
     * 
     */
    public GetAvailableSeats createGetAvailableSeats() {
        return new GetAvailableSeats();
    }

    /**
     * Create an instance of {@link GetSeatPriceResponse }
     * 
     */
    public GetSeatPriceResponse createGetSeatPriceResponse() {
        return new GetSeatPriceResponse();
    }

    /**
     * Create an instance of {@link GetSeatPrice }
     * 
     */
    public GetSeatPrice createGetSeatPrice() {
        return new GetSeatPrice();
    }

    /**
     * Create an instance of {@link GetAvailableSeatsResponse }
     * 
     */
    public GetAvailableSeatsResponse createGetAvailableSeatsResponse() {
        return new GetAvailableSeatsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableSeatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "GetAvailableSeatsResponse")
    public JAXBElement<GetAvailableSeatsResponse> createGetAvailableSeatsResponse(GetAvailableSeatsResponse value) {
        return new JAXBElement<GetAvailableSeatsResponse>(_GetAvailableSeatsResponse_QNAME, GetAvailableSeatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeatPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "GetSeatPrice")
    public JAXBElement<GetSeatPrice> createGetSeatPrice(GetSeatPrice value) {
        return new JAXBElement<GetSeatPrice>(_GetSeatPrice_QNAME, GetSeatPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeatPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "GetSeatPriceResponse")
    public JAXBElement<GetSeatPriceResponse> createGetSeatPriceResponse(GetSeatPriceResponse value) {
        return new JAXBElement<GetSeatPriceResponse>(_GetSeatPriceResponse_QNAME, GetSeatPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableSeats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "GetAvailableSeats")
    public JAXBElement<GetAvailableSeats> createGetAvailableSeats(GetAvailableSeats value) {
        return new JAXBElement<GetAvailableSeats>(_GetAvailableSeats_QNAME, GetAvailableSeats.class, null, value);
    }

}
