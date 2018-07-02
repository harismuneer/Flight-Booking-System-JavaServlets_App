package models;


import models.Features;
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
public class Seat {
    
    int seatNumber;
    Flight flight;
    Features features;
    Customer c;
    
    public Seat(int sNumber, Flight flight, Features features, Customer c)
    {
        seatNumber = sNumber;
        this.flight = flight;
        this.features = features;
        this.c = c;
    }
    
    
    public Flight getFlight()
    {
        return flight;
    }
    
    public void setCustomer(Customer c)
    {
        this.c = c;
    }
    
    public int getSeatNumber()
    {
        return seatNumber;
    }
            
            
    
}
