/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wstester;

import webservices.PriceAndSeats;
import webservices.PriceAndSeats_Service;

/**
 *
 * @author MuhammadHarris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PriceAndSeats proxy = (new PriceAndSeats_Service()).getPriceAndSeatsPort();
    
        System.out.println("--------------------------------------------");
        System.out.println("Available Seats in Pk-789 for 10/11/2017 are: " + proxy.getAvailableSeats("PK-789", "10/11/2017"));
        System.out.println("Price of a Seat for Lahore to Karachi is: " + proxy.getSeatPrice("Lahore", "Karachi") + "$");        
        System.out.println("--------------------------------------------");        
    }
    
}
