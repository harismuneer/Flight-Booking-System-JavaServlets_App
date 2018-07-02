package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MuhammadHarris
 */


public class Features {
    
    static public boolean isChanged = false;
       
    int type;
    
    public int price;
    int newPrice;
    
    
    double seatPitch;
    double seatWidth;
    
    Double newSeatPitch;
    Double newSeatWidth;
    
    String videoType;
    String newVideoType;
    
    String seatType;
    String newSeatType;
    
    String powerType;
    String newPowerType;
    
    
    String wifi;
    String newWifi;
    
    String specialFood;
    String newSpecialFood;
    
    
    public Features(int price, int newPrice, int t, boolean c, double sp, double sw, double newSp, double newSw, String vt, String newVt, String st, String newSt, String pt, String newPt, String w, String newW, String sf, String newSf)
    {
        this.price = price;
        this.newPrice = newPrice;
        type = t;
        isChanged = c;
        
        seatPitch = sp;
        seatWidth = sw;
        newSeatPitch = newSp;
        newSeatWidth = newSw;
        
        videoType = vt;
        newVideoType = newVt;
        
        seatType = st;
        newSeatType = newSt;
        
        powerType = pt;
        newPowerType = newPt;
        
        wifi = w;
        newWifi = newW;

        specialFood = sf;
        newSpecialFood = newSf;        
    }
    
    
    public int getPrice()
    {
        return price;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
       
    public int getNewPrice()
    {
        return newPrice;
    }
    
    public void setNewPrice(int price)
    {
        newPrice = price;
    }
    
    public double getSeatPitch()
    {
        return seatPitch;
    }

    public double getSeatWidth()
    {
        return seatWidth;
    }
    
    public boolean getIsChanged()
    {
        return isChanged;
    }
        
    public void setSeatPitch(double s)
    {
        seatPitch = s;
    }
    
    public void setSeatWidth(double s)
    {
        seatWidth = s;
    }
    
    public void setIsChanged(boolean c)
    {
        isChanged = c;
    }

        
    public double getNewSeatPitch()
    {
        return newSeatPitch;
    }

    public double getNewSeatWidth()
    {
        return newSeatWidth;
    }
        
    public void setNewSeatPitch(double s)
    {
        newSeatPitch = s;
    }
    
    public void setNewSeatWidth(double s)
    {
        newSeatWidth = s;
    }

        
    public String getVideoType()
    {
        return videoType;
    }
    
    public void setVideoType(String v)
    {
        videoType = v;
    }
    
    
    public String getNewVideoType()
    {
        return newVideoType;
    }

    public void setNewVideoType(String v)
    {
        newVideoType = v;
    }    



    public String getSeatType()
    {
        return seatType;
    }
    
    public void setSeatType(String s)
    {
        seatType = s;
    }
    
    
    public String getNewSeatType()
    {
        return newSeatType;
    }

    public void setNewSeatType(String s)
    {
        newSeatType = s;
    }    



    public String getPowerType()
    {
        return powerType;
    }
    
    public void setPowerType(String p)
    {
        powerType = p;
    }
    
    
    public String getNewPowerType()
    {
        return newPowerType;
    }

    public void setNewPowerType(String p)
    {
        newPowerType = p;
    }    

    
    
    public String getWifi()
    {
        return wifi;
    }
    
    public void setWifi(String w)
    {
        wifi = w;
    }
    
    
    public String getNewWifi()
    {
        return newWifi;
    }

    public void setNewWifi(String w)
    {
        newWifi = w;
    }    
    



    public String getSpecialFood()
    {
        return specialFood;
    }
    
    public void setSpecialFood(String f)
    {
        specialFood = f;
    }
    
    
    public String getNewSpecialFood()
    {
        return newSpecialFood;
    }

    public void setNewSpecialFood(String f)
    {
        newSpecialFood = f;
    }    
    
    
}
