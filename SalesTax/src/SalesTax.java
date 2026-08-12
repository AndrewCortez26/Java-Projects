/**
Bacillio A. Cortez 
Spring 2021
COSC 2436
Professor Woods
HW.4
*/
import javax.swing.*;  //import needed for Swing class
import java.awt.*;		//imports needed for ActionListener
import java.awt.event.ActionEvent;		
import java.awt.event.ActionListener;

public class SalesTax extends JFrame {

	private JPanel jpanel;	//references a panel 
	private JLabel label;
	private JTextField userinput;
	private JButton butt;
	private final int WINDOW_WIDTH = 310;	//creates window height
	private final int WINDOW_LENGTH = 100;	//creates window width

	//**This is the SalesTax constructor
public SalesTax()
{
	
	//the window title
	setTitle("Sales Tax Application");
	
	//set the size of the window
	setSize(WINDOW_WIDTH, WINDOW_LENGTH);
	
	// set application close option
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//build the panel and add it to frame.
	buildPanel();
	
	//add the panel to the frame's content pane.
	add(jpanel);
	
	//to display the window
	setVisible(true);
}


private void buildPanel()
{
	//adds a label to explain the instructions
	label = new JLabel("Enter your total sales to get a calculation with taxes");
	
	//creates a textfield component
	userinput = new JTextField("Total Sales: ");
	
	//creates a button component
	butt = new JButton("Calculate Taxes");
	//adds action listener to button
	butt.addActionListener(new buttButtonListener());
	
	//creates a JPanel object
	jpanel = new JPanel();

	//adds components to panel
	jpanel.add(label);
	jpanel.add(userinput);
	jpanel.add(butt);
}
	
//buttButtonListener is the action listener class the button
private class buttButtonListener implements ActionListener
{
	
	@Override
  public void actionPerformed(ActionEvent e) {
		//create state sales tax rate constant
		final double STATE_SALES_TAX = 0.04;
		//create County sales tax rate constant	
		final double COUNTY_SALES_TAX = 0.02;
		//variable to hold the user's answer from textfield
		String retrieve;
		//for tax number(value)
		double StateTaxes, CountyTaxes, total;
		
		//retrieve the input from user
		retrieve = userinput.getText();
		
		//convert input to double and do calculations
		StateTaxes = Double.parseDouble(retrieve)* STATE_SALES_TAX;
		CountyTaxes = Double.parseDouble(retrieve)*COUNTY_SALES_TAX;
		total = CountyTaxes + StateTaxes;
		
		//displays results to screen
		JOptionPane.showMessageDialog(null, "The Amount of County Sales Tax is:" + CountyTaxes + "\n "
				+ "The Amount of State sales tax: "+ StateTaxes + "\n" + 
										"The total sales tax is: " + total + ".");
	}
	
}

public static void main(String [] args) {
	new SalesTax();
}
	
}
