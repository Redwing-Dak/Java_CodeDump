//Exercise 13

//Importing the JOptionPane class to receive input
import javax.swing.JOptionPane;
//Importing the DecimalFormat class to format output
import java.text.DecimalFormat;

//Declaration of public class
public class HueyZane_Lab3_13
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of a DecimalFormat object to format output like money
		DecimalFormat money = new DecimalFormat("$00.00");
		
		//Variable declarations to be redeclared later
		double MonthlyCharge = 0;
		int MinutesProvided = 0;
		double AdditionalMinuteCharge = 0;
		
		//Declaration of string variable to hold future user input
		String inputString;
		//Creates input dialog to ask the user which subscription package they purchased
		inputString = JOptionPane.showInputDialog("Enter the subscription package you purchased: ");
		//Character variable to convert the user's input to a character
		char UserPackage = inputString.charAt(0);
		
		//If statement to set the necessary variables according to the subscription package
		if (UserPackage == 'A' || UserPackage == 'a')
		{
			//Sets the values of the previously declared variables
			MonthlyCharge = 39.99;
			MinutesProvided = 450;
			AdditionalMinuteCharge = 0.45;
		}
		else if (UserPackage == 'B' || UserPackage == 'b')
		{
			//Sets the values of the previously declared variables
			MonthlyCharge = 59.99;
			MinutesProvided = 900;
			AdditionalMinuteCharge = 0.40;
		}
		else if (UserPackage == 'C' || UserPackage == 'c')
		{
			//Sets the values of the previously declared variables
			MonthlyCharge = 69.99;
			MinutesProvided = 0;
			AdditionalMinuteCharge = 0.00;
		}
		
		//Creates input dialog asking the user how many minutes they've used this month
		inputString = JOptionPane.showInputDialog("Enter the number of minutes you've used this month: ");
		//Integer variable to convert the user's input into an integer
		int MinutesUsed = Integer.parseInt(inputString);
		
		//Variable declaration to be redeclared later
		double TotalCharge = 0;
		//If statement to calculate the user's monthly charge
		if (MinutesUsed > MinutesProvided)
		{
			//Sets the value of the previously declared variable
			TotalCharge = (MinutesUsed - MinutesProvided) * AdditionalMinuteCharge;
		}
		//Final calculation to give the user the total charge
		TotalCharge = TotalCharge + MonthlyCharge;
		
		//Creates message box to tell the user how much their monthly charge is
		JOptionPane.showMessageDialog(null, "Your monthly charge is: " + money.format(TotalCharge));		
	}
}