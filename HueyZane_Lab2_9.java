//Exercise 9

//Importing the JOptionPane class to receive input
import javax.swing.JOptionPane;

//Declaration of public class
public class HueyZane_Lab2_9
{
	//Main function
	public static void main(String[] args)
	{
		//String variable to temporarily store the user's input
		String inputString;
		//Reading user input into inputString before converting to the necessary data type
		inputString = JOptionPane.showInputDialog("How many miles have you driven?");
		//Integer variable to convert the user's input into a usable data type
		//Integer variable to store the MilesDriven by the user
		int MilesDriven = Integer.parseInt(inputString);
		//Reading user input into inputString before converting to the necessary data type
		inputString = JOptionPane.showInputDialog("How many gallons of gas have you used?");
		//Integer variable to convert the user's input into a usable data type
		//Integer variable to store the GallonsUsed by the user
		int GallonsUsed = Integer.parseInt(inputString);
		
		//Double variable to calculate and store the MilesPerGallon of the given data
		double MilesPerGallon = MilesDriven / GallonsUsed;
		//Message box to display the MilesPerGallon of the user's vehicle
		JOptionPane.showMessageDialog(null, "Your vehicle gets " + MilesPerGallon + " miles per gallon");
		
		//Closes the message box and stops running its thread
		System.exit(1000);
	}
}