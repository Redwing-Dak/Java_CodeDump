//Exercise 10

//Imports the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab4_10
{
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of Scanner variable to receive input from the user
		Scanner keyboard = new Scanner(System.in);

		//Forward declaration of integer variables
		int UserInteger = 0; // Stores the user input
		int Minimum = Integer.MAX_VALUE; // Tracks the smallest number entered
		int Maximum = Integer.MIN_VALUE; // Tracks the largest number entered

		//While loop that continues until the user inputs -99
		while(UserInteger != -99) {
			//Prompting the user to enter an integer
			System.out.print("Enter an integer: ");
			//Reading user input
			UserInteger = keyboard.nextInt();
			
			//Checks if the entered number is greater than the current maximum
			if(UserInteger > Maximum) {
				Maximum = UserInteger; // Updates maximum if a larger number is entered
			}
			//Checks if the entered number is smaller than the current minimum
			else if(UserInteger < Minimum && UserInteger != -99) {
				Minimum = UserInteger; // Updates minimum if a smaller number is entered
			}
		}
		//Print statements displaying the highest and lowest numbers entered
		System.out.println("The highest number entered was: " + Maximum);
		System.out.println("The lowest number entered was: " + Minimum);
	}
}