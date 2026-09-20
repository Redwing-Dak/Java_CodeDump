//Exercise 3

//Imports the Scanner class to receive input
import java.util.Scanner;
//Imports the io class to allow file manipulation
import java.io.*;

//Declaration of public class
public class HueyZane_Lab4_3
{
	//Main function
	public static void main(String[] args) throws IOException
	{	
		//Declaration of Scanner variable to receive input from the user
		Scanner keyboard = new Scanner(System.in);
		
		//Forward declarations of integer variables
		int Speed = 0;
		int Time = 0;
		
		if(Speed < 0 || Time < 1) {
			//Print statement asking the user for the speed of a vehicle and the length of time it has been travelling
			System.out.print("Enter the speed of a vehicle in miles per hour, and the " +
			"number of hours it has traveled: ");
			//Integer variable that reads in the first input and converts it into an integer
			Speed = keyboard.nextInt();
			//Integer variable that reads in the second input and converts it into an integer
			Time = keyboard.nextInt();
		}
		
		//Declaration of file for future use
		File file = new File("Output.txt");
		//Declaration of a PrintWriter variable so that a file can be written to
		PrintWriter outputFile = new PrintWriter(file);
		
		//Print statement setting up the header of a table
		outputFile.println("Hour     Distance Traveled");
		//Print statement separating the header from the contents of the table
		outputFile.println("--------------------------");
	
		//Forward declaration of an integer variable
		int Distance = 0;
		
		//For loop to calculate the distance every hour
		for(int Hour = 1; Hour <= Time; Hour++) {
			//Adds the speed to the distance
			Distance += Speed;
			//Print statement to format and right justify the data
			outputFile.printf("%2d                     %3d\n", Hour, Distance);
		}
		//Closes the file to prevent memory leaks
		outputFile.close();
	}
}