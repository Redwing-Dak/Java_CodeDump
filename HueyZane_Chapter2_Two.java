//Chapter 2, Assignment Two
//Gratuity - Receives input from the user and calculates the area
//and volume of that input

//Importing the JOptionPane class to receive input
import javax.swing.JOptionPane;

//Declaration of public class
public class HueyZane_Chapter2_Two
{
	//Main function
	public static void main(String[] args)
	{
		//String variable to temporarily store user input before it gets converted
		//to the necessary data type
		String inputString;
		//Displays input dialog box to receive the subtotal from the user
		//Gives the dialog box the name Chapter 2 Program 2 Input and displays a
		//question mark on the left hand side
		inputString = JOptionPane.showInputDialog(null, "Enter the subtotal:", 
		"Chapter 2 Program 2 Input", JOptionPane.QUESTION_MESSAGE);
		//Double variable to convert the user's input into a double for future calculations
		double Subtotal = Double.parseDouble(inputString);
		
		//Displays input dialog box to receive the gratuity rate from the user
		//Gives the dialog box the name Chapter 2 Program 2 Input and displays a
		//question mark on the left hand side
		inputString = JOptionPane.showInputDialog(null, "Enter the gratuity rate:",
		"Chapter 2 Program 2 Input", JOptionPane.QUESTION_MESSAGE);
		//Double variable to convert the user's input into a double for future calculations
		//Divides the result by 100 to make it a decimal number for calculations
		//Stores the result as the gratuity rate
		double GratuityRate = (Double.parseDouble(inputString)) / 100;
		//Double variable that takes the subtotal and multiplies it by the gratuity rate
		//Stores the result as the gratuity total
		double GratuityTotal = Subtotal * GratuityRate;
		//Double variable that takes the subtotal and adds the gratuity total to it
		//Stores the result as the overall total
		double Total = Subtotal + GratuityTotal;
		//Displays message dialog box to tell the user what the gratuity total and overall total are
		//Gives the dialog box the name Chapter 2 Program 2 Input and displays a
		//exclamation mark on the left hand side
		JOptionPane.showMessageDialog(null, "The gratuity is $" + GratuityTotal +
		"\n Your total is $" + Total, "Chapter 2 Program 2 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}