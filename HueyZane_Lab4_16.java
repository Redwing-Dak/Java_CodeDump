//Exercise 16

//Imports the Scanner class for user input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab4_16
{
	//Main function
	public static void main(String[] args)
	{	
		//Creates a Scanner object to receive user input
		Scanner keyboard = new Scanner(System.in);

		//Prompting the user to enter their monthly budget
		System.out.print("Enter the amount you've budgeted for this month: ");
		//Stores the user's budget input
		double MonthlyBudget = keyboard.nextDouble();
		
		//Variables to track expenses
		double BudgetSpent = 0;
		double Expense = 0;
		
		//Loop to receive expenses until user enters -1
		while(Expense != -1) {
			System.out.print("Enter an expense (Enter -1 if done entering expenses): ");
			Expense = keyboard.nextDouble();
			//Adds the expense to the total if it's not the termination value
			if(Expense != -1) {
				BudgetSpent += Expense;
				System.out.print("\n");
			}
		}
		
		//Checks if the user is over, under, or exactly within the budget
		if(BudgetSpent > MonthlyBudget) {
			//Calculates the amount over budget
			double OverBudget = BudgetSpent - MonthlyBudget;
			System.out.print("You are ");
			System.out.printf("$%.2f", OverBudget);
			System.out.print(" over budget");
		}
		else if(BudgetSpent < MonthlyBudget) {
			//Calculates the amount under budget
			double UnderBudget = MonthlyBudget - BudgetSpent;
			System.out.print("You are ");
			System.out.printf("$%.2f", UnderBudget);
			System.out.print(" under budget");
		}
		else if(BudgetSpent == MonthlyBudget) {
			//Indicates that the user has exactly matched their budget
			System.out.print("You are neither over nor under budget!");
		}
	}
}