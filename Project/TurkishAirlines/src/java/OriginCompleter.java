import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;

import models.FBS;

public class OriginCompleter extends HttpServlet 
{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    {
        response.setContentType("application/json");

        try 
        {
            ServletContext sc = getServletContext();

            String term = request.getParameter("term");

            ArrayList<String> list = ((FBS) (sc.getAttribute("fbs"))).getCities((Connection) sc.getAttribute("con"), term);

            String searchList = new Gson().toJson(list);

            response.getWriter().write(searchList);
        } 
        catch (Exception e) 
        {
            System.err.println(e.getMessage());
        }
    }
    
    
}