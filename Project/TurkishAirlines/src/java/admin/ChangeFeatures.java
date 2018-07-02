package admin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.Features;
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
public class ChangeFeatures extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Features> f = (ArrayList<Features>) (getServletContext().getAttribute("features"));
        
        char[] s = {'e','b','f'};
                
        
        for (int i = 0; i < 3; i++)
        {
            //Saving old values
            (f.get(i)).setNewSeatPitch( f.get(i).getSeatPitch() );
            (f.get(i)).setNewSeatWidth( f.get(i).getSeatWidth() );            
            (f.get(i)).setNewVideoType( f.get(i).getVideoType() );            
            (f.get(i)).setNewPowerType( f.get(i).getPowerType() );            
            (f.get(i)).setNewSeatType( f.get(i).getSeatType() );            
            (f.get(i)).setNewPrice( f.get(i).getPrice() );
            
            //Setting new values temporarily
            (f.get(i)).setSeatPitch( (Double.parseDouble(request.getParameter("seat_pitch_" + s[i])))  );
            (f.get(i)).setSeatWidth( (Double.parseDouble(request.getParameter("seat_width_" + s[i])))  );
            (f.get(i)).setVideoType( (request.getParameter("video_" + s[i]))  );
            (f.get(i)).setPowerType( (request.getParameter("power_" + s[i]))  );
            (f.get(i)).setSeatType ( (request.getParameter("seat_type_" + s[i]))  );
            (f.get(i)).setPrice ( Integer.parseInt(request.getParameter("price_" + s[i]))  );            
            
        }
        
        f.get(1).setNewWifi( f.get(1).getWifi());
        f.get(2).setNewWifi( f.get(2).getWifi());
       
        f.get(1).setWifi( request.getParameter("wifi_b"));
        f.get(2).setWifi( request.getParameter("wifi_f"));
        
        f.get(2).setNewSpecialFood(f.get(2).getSpecialFood());
        f.get(2).setSpecialFood( request.getParameter("special_food_f"));       
        
        Features.isChanged = true;
        
        response.sendRedirect("ChangeFeatures.jsp");
    }


}
