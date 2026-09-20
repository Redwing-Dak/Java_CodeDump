//Exercise 13

//Importing the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab2_13
{
	//Main function
	public static void main(String[] args)
	{
		//Scanner variable to be able to receive input
		Scanner keyboard = new Scanner(System.in);
		
		//Print statement to ask the user how much their meal cost
		System.out.print("How much did your meal cost? ");
		//Double variable to store how much the user's MealCost
		double MealCost = keyboard.nextDouble();
		
		//Constant double variable to store the SalesTax
		final double SalesTax = 0.0675;
		//Constant double variable to store the TipPercent
		final double TipPercent = 0.2;
		//Double variable to calculate and store the SalesTaxAmount
		double SalesTaxAmount = MealCost * SalesTax;
		//Double variable to calculate and store the TipAmount
		double TipAmount = MealCost * TipPercent;
		//Double variable to calculate and store the TotalBill
		double TotalBill = MealCost + SalesTaxAmount + TipAmount;
		
		//Print statement to print out the MealCost, SalesTaxAmount, TipAmount, and TotalBill
		System.out.println("The meal cost $" + MealCost + ", the tax amount is $" +
		SalesTaxAmount + ", the tip amount is $" + TipAmount + ", and the total bill is $" +
		TotalBill);
	}
}