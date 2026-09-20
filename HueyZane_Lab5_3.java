//Exercise 3

//Library imports
import java.util.Scanner;	//Allows for reading input from the user

//Declaration of public class
public class HueyZane_Lab5_3
{
	/* GetLength
	The method takes in no parameters, asks the user for the length of a rectangle, and returns the result */
	public static double GetLength() {
		//Declaration of Scanner variable to read in a user's input
		Scanner keyboard = new Scanner(System.in);
		//Print statement asking the user for the length of a rectangle
		System.out.print("Enter a rectangle's length: ");
		//Double variable to store the rectangle's length
		double RectLength = keyboard.nextDouble();
		//Returns the length to the user for later use
		return RectLength;
		
	}
	
	/* GetWidth
	The method takes in no parameters, asks the user for the width of a rectangle, and returns the result */
	public static double GetWidth() {
		//Declaration of Scanner variable to read in a user's input
		Scanner keyboard = new Scanner(System.in);
		//Print statement asking the user for the width of a rectangle
		System.out.print("Enter a rectangle's width: ");
		//Double variable to store the rectangle's width
		double RectWidth = keyboard.nextDouble();
		//Returns the width to the user for future use
		return RectWidth;
	}
	
	/* GetArea
	The method takes in two doubles and returns the Area of a rectangle
	Parameter - Length is a double to hold the Length of a rectangle
	Parameter - Width is a double to hold the Width of a rectangle */
	public static double GetArea(double Length, double Width) {
		//Double variable to calculate the area of a rectangle
		double RectArea = Length * Width;
		//Returns the area to the user for future use
		return RectArea;
	}
	
	/* DisplayData
	The method takes in three doubles and prints the values
	Parameter - Length is a double to hold the length of a rectangle
	Parameter - Width is a double to hold the Width of a rectangle
	Parameter - Area is a double to hold the Area of a rectangle */
	public static void DisplayData(double Length, double Width, double Area) {
		//Print statement telling the user the length, width, and area of a rectangle
		System.out.println("The rectangle's length is " + Length + ", the rectangle's width is " +
		Width + ", and the rectangle's area is " + Area);
	}
	
	//Main function
	public static void main(String[] args)
	{
		//Calling the GetLength method to receive input from the user
		double Length = GetLength();
		//Calling the GetWidth method to receive input from the user
		double Width = GetWidth();
		//Calling the GetArea method and passing in Length and Width
		double Area = GetArea(Length, Width);
		
		//Calling the DisplayData method and passing in Length, Width, and Area
		DisplayData(Length, Width, Area);
	}
}