//Exercise 14

//Library imports
import java.util.Scanner;	//Allows for reading input from the user

//Declaration of public class
public class HueyZane_Chapter5_Two
{

	/* FootToMeter
	Takes in a length in feet and converts it to meters
	Parameter - Feet is a double that holds a length in feet
	Returns the meter conversion
	*/
	public static double FootToMeter(double Feet) {
		//Formula to convert feet into meters
		double MeterConversion = 0.305 * Feet;
		//Returns the converted value
		return MeterConversion;
	}
	
	/* MeterToFoot
	Takes in a length in meters and converts it to feet
	Parameter - Meter is a double that holds a length in meters
	Returns the foot conversion
	*/
	public static double MeterToFoot(double Meter) {
		//Formula to convert meters into feet
		double FeetConversion = Meter / 0.305;
		//Returns the converted value
		return FeetConversion;
	}

	//Main function
	public static void main(String[] args)
	{
		//Double to hold the initial feet value to be converted
		double Feet = 1.0;
		//Double to hole the initial meter value to be converted
		double Meters = 20.0;
		
		//Print statement to create the header of a table
		System.out.println("Feet          Meters      |      Meters          Feet");
		//Print statement to separate the header from the contents of the table
		System.out.println("-----------------------------------------------------");
		//For loop that iterates 10 times and prints the original values and converted values
		for(int i = 1; i <= 10; i++) {
			//Double that calls the FootToMeter method, passes in Feet, and stores the result
			double MeterConversion = FootToMeter(Feet);
			//Double that calls the MeterToFoot method, passes in Meters, and stores the result
			double FeetConversion = MeterToFoot(Meters);
			//Print statement to print each line of the table
			System.out.printf("%4.1f           %5.3f               %3.1f       %7.3f \n", 
			Feet, MeterConversion, Meters, FeetConversion);
			//Adds 1 to the current value of Feet
			Feet += 1.0;
			//Adds 5 to the current value of Meters
			Meters += 5.0;
		}
	}
}