//Exercise 1

//Importing the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab3_1
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of Scanner object to receive input
		Scanner keyboard = new Scanner(System.in);
		
		//Print statement to receive a number between 1 and 10 from the user
		System.out.print("Enter a number between the range of 1-10: ");
		//Integer variable to convert the user's input into from a string
		//into an integer
		int RomanNumeral = keyboard.nextInt();
		
		//If statement to ensure the user's input remains in the range
		if (RomanNumeral > 10 || RomanNumeral < 1)
		{
			//Switch statement to print out the correct Roman numeral
			switch (RomanNumeral)
			{
				//The user entered a 1
				case 1:
					//Prints out the Roman numeral for 1
					System.out.println("I");
				break;
				
				//The user entered a 2
				case 2:
					//Prints out the Roman numeral for 2
					System.out.println("II");
				break;
				
				//The user entered a 3
				case 3:
					//Prints out the Roman numeral for 3
					System.out.println("III");
				break;
				
				//The user entered a 4
				case 4:
					//Prints out the Roman numeral for 4
					System.out.println("IV");
				break;
				
				//The user entered a 5
				case 5:
					//Prints out the Roman numeral for 5
					System.out.println("V");
				break;
				
				//The user entered a 6
				case 6:
					//Prints out the Roman numeral for 6
					System.out.println("VI");
				break;
				
				//The user entered a 7
				case 7:
					//Prints out the Roman numeral for 7
					System.out.println("VII");
				break;
				
				//The user entered an 8
				case 8:
					//Prints out the Roman numeral for 8
					System.out.println("VIII");
				break;
				
				//The user entered a 9
				case 9:
					//Prints out the Roman numeral for 9
					System.out.println("IX");
				break;
				
				//The user entered a 10
				case 10:
					//Prints out the Roman numeral for 10
					System.out.println("X");
				break;
			}
			//Informs the user that their input is outside of the range
			System.out.println("Error! The number you entered is out of range");
		}
	}
}