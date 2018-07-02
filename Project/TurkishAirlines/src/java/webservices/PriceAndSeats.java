package webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import models.FBS;


@WebService(serviceName = "PriceAndSeats")
public class PriceAndSeats 
{    
    @WebMethod(operationName = "GetSeatPrice")
    public int getPrice(@WebParam(name = "origin") String origin,@WebParam(name = "destination") String destination)
    {
        return FBS.getPrice(origin,destination);
    }    
    
    @WebMethod(operationName = "GetAvailableSeats")
    public int getSeats(@WebParam(name = "flightNumber") String flightNumber,@WebParam(name = "arrivalDate") String date)
    {
        return FBS.getSeats(flightNumber,date);
    }        
}
