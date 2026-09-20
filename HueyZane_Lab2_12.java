//Exercise 12

//Importing the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab2_12
{
	//Main function
	public static void main(String[] args)
	{
		//Scanner variable to be able to receive input
		Scanner keyboard = new Scanner(System.in);
		
		//Print statement to receive a user's favorite city
		System.out.print("Enter the name of your favorite city: ");
		//String variable to store the user's FavoriteCity
		String FavoriteCity = keyboard.nextLine();
		
		//Print statement to tell the user how many characters are in the city's name
		System.out.println("The number of characters in the city name are: " + 
		FavoriteCity.length());
		//Print statement to show the user the city's name in all uppercase letters
		System.out.println("The name of the city in all uppercase letters is: " +
		FavoriteCity.toUpperCase());
		//Print statement to show the user the city's name in all lowercase letters
		System.out.println("The name of the city in all lowercase letters is: " +
		FavoriteCity.toLowerCase());
		//Print statement to tell the user what the first character in the city's name is
		System.out.println("The first character in the name of the city is: " +
		FavoriteCity.charAt(0));
	}
}