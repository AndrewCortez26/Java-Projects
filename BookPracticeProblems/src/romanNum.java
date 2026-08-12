import javax.swing.JOptionPane;

/**
 * @author Bacillio A. Cortez
 * 
 * 1. Roman numerals: write a program that prompts the user to enter a number within the range of 1 - 10. TYhe program should display the roman numeral version of that number. If the number entered is outside that range, 
 *    The program should display an error message.  
 * 
 */




public class romanNum {

	public static void main(String[] args) {
		
		String holdText;
		int numValue;
		//I will utilize a case statement after receiving user input. A if-else statement should also be used to determine whether or not the number is in bounds.
		holdText = JOptionPane.showInputDialog(null, "Hello please enter a number from 1-10: ");
		JOptionPane.showMessageDialog(null, "Thank You.");
		numValue = Integer.parseInt(holdText);
		
		if((numValue <= 10) && (numValue >= 1)){
			
			switch(numValue) {
			
			case 1:
				JOptionPane.showMessageDialog(null, "Your number is: I ");	
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Your number is: II ");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Your number is: III ");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Your number is: IV ");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Your number is: V ");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Your number is: VI ");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Your number is: VII ");
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Your number is: VIII ");
				break;
			case 9: 
				JOptionPane.showMessageDialog(null, "Your number is: IX ");
				break;
			case 10:
				JOptionPane.showMessageDialog(null, "Your number is: X ");
				break;
				//default: JOptionpane.showMessageDialog(null, "Out of range.");
				//break;
			}
		}
			else {
			JOptionPane.showMessageDialog(null, "Error: Invalid Number.");
		}
		
	}

	}
