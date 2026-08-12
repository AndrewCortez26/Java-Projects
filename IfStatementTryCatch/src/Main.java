
import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		
		
		try {
			
		System.out.print("Enter the first number: ");
		double num1 = Double.parseDouble(s.nextLine());
		
		System.out.print("Enter the second number: ");
		double num2 = Double.parseDouble(s.nextLine());
		
		if(num1 > num2) {
			System.out.println("The first number (" + num1 + ") is larger.");
			} else if (num1 < num2){
				System.out.println("The second number (" + num2 + ") is larger.");
			}else {
				System.out.println("Both numbers are equal.");
			}
		
		
		} catch (NumberFormatException e) {
			
			System.out.println("Invalid input! Please enter valid numbers!");		
			
		}
		
	}

	
	
	
	
}
