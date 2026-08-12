package odometer;

//TestOdometer.java
public class TestOdometer {
 public static void main(String[] args) {
     // Create two Odometer instances
     Odometer fuelEfficientCar = new Odometer();
     Odometer gasGuzzlerCar = new Odometer();

     // Set the fuel efficiency for each car
     fuelEfficientCar.setFuelEfficiency(40); // 40 miles per gallon
     gasGuzzlerCar.setFuelEfficiency(15); // 15 miles per gallon

     // Add miles driven to each car
     fuelEfficientCar.addMiles(200); // Fuel-efficient car drives 200 miles
     gasGuzzlerCar.addMiles(200); // Gas-guzzler drives 200 miles

     // Output the total gallons consumed for each car
     System.out.println("Fuel-efficient car total gallons consumed: " 
                         + fuelEfficientCar.getTotalGallonsConsumed());
     System.out.println("Gas-guzzler car total gallons consumed: " 
                         + gasGuzzlerCar.getTotalGallonsConsumed());
 }
}