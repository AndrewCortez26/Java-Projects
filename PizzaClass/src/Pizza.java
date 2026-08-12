import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {
    // Private instance variables
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    // Constructor
    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size.toLowerCase();
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    // Method to calculate the cost of the pizza
    public double calcCost() {
        int basePrice;
        switch (size) {
            case "small":
                basePrice = 10;
                break;
            case "medium":
                basePrice = 12;
                break;
            case "large":
                basePrice = 14;
                break;
            default:
                basePrice = 0;
                break;
        }
        int totalToppings = cheeseToppings + pepperoniToppings + hamToppings;
        return basePrice + (totalToppings * 2);
    }

    // Method to get the description of the pizza
    public String getDescription() {
        return "Size: " + size + ", Cheese Toppings: " + cheeseToppings +
               ", Pepperoni Toppings: " + pepperoniToppings + ", Ham Toppings: " + hamToppings +
               ", Cost: $" + calcCost();
    }

    // Static method to run the pizza ordering process
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pizza> pizzas = new ArrayList<>();
        String orderMore;

        do {
            // Input pizza size
            System.out.print("Enter pizza size (small, medium, large): ");
            String size = scanner.nextLine();

            // Input number of cheese toppings
            System.out.print("Enter number of cheese toppings: ");
            int cheeseToppings = scanner.nextInt();

            // Input number of pepperoni toppings
            System.out.print("Enter number of pepperoni toppings: ");
            int pepperoniToppings = scanner.nextInt();

            // Input number of ham toppings
            System.out.print("Enter number of ham toppings: ");
            int hamToppings = scanner.nextInt();

            // Create a new pizza object and add to list
            Pizza pizza = new Pizza(size, cheeseToppings, pepperoniToppings, hamToppings);
            pizzas.add(pizza);

            // Clear buffer
            scanner.nextLine();

            // Ask user if they want to order another pizza
            System.out.print("Do you want to order another pizza? (yes/no): ");
            orderMore = scanner.nextLine();
        } while (orderMore.equalsIgnoreCase("yes"));

        // Output the description of each pizza and the total cost
        double totalCost = 0;
        System.out.println("\nOrder Summary:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getDescription());
            totalCost += pizza.calcCost();
        }

        System.out.println("Total cost of all pizzas: $" + totalCost);

        // Close the scanner
        scanner.close();
    }
}
