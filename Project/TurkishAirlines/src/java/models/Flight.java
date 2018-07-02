package models;


import java.sql.Date;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MuhammadHarris
 */
public class Flight {
    
    String flightName;
    
    ArrayList<Seat> seats;
    int totalSeats;
    int currentSeats;
    
    String departureCity;
    String arrivalCity;
    
    Date departureDate;
    Date arrivalDate;
    
    int economySeats;
    int businessSeats;
    int firstSeats;
    
    int oldESeats;
    int oldBSeats;
    int oldFSeats;
    int oldTSeats;
    
    public boolean isChanged;
    
    public Flight(boolean c, int oldE, int oldB, int oldF, int oldT,  String flightName, ArrayList<Seat> seats, int totalSeats, int currentSeats, String departureCity, String arrivalCity, Date departureDate, Date arrivalDate, int economySeats, int bSeats, int firstSeats)            
    {
        isChanged = c;
        
        oldESeats = oldE;
        oldBSeats = oldB;
        oldFSeats = oldF;
        oldTSeats = oldT;
        
        this.flightName = flightName;

        this.seats = seats;
        this.totalSeats = totalSeats;
        this.currentSeats = currentSeats;

        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;

        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;

        this.economySeats = economySeats;
        this.businessSeats = bSeats;
        this.firstSeats = firstSeats;        
    }
    
    public boolean isEmpty()
    {
        return (totalSeats==currentSeats);
    }
    
            
    public String getFlightName()
    {
        return flightName;
    }
    
    
    public int getOldESeats()
    {
        return oldESeats;
    }
    
    public int getOldBSeats()
    {
        return oldBSeats;
    }

    public int getOldFSeats()
    {
        return oldFSeats;
    }
    
    public int getOldTSeats()
    {
        return oldTSeats;
    }

    public int getEconomySeats()
    {
        return economySeats;
    }

    public int getBusinessSeats()
    {
        return businessSeats;
    }

    public int getFirstSeats()
    {
        return firstSeats;
    }

    public int getTotalSeats()
    {
        return totalSeats;
    }
    
    
    
    
    public void setOldESeats(int s)
    {
        oldESeats = s;
    }
    
    public void setOldBSeats(int s)
    {
        oldBSeats = s;
    }

    public void setOldFSeats(int s)
    {
        oldFSeats = s;
    }
    
    public void setOldTSeats(int s)
    {
        oldTSeats = s;
    }

    public void setEconomySeats(int s)
    {
        economySeats = s;
    }

    public void setBusinessSeats(int s)
    {
        businessSeats = s;
    }

    public void setFirstSeats(int s)
    {
        firstSeats = s;
    }

    public void setTotalSeats(int s)
    {
        totalSeats = s;
    }
    
    public void setCurrentSeats(int s)
    {
        currentSeats = s;
    }
    
    
    
    public String getDepartureCity()
    {
        return departureCity;
    }
    
    public String getArrivalCity()
    {
        return arrivalCity;
    }
    
    public Date getDepartureDate()
    {
        return departureDate;
    }
    
    public Date getArrivalDate()
    {
        return arrivalDate;
    }
    
    
    public int getCurrentSeats()
    {
        return currentSeats;
    }
    
    public void setCustomer (Customer c)            
    {
        seats.get(totalSeats-currentSeats).setCustomer(c);
        c.setSeat(seats.get(totalSeats-currentSeats));
        currentSeats--;
    }
    
    public void setSeats (ArrayList<Seat> s)
    {
        seats = s;
    }
}
