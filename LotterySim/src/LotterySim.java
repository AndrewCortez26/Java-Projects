import java.util.Random;
import java.util.Scanner;

public class LotterySim {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1 = 0, num2 = 0, num3 = 0;
        boolean validInput = false;

        // Input validation loop
        while (!validInput) {
            System.out.println("Enter 3 numbers between 0 and 99 (inclusive):");

            try {
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                num3 = scanner.nextInt();

                if (num1 >= 0 && num1 < 100 && num2 >= 0 && num2 < 100 && num3 >= 0 && num3 < 100) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input: All numbers must be between 0 and 99.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input: Please enter valid integers.");
                scanner.next(); // Clear invalid input
            }
        }

        int iterations = 0;
        boolean numbersMatched = false;

        // Lottery simulation loop
        while (!numbersMatched) {
            iterations++;
            int random1 = random.nextInt(100);
            int random2 = random.nextInt(100);
            int random3 = random.nextInt(100);

            if (random1 == num1 && random2 == num2 && random3 == num3) {
                numbersMatched = true;
            }
        }

        // Output the number of iterations it took to match the user's numbers
        System.out.println("It took " + iterations + " iterations to match your numbers.");
    }
}
