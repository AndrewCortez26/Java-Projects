
	import java.util.Scanner;

	public class main {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String userChoice;

	        do {
	            // Ask user to input a string
	            System.out.print("Enter a string or a series of characters: ");
	            String inputString = scanner.nextLine();

	            int numShifts = 0;
	            boolean validShift = false;

	            // Loop to get a valid number of shifts
	            while (!validShift) {
	                try {
	                    System.out.print("Enter the number of left shifts: ");
	                    numShifts = Integer.parseInt(scanner.nextLine());
	                    if (numShifts >= 0) {
	                        validShift = true; // Exit loop if input is valid
	                    } else {
	                        System.out.println("Please enter a non-negative integer.");
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid input! Please enter a valid integer.");
	                }
	            }

	            // Perform the left shift
	            String shiftedString = leftShiftString(inputString, numShifts);

	            // Display the shifted result
	            System.out.println("Shifted String: " + shiftedString);

	            // Ask the user if they want to continue
	            System.out.print("Do you want to shift another string? (yes/no): ");
	            userChoice = scanner.nextLine();

	        } while (userChoice.equalsIgnoreCase("yes"));

	        System.out.println("Goodbye!");
	        scanner.close();
	    }

	    // Function to perform left shift on a string
	    public static String leftShiftString(String str, int shifts) {
	        int length = str.length();
	        if (length == 0) return str;  // Return an empty string if input is empty

	        // Reduce the number of shifts in case it's larger than the string length
	        shifts = shifts % length;

	        // Perform the left shift by substring manipulation
	        String shiftedStr = str.substring(shifts) + str.substring(0, shifts);
	        return shiftedStr;
	    }
	}

