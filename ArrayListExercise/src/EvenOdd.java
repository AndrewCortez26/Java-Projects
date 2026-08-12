import java.util.ArrayList;
import java.util.Random;


public class EvenOdd {

	public static void main(String[] args) {
	
		 // Step 1 & 2: Generate random numbers and store them in a 5x5 2D array
        int[][] numbers = new int[5][5];
        Random rand = new Random();

        // Step 3 & 4: ArrayLists to store even and odd numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        System.out.println("Generated 5x5 2D Array of Random Numbers:");

        // Fill the 2D array and classify numbers as even or odd
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = rand.nextInt(100); // Numbers in the range {0, 1, ..., 99}
                System.out.print(numbers[i][j] + "\t"); // Display the generated number
                
                // Step 5: Add even numbers to evenNumbers list and odd numbers to oddNumbers list
                if (numbers[i][j] % 2 == 0) {
                    evenNumbers.add(numbers[i][j]);
                } else {
                    oddNumbers.add(numbers[i][j]);
                }
            }
            System.out.println();
        }

        // Step 6: Display the contents of the evenNumbers ArrayList
        System.out.println("\nEven Numbers:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        // Step 6: Display the contents of the oddNumbers ArrayList
        System.out.println("\n\nOdd Numbers:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
		
	}
}
