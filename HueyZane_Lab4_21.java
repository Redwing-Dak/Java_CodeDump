//Exercise 21

//Imports the Scanner class to receive input
import java.util.Scanner;
//Imports the Random class to generate random numbers
import java.util.Random;

//Declaration of public class
public class HueyZane_Lab4_21
{
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of Scanner variable to receive input from the user
		Scanner keyboard = new Scanner(System.in);
		//Declaration of Random variable to generate random numbers for future use
		Random RandomNumbers = new Random();
		
		//Declaration of integer variable to be redeclared later
		int ComputerWins = 0;
		//Declaration of integer variable to be redeclared later
		int UserWins = 0;
		
		//For loop to run through ten iterations of a basic dice game
		for(int i = 0; i <= 10; i++) {
			//Declaration of integer variables that generate random numbers
			//between 1 and 6
			//Generates the computer's number
			int ComputerNumber = RandomNumbers.nextInt(6)+1;
			//Generates the user's number
			int UserNumber = RandomNumbers.nextInt(6)+1;
			
			//If statement checking to see if the user or computer has a higher number
			if(ComputerNumber > UserNumber) {
				//Increases the computer's wins by one
				ComputerWins += 1;
			}
			else if(UserNumber > ComputerNumber) {
				//Increases the user's wins by one
				UserWins += 1;
			}
		}
		
		//If statement checking to see if the user or computer has a higher number of wins
		if(ComputerWins > UserWins) {
			//Print statement informing the user that the computer is the winner
			//Provides the number of wins the computer had
			System.out.println("The computer is the overall winner with " +
			ComputerWins + " wins");
		}
		else if(UserWins > ComputerWins) {
			//Print statement informing the user that they are the winner
			//Provides the number of wins the user had
			System.out.println("The user if the overall winner with " +
			UserWins + " wins");
		}
	}
}