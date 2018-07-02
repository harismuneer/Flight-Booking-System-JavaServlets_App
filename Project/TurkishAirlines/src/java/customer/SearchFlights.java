package customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.FBS;
import models.Features;
import models.Flight;
import java.io.IOException;
import java.util.Date;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MuhammadHarris
 */
public class SearchFlights extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Flight> flights = (ArrayList<Flight>) (getServletContext().getAttribute("flights"));

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        ArrayList<Flight> results = new ArrayList();
        
        /*
        for (int i = 0; i < flights.size(); i++)
        {            
            Flight f = flights.get(i);
                        
            if ((f.getDepartureCity().equals(request.getParameter("from"))) && (f.getArrivalCity().equals(request.getParameter("to")))  && (reportDate.equals(request.getParameter("depart"))))
            {                                
                if (f.getCurrentSeats() >= Integer.parseInt(request.getParameter("people")))
                {
                    if (request.getParameter("class").equals("Economy") && (f.getEconomySeats()>= Integer.parseInt(request.getParameter("people"))))
                    {
                        if (!f.isChanged && !Features.isChanged)                        
                            results.add(f);                                       
                    }
                    else if (request.getParameter("class").equals("Business") && (f.getBusinessSeats()>= Integer.parseInt(request.getParameter("people"))))
                    {
                        if (!f.isChanged && !Features.isChanged)                        
                            results.add(f);                                       
                    }
                    else if (request.getParameter("class").equals("First") && (f.getFirstSeats()>= Integer.parseInt(request.getParameter("people"))))
                    {
                        if (!f.isChanged && !Features.isChanged)                        
                            results.add(f);                                       
                    }
                }
            }            
        }
        */
        
        results.add(flights.get(1));
        request.setAttribute("results", results);
        request.getRequestDispatcher("ShowFlights.jsp").forward(request,response);

    }
}
