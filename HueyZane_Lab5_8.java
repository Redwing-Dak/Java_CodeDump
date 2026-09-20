//Exercise 8

//Library imports
import java.util.Scanner;	//Allows for reading input from the user

//Declaration of public class
public class HueyZane_Lab5_8
{
	/* ShowKilometers
	Takes in a measurement in meters and converts it to kilometers
	Parameter - Meters is an integer that stores a measurement in meters
	*/
	public static void ShowKilometers(int Meters) {
		//Converts the meter value into kilometers
		double Kilometers = Meters * 0.001;
		//Print statement telling the user what the conversion equates to
		//Formats the result to four decimal places
		System.out.println("Your number converted to kilometers is: " + String.format(
		"%.4f", Kilometers));
		//Calls the Menu method and passes in Meters as an argument
		Menu(Meters);
	}
	
	/* ShowInches
	Takes in a measurement in meters and converts it to inches
	Parameter - Meters is an integer that stores a measurement in meters
	*/
	public static void ShowInches(int Meters) {
		//Converts the meter value into inches
		double Inches = Meters * 39.37;
		//Print statement telling the user what the conversion equates to
		//Formats the result to four decimal places
		System.out.println("Your number converted to inches is: " + String.format(
		"%.4f", Inches));
		//Calls the Menu method and passes in Meters as an argument
		Menu(Meters);
	}
	
	/* ShowFeet
	Takes in a measurement in meters and converts it to feet
	Parameter - Meters is an integer that stores a measurement in meters
	*/
	public static void ShowFeet(int Meters) {
		//Converts the meter value into feet
		double Feet = Meters * 3.281;
		//Print statement telling the user what the conversion equates to
		//Formats the result to four decimal places
		System.out.println("Your number converted to feet is: " + String.format(
		"%.4f", Feet));
		//Calls the Menu method and passes in Meters as an argument
		Menu(Meters);
	}
	
	/* Menu
	Takes in a measurement in meters and asks the user whether they want to convert it into kilometers, inches, or feet
	Parameter - Meters is an integer that stores a measurement in meters
	*/
	public static void Menu(int Meters) {
		//Declaration of Scanner object to read in user input
		Scanner keyboard = new Scanner(System.in);
		//Forward declaration to be redeclared later
		String UserChoice = "1";
		
		//While loop that runs until the user wants to quit converting the current value
		while(!UserChoice.equals("4")) {
			//Print statement telling the user what their options are
			System.out.print("1. Convert to kilometers \n" + "2. Convert to inches \n" +
			"3. Convert to feet \n" + "4. Quit the program \n");
			//Print statement asking the user which option they want to execute
			System.out.print("Which option do you want? ");
			//Sets the variable to the user's input
			UserChoice = keyboard.nextLine();
			//Switch statement to determine the current case
			switch(UserChoice) {
				//The user input 1, meaning they want to convert into kilometers
				case "1":
					//Calls the ShowKilometers method and passes in Meters
					ShowKilometers(Meters);
					//Break to prevent the entire switch statement from executing
					break;
				
				//The user input 2, meaning they want to convert into inches
				case "2":
					//Calls the ShowInches method and passes in Meters
					ShowInches(Meters);
					//Break to prevent the entire switch statement from executing
					break;
				
				//The user input 3, meaning they want to convert into feet
				case "3":
					//Calls the ShowFeet method and passes in Meters
					ShowFeet(Meters);
					//Break to prevent the entire switch statement from executing
					break;
				
				//The user input 4, meaning they want to quit running conversions
				case "4":
					//Print statement telling the user goodbye
					System.out.println("Bye!");
					//Ends the program
					System.exit(0);
				
				//The user entered invalid input
				default:
					//Print statement telling the user they didn't enter something correctly
					System.out.println("Error! You didn't enter one of the options!");
					//Break to prevent the entire switch statement from executing
					break;
			}
		}
	}
	
	//Main function
	public static void main(String[] args)
	{
		//Declaration of Scanner object to read in user input
		Scanner keyboard = new Scanner(System.in);
		//Print statement telling the user to enter a distance in meters
		System.out.print("Enter a distance in meters: ");
		//Converts the user's input into an integer
		int Meters = keyboard.nextInt();
		
		//Calls the Menu method and passes in Meters
		Menu(Meters);
	}
}