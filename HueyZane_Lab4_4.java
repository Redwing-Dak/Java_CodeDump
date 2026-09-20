//Exercise 4

//Imports the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab4_4
{
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of Scanner variable to receive input from the user
		Scanner keyboard = new Scanner(System.in);
		//Forward declaration of an integer variable
		int DaysWorked = 0;
		//While loop that iterates until the user's input is at least 0
		while(DaysWorked <= 0) {
			//Print statement asking the user how many days they've worked
			System.out.print("Enter the number of days you've worked: ");
			//Converts the user's input into an integer
			DaysWorked = keyboard.nextInt();
		}
		
		//Print statement to create a header for a table
		System.out.println("Daily Salary          Total Pay");
		//Print statement to separate the header from the table's body
		System.out.println("-------------------------------");
		
		//Forward declaration for double variables
		double TotalPay = 0.0;
		double DailySalary = 0.01;
		//For loop that iterates once for each day worked
		for (int Day = 1; Day <= DaysWorked; Day++) {
			//Adds the daily salary to the total pay
            TotalPay += DailySalary;
			//Print statement that formats the data by right justifying it and displaying two decimal places
            System.out.printf("$%3.2f                    $%.2f\n", DailySalary, TotalPay);
			//Multiplies the daily salary by two
            DailySalary *= 2;
        }
		//Print statement telling the user how much they earned
        System.out.printf("Total earnings after %d days: $%.2f", DaysWorked, TotalPay);
	}
}