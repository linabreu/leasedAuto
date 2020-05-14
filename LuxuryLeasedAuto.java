/*
Lina Breunlin
Module 03 Programming Project
Part A

This is a subclass file for TestLeasedAuto. It contains the template to create Luxury leased auto objects. 
 */
package testleasedauto;


public class LuxuryLeasedAuto extends LeasedAuto
{
     /**
    constructor method to create leasedVehicle objects
    @param vehicleDesc = description of the vehicle
    @param vehicleSeats = the number of seats
    
    **/
    
    public LuxuryLeasedAuto (String vehicleDesc, int vehicleSeats) //no param for daily rate because that is calculated based on the number of seats
    {
        super (vehicleDesc,vehicleSeats);
        
        if (numSeats <= 2)
        {
            dailyRate = 90.00;
        }
        else if (numSeats >= 4 && numSeats <=5)
        {
            dailyRate = 80.00;
        }
        else
        {
            dailyRate = 85.00;
        }
    }
}
