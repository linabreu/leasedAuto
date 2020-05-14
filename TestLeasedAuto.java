/*
Lina Breunlin
Module 03 Programming Project
This is the tester class for the leased auto and luxury leased auto objects

test cases:

LeasedAuto object properties: 
    Honda Civic Sedan, 5, *has 5 seats so it should cost 50/day to rent if the logic works correctly
Output:
The vehicle you have selected to rent is: Honda Civic Sedan
The vehicle will seat 5 passengers
The daily rental price for this vehicle is: $ 50.00

Luxury Leased Auto object properties: 
    Rolls Royce Sedan, 5, *has 5 seats so should cost 80/day to rent bc luxury is + $30
Output:
The vehicle you have selected to rent is: Rolls Royce Sedan
The vehicle will seat 5 passengers
The daily rental price for this vehicle is: $ 80.00

 */

package testleasedauto;

public class TestLeasedAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // instantiate objects
       LeasedAuto testAuto = new LeasedAuto ("Honda Civic Sedan", 5);
       LuxuryLeasedAuto testLuxury = new LuxuryLeasedAuto ("Rolls Royce Sedan", 5);
    
    
     //demonstrate the leased auto class
        System.out.println("*****************Rental Summary*****************");
        System.out.println ("The vehicle you have selected to rent is: " + testAuto.getDescription());
        System.out.println ("The vehicle will seat " + testAuto.getNumSeats() + " " + "passengers");
        System.out.printf("The daily rental price for this vehicle is: " + "$" + "%6.2f",testAuto.getDailyRate());
        System.out.println();
        System.out.println("Thank you for renting with Estrella Autos!"); 
        
        
        System.out.println();
        System.out.println();
        
    //demonstrate luxury leased auto class
        System.out.println("*****************Luxury Rental Summary*****************");
        System.out.println ("The vehicle you have selected to rent is: " + testLuxury.getDescription());
        System.out.println ("The vehicle will seat " + testLuxury.getNumSeats() + " " + "passengers");
        System.out.printf("The daily rental price for this vehicle is: " + "$" + "%6.2f",testLuxury.getDailyRate());
        System.out.println();
        System.out.println("Thank you for renting with Estrella Autos!"); 
    
    
    
    
    
    
    }
    
    
    

    
    
    
    
    
    
    
    
}
