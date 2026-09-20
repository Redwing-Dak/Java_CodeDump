//Exercise 7

//Importing the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab4_7
{
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of Scanner variable to receive user input
		Scanner keyboard = new Scanner(System.in);
		
		//Declaration of integer variable to be redeclared later
		int FloorNumber = 0;
		//While loop to make sure there is at least one floor in the building
		while(FloorNumber < 1) {
			//Print statement asking the user to enter the number of floors in the hotel
			System.out.print("Enter how many floors there are in the hotel: ");
			//Reads in the user's input and converts it into an integer
			FloorNumber = keyboard.nextInt();
		}
		
		//Declaration of double variables to be redeclared later
		double TotalRooms = 0.0;
		double TotalOccupied = 0.0;
		//For loop going floor by floor to determine how many rooms there are, and how
		//many are occupied
		for(int CurrentFloor = 0; CurrentFloor <= FloorNumber; CurrentFloor++) {
			//Declaration of double variable to be redeclared later
			double RoomNumber = 0;
			//While loop checking that there are at least 10 rooms per floor
			while(RoomNumber < 10) {
				//Print statement asking the user how many rooms are on the current floor
				System.out.print("How many rooms are on this floor? ");
				//Reads in the user's input and converts it into an integer
				RoomNumber = keyboard.nextDouble();
			}
			//Adds the number of rooms on the floor to the room total
			TotalRooms += RoomNumber;
			//Print statement asking the user how many rooms on the current floor are occupied
			System.out.print("How many rooms are occupied? ");
			//Declaration of double variable to read in and convert the user's input into an integer
			double NumOccupied = keyboard.nextInt();
			//Adds the number of occupied rooms to the total of occupied rooms
			TotalOccupied += NumOccupied;
		}
		//Print statement informing the user how many total rooms are in the hotel
		System.out.println("There are a total of " + TotalRooms +
		" rooms in the hotel");
		//Print statement informing the user how many of those rooms are occupied
		System.out.println(TotalOccupied + " rooms are occupied");
		
		//Declaration of double variable to calculate the percent of rooms currently occupied
		double OccupancyRate = TotalOccupied / TotalRooms;
		//Print statement informing the user what the occupancy rate currently is
		System.out.print("The occupancy rate is ");
		//Print statement to format the occupancy rate so that it displays with two decimal places
		System.out.printf("%.2f%n", OccupancyRate);
	}
}