/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.Customer;
import models.FBS;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MuhammadHarris
 */
public class LoginManager extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if(request.isUserInRole("Admin"))
        {
            response.sendRedirect("ChangeFeatures.jsp");
        }
        else if(request.isUserInRole("Manager"))
        {
            response.sendRedirect("ApproveFeatures.jsp");
        }
        else if(request.isUserInRole("Customer"))
        {
                if (request.getSession().getAttribute("customer") == null){
                 HttpSession s = request.getSession();
                String customerEmail = request.getRemoteUser();

                ArrayList<Customer> c = (ArrayList<Customer>)(getServletContext().getAttribute("customers"));
                
                for(int i = 0; i < c.size(); i++)
                {
                    if (c.get(i).getEmail().equals(customerEmail))
                    {
                        s.setAttribute("customer", c.get(i));      
                        break;                                  
                   }
                }
                }
            
            request.getRequestDispatcher("CurrentBooking.do").forward(request, response);            
        }
        else
            response.sendRedirect("home.jsp");
    }
}
