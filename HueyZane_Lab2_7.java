//Exercise 7

//Importing the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab2_7
{
	//Main function
	public static void main(String[] args)
	{
		//Scanner variable to be able to receive input
		Scanner keyboard = new Scanner(System.in);
		
		//Print statement to receive an object price from a user
		System.out.print("Enter the price of an object: ");
		//Double variable to store the user's input
		double ItemTotal = keyboard.nextDouble();
		//Constant double variable to store the CountySalesTax
		final double CountySalesTax = .02;
		//Constant double variable to store the StateSalesTax
		final double StateSalesTax = .04;
		
		//Double variable to calculate and store the CountyTaxAmount
		double CountyTaxAmount = ItemTotal * CountySalesTax;
		//Double variable to calculate and store the StateTaxAmount
		double StateTaxAmount = ItemTotal * StateSalesTax;
		//Double variable to calculate and store the TotalSaleAmount
		double TotalTaxAmount = CountyTaxAmount + StateTaxAmount;
		//Double variable to calculate and store the TotalSaleAmount
		double TotalSaleAmount = ItemTotal + TotalTaxAmount;
		
		//Print statement to print out the ItemTotal, StateTaxAmount, CountyTaxAmount, TotalTaxAmount,
		//and TotalSaleAmount
		System.out.println("The item total is $" + ItemTotal + ", the state sales tax is $" +
		StateTaxAmount + ", the county sales tax is $" + CountyTaxAmount + ", the total tax amount is $" +
		TotalTaxAmount + ", and the sale total is $" + TotalSaleAmount);
	}
}