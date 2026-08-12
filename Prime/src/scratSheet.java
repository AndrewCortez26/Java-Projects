import java.util.Scanner;

public class scratSheet {

	// Method to check if a number is prime
    public static boolean isPrime(int number) {
       
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i != 0) {
                continue;
            }
            return false;
        }
        return true;
    }

    // Method to print prime numbers up to a given limit
    public static void printPrimesUpTo(int limit) {
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();  // Print a new line after the primes
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        do {
            System.out.print("Enter a number to find prime numbers up to that value: ");
            int number = scanner.nextInt();
            
            // Print prime numbers up to the entered number
            printPrimesUpTo(number);
            
            // Ask the user if they want to continue
            System.out.print("Do you want to find primes for another number? (yes/no): ");
            userChoice = scanner.next();
            
        } while (userChoice.equalsIgnoreCase("yes"));

    }
	}

