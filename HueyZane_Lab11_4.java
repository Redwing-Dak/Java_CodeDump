//Exercise 4

//Declaration of public class
public class HueyZane_Lab11_4
{
	
	//Main function
	public static void main(String[] args)
	{	
		//Integer to hold the number of a month
		int invalidMonthNumber = 15;
		//String to hold the name of a month
		String invalidMonthName = "Janury";
	
		//Try statement to validate the number of a month
		try {
			//Declaration of Month object named one
			Month one = new Month(invalidMonthNumber);
		}
		//Catch statement to catch exceptions
		catch(InvalidMonthNumberException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}
		//Try statement to validate the name of a month
		try {
			//Declaration of Month object named two
			Month two = new Month(invalidMonthName);
		}
		//Catch statement to catch exceptions
		catch(InvalidMonthNameException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}
	}
}