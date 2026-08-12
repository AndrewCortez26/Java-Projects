import java.util.Scanner;





public class PrimeMain {

	public static void main(String [] args) {
			
		
		Scanner s = new Scanner(System.in);
		String yesOrNo;
		
		do {
		System.out.println("enter a positive number: ");
		int number = s.nextInt();
		
		//call method
		prime(number);
			
		printNums(number);	
			
			
		System.out.print("Would you like to enter another number: ");
		yesOrNo = s.next();
			
		}while(yesOrNo.equalsIgnoreCase("yes"));
		
	}
	
	//method to check if the number is prime
	public static boolean prime(int number) {
		
		for(int i = 2; i<=Math.sqrt(number); i++) {
			if(number % i != 0) {
				continue;
			}
			return false;
		}
		return true;
		
	}
	
	//method to print out the prime numbers
	
	public static void printNums(int nums) {
		System.out.println("The following are all the prime numbers from 2 up to " + nums + ": ");
		
		for(int i = 2; i <= nums; i++) {
			if(prime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	
	

}
