//Exercise 2

//Imports the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab4_2
{
	//Main function
	public static void main(String[] args)
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
		
		//Print statement setting up the header of a table
		System.out.println("Hour     Distance Traveled");
		//Print statement dividing the header of the table from the table contents
		System.out.println("--------------------------");
		
		//Forward declaration of integer variable
		int Distance = 0;
		
		//For loop to calculate the distance traveled for every hour
		for(int Hour = 1; Hour <= Time; Hour++) {
			//Adds the speed to the distance travelled
			Distance += Speed;
			//Print statement to format the numbers by right justifying them
			System.out.printf("%2d                     %3d\n", Hour, Distance);
		}
	}
}