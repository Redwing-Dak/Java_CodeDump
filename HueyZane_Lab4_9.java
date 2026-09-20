//Exercise 9

//Imports the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab4_9
{
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of Scanner variable to receive input from the user
		Scanner keyboard = new Scanner(System.in);
		
		//Forward declaration of double variable
		double Population = 0.0;
		//While loop to check that the population is a minimum of 2
		while(Population < 2.0) {
			//Print statement asking the user how many organisms are in the population
			System.out.print("How many organisms are in the original population? ");
			//Converts the user's input into a double
			Population = keyboard.nextDouble();
		}
		
		//Forward declaration of double variable
		double DailyPopulation = -1.0;
		//While loop to check that the population is either stagnant or growing
		while(DailyPopulation <= 0.0) {
			//Print statement asking the user how much the population is growing
			System.out.print("What is the average daily population increase as a percent? ");
			//Converts the user's input into a double and makes it a decimal for future calculations
			DailyPopulation = keyboard.nextDouble() / 100;
		}
		
		//Forward declaration of integer variable
		int Days = 0;
		//While loop that checks that the population has at least one day to increase
		while(Days < 1) {
			//Print statement asking the user how many days the population will be increasing for
			System.out.print("How many days will the population be allowed to increase? ");
			//Converts the user's input into an integer
			Days = keyboard.nextInt();
		}
		
		//Print statement to create a header for a table
		System.out.println("Day       Population");
		//Print statement to separate the header from the table's contents
		System.out.println("--------------------");
		
		//For loop that iterates once for each day
		for(int Start = 1; Start <= Days; Start++) {
			//Multiplies the current population by the population increase and addst it to the total
			Population += Population * DailyPopulation;
			//Print statement to format and right justify the data
			System.out.printf("%2d            %6.3f\n", Start, Population);
		}
	}
}