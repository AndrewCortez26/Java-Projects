package dog_hospital;

import java.util.Scanner;

//Class representing a Pet
class Pet {
private String name;
private String type;

// Constructor to initialize pet details
public Pet(String name, String type) {
   this.name = name;
   this.type = type;
}

// Getter method for pet's name
public String getName() {
   return name;
}

// Method to display pet details
public void displayPetInfo() {
   System.out.println("Pet Name: " + name + ", Type: " + type);
}
}

//Class representing the Pet Hospital System
class PetHospital {
private Pet[] pets = new Pet[10]; // Limit to 10 pets for simplicity
private int petCount = 0;
private Scanner scanner = new Scanner(System.in);

// Method to add a pet to the hospital
public void addPet() {
   if (petCount >= pets.length) {
       System.out.println("Hospital is full. Cannot add more pets.");
       return;
   }

   System.out.print("Enter pet's name: ");
   String name = scanner.nextLine();
   System.out.print("Enter pet's type (e.g., Dog, Cat): ");
   String type = scanner.nextLine();

   Pet newPet = new Pet(name, type);
   pets[petCount] = newPet;
   petCount++;

   System.out.println("Pet added successfully.");
}

// Method to display all pets in the hospital
public void showAllPets() {
   if (petCount == 0) {
       System.out.println("No pets in the hospital.");
   } else {
       System.out.println("List of pets in the hospital:");
       for (int i = 0; i < petCount; i++) {
           pets[i].displayPetInfo();
       }
   }
}

// Recursive method to count the number of pets in the hospital
public int countPets(int index) {
   if (index == petCount) {
       return 0;
   }
   return 1 + countPets(index + 1);
}

// Method to schedule an appointment for a pet
public void scheduleAppointment() {
   if (petCount == 0) {
       System.out.println("No pets available for scheduling an appointment.");
       return;
   }

   System.out.print("Enter the name of the pet for the appointment: ");
   String petName = scanner.nextLine();

   Pet foundPet = findPetByName(petName);
   if (foundPet != null) {
       System.out.println("Appointment scheduled for " + foundPet.getName());
   } else {
       System.out.println("Pet not found.");
   }
}

// Helper method to find a pet by name
private Pet findPetByName(String name) {
   for (int i = 0; i < petCount; i++) {
       if (pets[i].getName().equalsIgnoreCase(name)) {
           return pets[i];
       }
   }
   return null;
}

// Method to get a valid pet age with exception handling (for demonstration)
public int getValidAge() {
   int age = 0;
   boolean valid = false;
   while (!valid) {
       try {
           System.out.print("Enter the pet's age: ");
           age = Integer.parseInt(scanner.nextLine());
           if (age < 0) {
               throw new IllegalArgumentException("Age cannot be negative.");
           }
           valid = true;
       } catch (NumberFormatException e) {
           System.out.println("Invalid input. Please enter a valid number.");
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
   }
   return age;
}

// Method to display the main menu and interact with the system
public void mainMenu() {
   boolean exit = false;

   while (!exit) {
       System.out.println("\n--- Pet Hospital System ---");
       System.out.println("1. Add Pet");
       System.out.println("2. Show All Pets");
       System.out.println("3. Schedule Appointment");
       System.out.println("4. Count Pets");
       System.out.println("5. Exit");
       System.out.print("Choose an option: ");

       int choice = Integer.parseInt(scanner.nextLine());

       switch (choice) {
           case 1:
               addPet();
               break;
           case 2:
               showAllPets();
               break;
           case 3:
               scheduleAppointment();
               break;
           case 4:
               int totalPets = countPets(0);
               System.out.println("Total pets in the hospital: " + totalPets);
               break;
           case 5:
               exit = true;
               System.out.println("Exiting Pet Hospital System. Goodbye!");
               break;
           default:
               System.out.println("Invalid option. Please try again.");
       }
   }
}
}