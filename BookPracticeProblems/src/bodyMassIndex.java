

import javax.swing.JOptionPane;

/**
 * @author Bacillio A. Cortez
 * 
 * 3. Body Mass Index: Write a problem that calculates and display's a person's body mass index (BMI). The BMI is often used to determine whether a person is overweight or underweight for his or her height. 
 * 	  A person's BMI is calculated with the following formula: BMI = Weight * 703/Height^2
 * 	  Where weight is measured in pounds and Height is measured in inches. The program should display a message indicating whether the person has optimal weight, is underweight, or is overweight. A sedentary person's weight is consodered 
 * 	  optimal if his/her BMI is between 18.5 and 25. If BMI is less than 18.5, then they are underweight. If the BMI is greater than 25, then they are overweight.
 * 
 * 
 * ask weight in pounds [str weight] --> double
 * ask height in Inches [str height] --> double 
 * calculate double BMI = weight * 703/height^2
 * if(BMI > 18.5 && BMI <= 25)
 * 				optimal
 * else if(BMI < 18.5)
 * 				underweight
 * else(BMI > 25 )
 * 				overweight
 * 
 *
 */



public class bodyMassIndex {

	public static void main(String[] args) {
	
		double BMI, weight, height;
		
		
		weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter weight in lbs. :  "));
		height = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter height in inches: "));
		
		BMI = weight * (703/(height*height));
		
		if((BMI <= 25)&&(BMI >= 18.5)) {
				JOptionPane.showMessageDialog(null, String.format("You are optimal weight with a BMI of: %.2f ", BMI));
		}else if(BMI < 18.5) {
			JOptionPane.showMessageDialog(null, String.format("You are underweight with a BMI of: %.2f", BMI));
		}else {
			JOptionPane.showMessageDialog(null, String.format("You are overweight with a BMI of: %.2f", BMI));
		}
	}

}
