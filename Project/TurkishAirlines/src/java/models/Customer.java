package models;

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
public class Customer extends Person {
    
    ArrayList<Seat> seats;
    
    public Customer(String f,String e, ArrayList<Seat> s)
    {
        super(f,e);
        seats = s;
    }
    
    public ArrayList<Seat> getCurrentBooking()
    {
        return seats;
    }
    
    public void setSeat(Seat s)
    {
        if(seats == null)
            seats = new ArrayList();
        
        seats.add(s);
    }
    
    
    public String getEmail()
    {
        return email;
    }
}
