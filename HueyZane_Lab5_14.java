//Exercise 14

//Library imports
import java.util.Scanner;	//Allows for reading input from the user
import java.io.*;	//Allows for file manipulation

//Declaration of public class
public class HueyZane_Lab5_14
{
	/* IsPrime
	Takes in an integer and determines if the given number is prime
	Parameter - Number is an integer that holds a user entered value
	Returns a boolean condition that determines if a value is prime or not
	*/
	public static boolean IsPrime(int Number) {
		//If statement to test all values up to 1
		if(Number <= 1) {
			//Returns false as none of these values are prime
			return false;
		}
		
		//For loop to check if a number is divisible by more than itself and 1
		for (int i = 2; i <= Math.sqrt(Number); i++) {
			//If statement to check if the current number mod the current iteration has a remainder
			if(Number % i == 0) {
				//Returns false as the number is not prime
				return false;
			}
		}
		
		//Returns true as the number is prime
		return true;
	}

	/* PrimeList
	Iterates from 1 to 100, determines which numbers are prime, and prints those values to a file
	*/
	public static void PrimeList() throws IOException {
		//Declaration of PrintWriter object to allow for file writing
		PrintWriter outputFile = new PrintWriter("Lab5_14.txt");
		//For loop to iterate from 1 to 100
		for(int i = 1; i <= 100; i++) {
			//If statement to check if the current number is prime
			//Calls the IsPrime method and passes the current iteration in
			if(IsPrime(i) == true) {
				//The number is prime so it is printed to the file
				outputFile.println(i);
			}
		}
		//Closes the file since it is no longer needed
		outputFile.close();
	}

	//Main function
	public static void main(String[] args) throws IOException
	{
		//Calls the PrimeList method
		PrimeList();
	}
}