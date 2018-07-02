package manager;

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
public class DisapproveFeatures extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Features> f = (ArrayList<Features>) (getServletContext().getAttribute("features"));
                                
        for (int i = 0; i < 3; i++)
        {

            (f.get(i)).setSeatPitch( f.get(i).getNewSeatPitch() );
            (f.get(i)).setSeatWidth( f.get(i).getNewSeatWidth() );            
            (f.get(i)).setVideoType( f.get(i).getNewVideoType() );            
            (f.get(i)).setPowerType( f.get(i).getNewPowerType() );            
            (f.get(i)).setSeatType( f.get(i).getNewSeatType() );            
            (f.get(i)).setPrice( f.get(i).getNewPrice() );
            (f.get(i)).setWifi( f.get(i).getNewWifi() );
            (f.get(i)).setSpecialFood( f.get(i).getNewSpecialFood() );


            (f.get(i)).setNewSeatPitch( 0);
            (f.get(i)).setNewSeatWidth( 0);            
            (f.get(i)).setNewVideoType( null);            
            (f.get(i)).setNewPowerType( null);            
            (f.get(i)).setNewSeatType( null);            
            (f.get(i)).setNewPrice( 0);
            (f.get(i)).setNewWifi( null);
            (f.get(i)).setNewSpecialFood( null);
                        
        }

        Features.isChanged = false;
        
        response.sendRedirect("ApproveFeatures.jsp");
    }


}
