//Chapter 3, Assignment 2
//Software Packages - Reads in the number of packages purchased by the user and
//calculates the cost, the discount amount, and the total cost

//Importing the Scanner class to receive input
import java.util.Scanner;
//Importing the DecimalFormat to format output
import java.text.DecimalFormat;

//Declaration of public class
public class HueyZane_Chapter3_Two
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of DecimalFormat object to format output
		DecimalFormat money = new DecimalFormat("$00.00");
		//Declaration of Scanner object to receive input
		Scanner keyboard = new Scanner(System.in);

		//Double variables to set the package cost and quantity discount
		double PackageCost = 99;
		double QuantityDiscount = 0.0;
		//Print statement asking the user to enter how many software packages
		//they are purchasing
		System.out.print("Enter the number of software packages " +
		"you have purchased: ");
		//Double variable to convert the user's input into a double
		double TotalPackages = keyboard.nextDouble();
		
		//If statement checking how many software packages are being purchased
		if (TotalPackages >= 10 && TotalPackages <= 19)
			//Sets the discount percent to 20% or 0.2
			QuantityDiscount = 0.2;
		else if (TotalPackages >= 20 && TotalPackages <= 49)
			//Sets the discount percent to 30% or 0.3
			QuantityDiscount = 0.3;
		else if (TotalPackages >= 50 && TotalPackages <= 99)
			//Sets the discount percent to 40% or 0.4
			QuantityDiscount = 0.4;
		else if (TotalPackages >= 100)
			//Sets the discount percent to 50% or 0.5
			QuantityDiscount = 0.5;
		
		//Double variable to calculate the amount being spent on software packages
		double SoftwareAmount = TotalPackages * PackageCost;
		//Double variable to calculate the amount that's being discounted
		double DiscountAmount = SoftwareAmount * QuantityDiscount;
		//Double variable to calculate the total amount
		double TotalAmount = SoftwareAmount + DiscountAmount;
		
		//Print statement telling the user what the discount amount and total amount is
		System.out.println("The discount amount is: " + money.format(DiscountAmount) +
		"\n And the total amount is: " + money.format(TotalAmount));
	}
}