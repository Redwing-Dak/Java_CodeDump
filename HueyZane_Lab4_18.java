//Exercise 18

//Imports the Scanner class for user input and Random class for number generation
import java.util.Scanner;
import java.util.Random;

//Declaration of public class
public class HueyZane_Lab4_18
{
	//Main function
	public static void main(String[] args)
	{	
		//Creates a Scanner object to receive user input
		Scanner keyboard = new Scanner(System.in);
		//Creates a Random object to generate random numbers
		Random RandomNumbers = new Random();
		
		//Generates a random number between 0 and 9
		int GeneratedNumber = RandomNumbers.nextInt(10);
		//Boolean flag to track if the guess is correct
		boolean CorrectGuess = false;
		//Counter to track the number of guesses
		int GuessCount = 0;
		
		//Prompting the user to guess the number
		System.out.println("A random number between 0 and 9 " + 
		"has been generated. Try to guess it!");
		
		//Loop continues until the correct number is guessed
		while(CorrectGuess == false) {
			//Prompting the user to enter a number
			System.out.print("Enter a number: ");
			int Guess = keyboard.nextInt();
			
			//Checks if the guess is too high
			if(Guess > GeneratedNumber) {
				System.out.println("Your guess was too high. Try again");
				GuessCount += 1;
			}
			//Checks if the guess is too low
			else if(Guess < GeneratedNumber) {
				System.out.println("Your guess was too low. Try again");
				GuessCount += 1;
			}
			//Checks if the guess is correct
			else if(Guess == GeneratedNumber) {
				System.out.println("Your guess is correct!");
				CorrectGuess = true;
				GuessCount += 1;
			}
		}
		//Displays the number of attempts taken to guess correctly
		System.out.println("You guessed " + GuessCount + " times!");
	}
}