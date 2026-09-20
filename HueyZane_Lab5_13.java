//Exercise 13

//Library imports
import javax.swing.JOptionPane;	//Allows for reading input from the user

//Declaration of public class
public class HueyZane_Lab5_13
{
	/* IsPrime
	Takes in a number and determines if it is a prime number
	Parameter - Number is an integer that holds a user entered value
	Returns a boolean condition that determines if the value is prime or not
	*/
	public static boolean IsPrime(int Number) {
		//If statement to test values less than or equal to 1
		if(Number <= 1) {
			//Returns false as none of these numbers are prime
			return false;
		}
		
		//For loop to determine if a number is prime
		for (int i = 2; i <= Math.sqrt(Number); i++) {
			//If statement to test if the given number mod the current iteration has a remainder or not
			if(Number % i == 0) {
				//Message dialog telling the user their number is not prime
				JOptionPane.showMessageDialog(null, Number + " is not prime!");
				//Returns false as the current number is not prime
				return false;
			}
		}
		
		//Message dialog telling the user their number is prime
		JOptionPane.showMessageDialog(null, Number + " is prime!");
		//Returns true as the current number is prime
		return true;
	}

	//Main function
	public static void main(String[] args)
	{
		//Input dialog asking the user for an integer
		String inputString = JOptionPane.showInputDialog("Enter an integer: ");
		//Converts the user's input into an integer
		int PrimeOrNot = Integer.parseInt(inputString);
		
		//Boolean variable that calls the IsPrime method, passes in PrimeOrNot, and stores the result
		boolean Prime = IsPrime(PrimeOrNot);
		
	}
}