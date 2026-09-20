//Exercise 1

//Imports the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab4_1
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of Scanner variable to receive input from the user
		Scanner keyboard = new Scanner(System.in);
		//Print statement asking the user for a positive nonzero integer
		System.out.print("Enter a positive nonzero integer: ");
		//Declaration of integer variable to convert the user's input into an integer
		int UserNum = keyboard.nextInt();
		//Declaration of integer variable to be redeclared later
		int TotalNum = 0;
		
		//For loop to calculate the sum of all numbers up to the user's integer
		for(; UserNum > 0; UserNum--) {
			//Adds the user's number to the total
			TotalNum += UserNum;
		}
		//Print statement informing the user what the sum of all numbers between their
		//integer and zero is
		System.out.println("The sum of all numbers between your input and zero is: " +
		TotalNum);
	}
}