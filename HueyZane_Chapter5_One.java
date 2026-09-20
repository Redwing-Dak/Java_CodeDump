//Exercise 14

//Library imports
import java.util.Scanner;	//Allows for reading input from the user

//Declaration of public class
public class HueyZane_Chapter5_One
{

	/* IsPalindrome
	Takes in an integer and determines if that integer is a palindrome or not
	Parameter - Number is an integer that holds a user entered number
	Returns true if the number is a palindrome and false if the number is not a palindrome
	*/
	public static boolean IsPalindrome(int Number) {
		//Integer variable that calls the Reverse method, passes in Number, and stores the result
		int Reverse = Reverse(Number);
		//If statement checking if Number and Reverse are the same number
		if(Number == Reverse) {
			//Print statement telling the user their number is a palindrome
			System.out.println(Number + " is a palindrome");
			//Returns true as the number is a palindrome
			return true;
		}
		else {
			//Print statement telling the user their number isn't a palindrome
			System.out.println(Number + " is not a palindrome");
			//Returns false as the number isn't a palindrome
			return false;
		}
	}
	
	/* Reverse
	Takes in the user's number and reverses it
	Parameter - Number is an integer that holds a user entered integer
	Returns the reversed number
	*/
	public static int Reverse(int Number) {
		//Integer variable to hold the reversed integer
		int Reverse = 0;
		//Integer variable to hold a copy of the user's number
		int TempNumber = Number;
		
		//Integer variable to hold the length of the user's number
		int Length = String.valueOf(Number).length();
		//For loop to iterate through each character of the user's number
		for(int i = 1; i <= Length; i++) {
			//Takes the final digit of the user's number and adds it to Reverse
			Reverse = (Reverse * 10) + (TempNumber % 10);
			//Removes the final digit from the user's number
			TempNumber = TempNumber / 10;
		}
		//Returns the reversed number
		return Reverse;
	}

	//Main function
	public static void main(String[] args)
	{
		//Declaration of Scanner object to read in user input
		Scanner keyboard = new Scanner(System.in);
		//Print statement asking the user to enter a positive integer
		System.out.print("Enter a positive integer: ");
		//Converts the user's input into an integer
		int UserNumber = keyboard.nextInt();
		
		//Integer variable that calls Reverse, passes in UserNumber, and stores the result
		int Reverse = Reverse(UserNumber);
		//Boolean variable that calls IsPalindrome, passes in UserNumber, and stores the result
		boolean IsPalindrome = IsPalindrome(UserNumber);
	}
}