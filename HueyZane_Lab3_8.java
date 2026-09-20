//Exercise 8

//Importing the JOptionPane class to receive input
import javax.swing.JOptionPane;
//Importing the DecimalFormat class to format output
import java.text.DecimalFormat;

//Declaration of public class
public class HueyZane_Lab3_8
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of a DecimalFormat object to format output like money
		DecimalFormat money = new DecimalFormat("$00.00");
		
		//Declaration of string variable to hold future user input
		String inputString;
		//Creates input dialog asking the user how many software packages were purchased
		inputString = JOptionPane.showInputDialog("Enter the number of software " +
		"packages purchased: ");
		//Integer variable to convert the user's input to an integer for future use
		int PackageQuantity = Integer.parseInt(inputString);
		
		//Double variable to store the cost of a single software package
		double PackagePrice = 99;
		//Double variable to store the discount percent that the user is receiving
		double DiscountPercent = 0;
		//If statement that checks to see how many software packages the user has purchased
		if (PackageQuantity >= 10 && PackageQuantity <= 19)
			//Sets the discount percentage to 20% or 0.2
			DiscountPercent = 0.2;
		else if (PackageQuantity >= 20 && PackageQuantity <= 49)
			//Sets the discount percentage to 30% or 0.3
			DiscountPercent = 0.3;
		else if (PackageQuantity >= 50 && PackageQuantity <= 99)
			//Sets the discount percentage to 40% or 0.4
			DiscountPercent = 0.4;
		else if (PackageQuantity >= 100)
			//Sets the discount percentage to 50% or 0.5
			DiscountPercent = 0.5;
		
		//Double variable to store the amount being spent on software packages
		double SoftwareAmount = PackagePrice * PackageQuantity;
		//Double variable to store the total discount amount of the purchase
		double DiscountAmount = SoftwareAmount * DiscountPercent;
		//Double variable to store the final total
		double TotalAmount = SoftwareAmount + DiscountAmount;

		//Creates message box telling the user what the discount amount is
		//and what the total amount is
		JOptionPane.showMessageDialog(null, "The discount amount is: " + 
		money.format(DiscountAmount) + "\n And the total amount is: " + 
		money.format(TotalAmount));
	}
}