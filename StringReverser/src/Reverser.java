import java.util.Scanner;

public class Reverser {


	
	public static void main(String[] args) {
		 String input;
		 String updatedString;
		
		System.out.println("Please enter a string to reverse: ");
		Scanner keyboard = new Scanner(System.in);
		input = keyboard.nextLine();
		keyboard.close();
		updatedString = StringRev(input);
		System.out.println("Your string reversed: " + updatedString);
		System.exit(0);
	}

	public static String StringRev(String input) {
		if(input.isEmpty())
			return input;
			
			return StringRev(input.substring(1)) + input.charAt(0);
		}
	}
	
