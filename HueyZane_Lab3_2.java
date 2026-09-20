//Exercise 2

//Importing the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab3_2
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of Scanner object to receive input
		Scanner keyboard = new Scanner(System.in);
		
		//Print statement asking the user for a month, day, and year
		System.out.print("Enter a month, day, and year in a numeric " +
		"form with only two digits: ");
		//Integer variable to convert the user's input into an integer
		int Month = keyboard.nextInt();
		//Integer variable to convert the user's input into an integer
		int Day = keyboard.nextInt();
		//Integer variable to convert the user's input into an integer
		int Year = keyboard.nextInt();
		
		//If statement checking to see if the user's month multiplied by the day
		//is equivalent to the year
		if (Month * Day == Year)
			//Print statement informing the user that their date is magic
			System.out.println("This date is magic");
		else
			//Print statement informing the user that their date is not magic
			System.out.println("This date is not magic");
	}
}