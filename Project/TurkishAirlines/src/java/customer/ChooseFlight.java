package customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.Customer;
import models.Flight;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author MuhammadHarris
 */
public class ChooseFlight extends HttpServlet {


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
        
        f.setCustomer((Customer)(request.getSession().getAttribute("customer")));
        
        /*
        //CODE TO SEND EMAIL
        
        
        final String username = "your email";
        final String password = "your email account's password";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                }
          });

        try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("your email"));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(((Customer)(request.getSession().getAttribute("customer"))).getEmail() ));
                message.setSubject("Your Itinery");
                message.setText("Departure City:" + f.getDepartureCity() + " Arrival City:" + f.getArrivalCity() + " Departure Date:" + f.getDepartureDate() + " Arrival Date:" + f.getArrivalDate());

                Transport.send(message);


        } catch (MessagingException e) {
        }       
        */
        
        request.getRequestDispatcher("CurrentBooking.do").forward(request, response);
    }

}
