/*
Lina Breunlin
Module 03 Programming Project
Part A

This is a superclass file for TestLeasedAuto. It contains the template to create leased auto objects

 */
package testleasedauto;


public class LeasedAuto 
{
    //declare instance variables
    String description;
    int numSeats;
    double dailyRate;
    
    
    /**set the description of the vehicle
    * @param vehicleDesc
    */
    public void setDescription (String vehicleDesc)
    {
        description = vehicleDesc;
    }

    /**set the number of seats
    * @param vehicleSeats
    */
    public void setNumSeats (int vehicleSeats)
    {
        numSeats = vehicleSeats;
    }
    
    /**sets daily rate
    * @param vehicleRate
    */   
    public void setDailyRate (double vehicleRate)
    {
        dailyRate = vehicleRate;
    }
    
    /**
    gets current value of description
    @return flavor
    */
    public String getDescription()
    {
        return description;
    }
    
    /**
    gets current value of number of seats
    @return numSeats
    */
    public int getNumSeats()
    {
        return numSeats;
    }
    
    /**
    gets current value of daily rate
    @return dailyRate
    */
    public double getDailyRate()
    {
        return dailyRate;
    }
    
     /**
    constructor method to create leasedVehicle objects
    @param vehicleDesc = description of the vehicle
    @param vehicleSeats = the number of seats
    
    **/
    
    public LeasedAuto (String vehicleDesc, int vehicleSeats) //no param for daily rate because that is calculated based on the number of seats
    {
        description = vehicleDesc;
        numSeats = vehicleSeats;
        
        if (numSeats <= 2)
        {
            dailyRate = 60.00;
        }
        else if (numSeats >= 4 && numSeats <=5)
        {
            dailyRate = 50.00;
        }
        else
        {
            dailyRate = 55.00;
        }
    }
   
}
