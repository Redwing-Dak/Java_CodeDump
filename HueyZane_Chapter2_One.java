//Chapter 2, Assignment One
//Area and Volume - Receives input from the user and calculates the area
//and volume of that input

//Importing the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Chapter2_One
{
	//Main function
	public static void main(String[] args)
	{
		//Scanner variable to be able to receive input
		Scanner keyboard = new Scanner(System.in);
		
		//Constant double variable to store the value of pi
		final double PI = 3.14159;
		//Print statement to get the radius and length of a cylinder from
		//the user
		System.out.print("Enter the radius and length of a cylinder: ");
		//Double variable to store the first value that the user enters
		//as the radius of the cylinder
		double Radius = keyboard.nextDouble();
		//Double variable to store the second value that the user enters
		//as the length of the cylinder
		double Length = keyboard.nextDouble();
		
		//Double variable to calculate and store the area of the cylinder
		double Area = Radius * Radius * PI;
		//Print statement to tell the user what the area of the cylinder is
		System.out.println("The area of the cylinder is " + Area);
		//Double variable to calculate and store the volume of the cylinder
		double Volume = Area * Length;
		//Print statement to tell the user what the area of the cylinder is
		System.out.println("The volume of the cylinder is " + Volume);
	}
}