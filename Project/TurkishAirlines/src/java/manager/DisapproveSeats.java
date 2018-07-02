package manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.FBS;
import models.Flight;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MuhammadHarris
 */
public class DisapproveSeats extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Flight> flights = (ArrayList<Flight>) (getServletContext().getAttribute("flights"));

        Flight f = null;
        
        for (int i = 0; i < flights.size(); i++)
        {
            if (flights.get(i).getFlightName().equals(request.getParameter("flight_name")))
            {
                f = flights.get(i);
                break;
            }            
        }
        
        f.setEconomySeats(f.getOldESeats());
        f.setBusinessSeats(f.getOldBSeats());
        f.setFirstSeats(f.getOldFSeats());
        f.setTotalSeats(f.getOldTSeats());
        f.setCurrentSeats(f.getTotalSeats());
        
        f.setOldESeats(0);
        f.setOldBSeats(0);
        f.setOldFSeats(0);
        f.setOldTSeats(0);

        f.isChanged = false;
        response.sendRedirect("ApproveSeats.jsp");
    }
}
