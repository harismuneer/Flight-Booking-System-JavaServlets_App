package customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.Customer;
import models.Seat;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MuhammadHarris
 */
public class CurrentBooking extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Customer customer = (Customer)(request.getSession(false).getAttribute("customer"));

        ArrayList<Seat> seats = customer.getCurrentBooking();
        
        request.setAttribute("seats", seats);
                
        request.getRequestDispatcher("CurrentBooking.jsp").forward(request,response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Customer customer = (Customer)(request.getSession(false).getAttribute("customer"));

        ArrayList<Seat> seats = customer.getCurrentBooking();
        
        request.setAttribute("seats", seats);
                
        request.getRequestDispatcher("CurrentBooking.jsp").forward(request,response);
    }    
}
