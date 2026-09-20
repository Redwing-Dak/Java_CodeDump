//Exercise 5

//Declaration of public class
public class HueyZane_Lab5_5
{
	/* FallingDistance
	Takes in the time an object has been falling and calculates the distance fallen
	Parameter - SecondsFalling is an integer that holds how long an item has fallen
	Returns the distance that the item has fallen
	*/
	public static double FallingDistance(int SecondsFalling) {
		//Squares SecondsFalling for the next calculation
		double t = SecondsFalling * SecondsFalling;
		//Formula to calculate the distance fallen
		double DistanceFallen = 0.5 * 9.8 * t;
		
		//Returns the distance an item has fallen
		return DistanceFallen;
	}
	
	//Main function
	public static void main(String[] args)
	{
		//Print statement to create the header of a table
		System.out.println("Second          Meters Fallen");
		//Print statement to separate the header and the contents of the table
		System.out.println("-----------------------------");
		
		//For loop to iterate from 1 to 10 seconds
		for(int i = 1; i <= 10; i++) {
			//Print statement to format the table and right justify it
			System.out.printf("    %2d                 %6.2f \n", i, FallingDistance(i));
		}
	}
}