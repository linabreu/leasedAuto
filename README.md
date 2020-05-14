# leasedAuto
Program demonstrates use of inheritence. A subclass luxuryLeasedAuto extends its superclass leasedAuto 

How It Works:

A fictitous company leases vehicles and charges different rates based on the number of seats in the vehicle (2 for a pickup, 5 for a standard sedan, 7 for a minivan, etc), with an additional charge for luxury models.

Program includes a super class called leasedAuto that includes a String for a description of the vehicle ("Sedan", "Pickup", etc); an integer for the number of seats in the vehicle; and a double for the daily rental rate. Leased Auto also contains

A constructor that accepts the description and the number of seats; which sets the daily rate as follows:

$50 for 4 or 5 seats

$60 for 2 seats

$55 for more than 5 seats

Get methods for all fields

LeasedAuto is extended to create LuxuryLeasedAuto. The constructor accepts the description and seats and sets the price as above, but with each price increased by $30.

TestLeasedAuto creates objects of both types and demonstrates that everything works correctly.
