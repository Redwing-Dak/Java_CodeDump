//Exercise 5

//Imports the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab4_5
{
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of Scanner variable to receive input from the user
		Scanner keyboard = new Scanner(System.in);
		//Print statement asking the user to enter a string
		System.out.print("Enter a string: ");
		//String variable to read in the user's input
		String StringName = keyboard.nextLine();
		//Integer variable to hold the length of the string
		int NameLength = StringName.length();
		
		//Print statement asking the user to enter a character
		System.out.print("Enter a character: ");
		//String variable to read in the user's input
		String UserCharacter = keyboard.nextLine();
		//Converts the user's input into a char
		char UserChar = UserCharacter.charAt(0);
		
		//Forward declaration of integer variables
		int NumOccurrences = 0;
		int index = 0;
		//For loop that iterates for every character in the string
		for(; index < NameLength; index++) {
			//If statement to check if the current character is the same
			//as the character the user entered
			if(StringName.charAt(index) == UserChar) {
				//Adds one to the number of occurrences of a given character
				NumOccurrences += 1; 
			}
		}
		//Print statement telling the user how many times their character appeared
		System.out.println("There are " + NumOccurrences + " of your character!");
	}
}