import java.io.File;
import java.net.URISyntaxException;
import models.Customer;
import models.FBS;
import models.Features;
import models.Flight;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;


public class SContextListener implements ServletContextListener 
{

    @Override
    public void contextInitialized(ServletContextEvent event) 
    {
        
        ServletContext sc = event.getServletContext();
        
        //get db path
        String p = "";

        try 
        {
            p = new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getPath() + "\\airlines.accdb";
        }
        catch (URISyntaxException ex) 
        {
            System.out.println("Error loading database file.");
        }

        String host =   "jdbc:ucanaccess://" + p;
                
        // Step 1: Loading or registering Oracle JDBC driver class
        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {

            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }
        
        try 
        {
            Connection con = DriverManager.getConnection(host);
            
            sc.setAttribute("con", con);
            
            FBS fbs = new FBS();
            
            ArrayList<Features> f = fbs.populateFeatures(con);
            ArrayList<Customer> customers = fbs.populateCustomers(con);            
            ArrayList<Flight> flights = fbs.getAllFlights(con,customers,f);
                      
            sc.setAttribute("features",f);            
            sc.setAttribute("fbs",fbs);
            sc.setAttribute("flights", flights);
            sc.setAttribute("customers", customers);            
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(SContextListener.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Context Listener: " + ex.getMessage());
        }
    }

    
            
    @Override
    public void contextDestroyed(ServletContextEvent sce) 
    {
        System.out.println("Context Destroyed!!!!!!!!!");
    }
}
