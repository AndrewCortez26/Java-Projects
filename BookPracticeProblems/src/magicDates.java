
import javax.swing.JOptionPane;

/**
 * @author Andrew
 *
 *2. Magic Dates: The date June 10, 1960, is special because when we write it in the following format, the month times the day equals the year: 6/10/60
 *	 Write a program that asks the user to enter in a month (in numeric form), a day, and a two digit year. The program should then determine whether the month times the day equals to the year. If so, it should display
 *	 a message saying the date is magic. Otherwise, it should display an error message.
 *
 *
 *
 *	hello enter a numerical month(1-12) --> [month]
 *	enter the day -->  [day]
 *	enter the last two digits of year [year]
 *
 *	if(month*day = year)
 *			specialdate
 *		else
 *			Error
 */


public class magicDates {

	public static void main(String[] args) {
		
		String outMonth, outDay, outYear;
		int month, day, year;
		boolean inBounds = false;
		
		outMonth = JOptionPane.showInputDialog(null, "Please enter numerical month (1 - 12): ");
		month = Integer.parseInt(outMonth);
		
		//if-statement checks if month is legit
		if((month <= 12)&&(month >= 1)) {
			inBounds = true;
		}else {
			JOptionPane.showMessageDialog(null, "Error.");
		}
		
		outDay = JOptionPane.showInputDialog(null, "Please enter day: ");
		day = Integer.parseInt(outDay);
		
		outYear = JOptionPane.showInputDialog(null, "Please enter two digit year: ");
		year = Integer.parseInt(outYear); 
		
		//if Month is valid, then the final operations below are performed
			if(inBounds) {
			
			int check = month*day;
			if(check == year) {
				JOptionPane.showMessageDialog(null, "You've got a very special date.");
			}else {
				JOptionPane.showMessageDialog(null, "Error: No Special date.");
			}
		}

	}

}
