//Exercise 3

//Importing the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab3_3
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of Scanner object to receive input
		Scanner keyboard = new Scanner(System.in);
		
		//Print statement asking the user to enter their weight and height
		System.out.print("Enter your weight in pounds " + 
		"and height in inches: ");
		//Double variable converting the user's input into a double
		double Weight = keyboard.nextDouble();
		//Double variable converting the user's input into a double
		double Height = keyboard.nextDouble();
		//Double variable storing the BMI formula
		double BMI = (Weight * 703) / (Height * Height);
		
		//If statement to determine if the user's BMI is optimal, underweight, or overweight
		if (BMI >= 18.5 && BMI <= 25)
			//Print statement informing the user that their BMI is considered optimal
			System.out.println("Your BMI is considered optimal");
		else if (BMI < 18.5)
			//Print statement informing the user that their BMI is considered underweight
			System.out.println("Your BMI is considered underweight");
		else if (BMI > 25)
			//Print statement informing the user that their BMI is considered overweight
			System.out.println("Your BMI is considered overweight");
	}
}