/**
Bacillio A. Cortez
COSC 2436
Spring 2021
HW.4
Proffesor Woods
*/


/**
Joes Automotive, pg 449 #6
Create a GUI application that displays the total for a customers visit to Joe's.(20 dollars an hour)
Oil change:	$26
Lube job:	$18
Radiator flush:	$30
Transmission flush: $80
Inspection:	$15
Muffler replacement: $100
Tire rotation:$20
Non-routine services: $20 per hour
*/


import javax.swing.*;  //import for swing class
import java.awt.*;		//import to use the classes in the AWT library
import java.awt.event.*;	//import for the ActionListener


public class Auto extends JFrame 
{
	//adds textfield 
	private JTextField hoursTF;
	//adds checkboxes for the different services
	private JCheckBox oilCB, lubeCB, radiatorCB, transmissionCB, inspectionCB,mufflerCB
					,tireCB,nonroutCB;
	//adds button for calculations
	private JButton butt;
	
	//creates gui application's length and height
	private int WINDOW_WIDTH = 300;
	private int WINDOW_HEIGHT = 100;
	
	
	
	//constructor class
	public Auto()
	{
		// sets the app's title
		setTitle("Joes Automotive Price Check");
		
		// set application close option
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		//creating 2 panels to hold all of the components
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		
		//to display the window
		setVisible(true);
		
		oilCB = new JCheckBox("Oil Change");  // checkbox for oil change
		lubeCB = new JCheckBox ("Lube Job");	//checkbox for lube job
		radiatorCB = new JCheckBox("Radiator Flush");			//checkbox for radiator flush
		transmissionCB = new JCheckBox("Transmission Flush");	//checkbox for transmission flush
		inspectionCB = new JCheckBox("Inspection");				//checkbox for inspection
		mufflerCB = new JCheckBox("Muffler Replacement");		//checkbox for muffler replacement
		tireCB = new JCheckBox("Tire Rotation");				//checkbox for tire rotation
		nonroutCB = new JCheckBox("Non-Routine Services");		//checkbox for non-routine services
		
		hoursTF = new JTextField(4); //creats a textfield with a max for 4 characters
		butt = new JButton("Calculate Total");
		butt.addActionListener(new ButtonListener());
		
		//adds all textboxes and textfield to panel
		panel2.add(oilCB);
		panel2.add(lubeCB);
		panel2.add(radiatorCB);
		panel2.add(transmissionCB);
		panel2.add(inspectionCB);
		panel2.add(mufflerCB);
		panel2.add(tireCB);
		panel2.add(nonroutCB);
		panel2.add(hoursTF);
		
		//for the other panel, the button is added
		panel.add(butt);
		
		//add the panels to window
		add(panel, BorderLayout.SOUTH);
		add(panel2, BorderLayout.NORTH);
		
		//pack to fit window (without this, my app opened minimized)
		
		pack();
		
	}

	
	// this is the ActionListener class for the button; For when the user clicks it.
	
	private class ButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			String retrieve; //to hold the textfield's input
			double nonRoutCost, sub = 0;   //variables for the non-routine services and total
			
			
			//below are if statements for the checkboxes which adds their prices to 
			// the total
			if(oilCB.isSelected())
				sub += 26;
			if(lubeCB.isSelected())
				sub += 18;
			if(radiatorCB.isSelected())
				sub += 30;
			if(transmissionCB.isSelected())
				sub += 80;
			if(inspectionCB.isSelected())
				sub += 15;
			if(mufflerCB.isSelected())
				sub += 100;
			if(tireCB.isSelected())
				sub += 20;
			
			//this last if statement is to add the total cost of the non-routine services
			//to the subtotal
			if(nonroutCB.isSelected()) 
			{
				
				//retrieve gets user input from textfield
				retrieve = hoursTF.getText();
				//formats the input into a double
				nonRoutCost = Double.parseDouble(retrieve) * (20); 
				//adds the non routine cost to the subtotal
				sub += nonRoutCost;
			}
			
			//prints results/total
			JOptionPane.showMessageDialog(null, "Your Subtotal is: $" +sub);
		}
		
	}
	
	
//the instance of JoesAuto 	
public static void main(String [] args)
{
	new Auto();
}
	
	
}
