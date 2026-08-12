package odometer;

//Odometer.java
public class Odometer {
 private double milesDriven;
 private double fuelEfficiency; // in miles per gallon
 private double totalGallonsConsumed;

 // Constructor
 public Odometer() {
     milesDriven = 0;
     fuelEfficiency = 0;
     totalGallonsConsumed = 0;
 }

 // Mutator to reset the odometer
 public void resetOdometer() {
     milesDriven = 0;
     totalGallonsConsumed = 0;
 }

 // Mutator to set the fuel efficiency
 public void setFuelEfficiency(double mpg) {
     fuelEfficiency = mpg;
 }

 // Mutator to add miles driven to the odometer
 public void addMiles(double miles) {
     milesDriven += miles;
     totalGallonsConsumed = milesDriven / fuelEfficiency;
 }

 // Accessor to get the total miles driven
 public double getMilesDriven() {
     return milesDriven;
 }

 // Accessor to get the total gallons consumed
 public double getTotalGallonsConsumed() {
     return totalGallonsConsumed;
 }
}