//Exercise 2

//Library imports
import java.util.Scanner;	//Allows for reading input from the user

//Declaration of public class
public class HueyZane_Lab5_2
{
	/* CalcRetail
	The method takes in two doubles and to calculate the retail price of an object
	Parameter - Wholesale is a double to hold the Wholesale price of an item
	Parameter - Markup is a double to hold the Markup percentage of an item */
	public static void CalcRetail(double Wholesale, double Markup) {
		//Declaration of double variable to hold the retail price of an item
		double RetailPrice = Wholesale + (Wholesale * Markup);
		//Print statement informing the user what the retail price is given the information they passed in
		System.out.println("The retail price of this item is: $" + String.format("%.2f", RetailPrice));
	}
	
	//Main function
	public static void main(String[] args)
	{
		//Declaration of Scanner variable to read in a user's input
		Scanner keyboard = new Scanner(System.in);
		
		//Print statement asking the user what an item's wholesale cost is
		System.out.print("Enter an item's wholesale cost: ");
		//Double variable to store the Wholesale price
		double Wholesale = keyboard.nextDouble();
		//Print statement asking the user what an item's markup percentage is
		System.out.print("Enter an item's markup percentage: ");
		//Double variable to store the Markup percentage
		double Markup = (keyboard.nextDouble() / 100);
		
		//Calling the CalcRetail method
		//Passes a double into Wholesale and a double into Markup
		CalcRetail(Wholesale, Markup);
	}
}