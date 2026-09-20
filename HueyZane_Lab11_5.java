//Exercise 5

//Declaration of public class
public class HueyZane_Lab11_5
{
	
	//Main function
	public static void main(String[] args)
	{	
		//String to hold an employee's name
		String invalidName = "";
		//Integer to hold an employee's ID
		int invalidId = - 99;
		//Double to hold an employee's pay rate
		double invalidPay = 150;
		//Integer to hold the hours an employee worked
		int invalidHoursWorked = -10;
	
		//Try statement to validate the employee's name
		try {
			//Declaration of Payroll object named nameError
			Payroll nameError = new Payroll(invalidName, 3, 23, 45);
		}
		//Catch statement to catch exceptions
		catch (InvalidNameException | InvalidIDException | InvalidHourlyRateException | InvalidHoursException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}
		
		//Try statement to validate the employee's ID
		try {
			//Declaration of Payroll object named idError
			Payroll idError = new Payroll("Greg Kinsey", invalidId, 14, 24);
		}
		//Catch statement to catch exceptions
		catch (InvalidNameException | InvalidIDException | InvalidHourlyRateException | InvalidHoursException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}
		
		//Try statement to validate the employee's pay rate
		try {
			//Declaration of Payroll object named payError
			Payroll payError = new Payroll("Elizabeth Satterly", 28, invalidPay, 65);
		}
		//Catch statement to catch exceptions
		catch (InvalidNameException | InvalidIDException | InvalidHourlyRateException | InvalidHoursException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}
		
		//Try statement to validate the hours an employee worked
		try {
			//Declaration of Payroll object named hoursError
			Payroll hoursError = new Payroll("Sandy Cheeks", 375, 17, invalidHoursWorked);
		}
		//Catch statement to catch exceptions
		catch (InvalidNameException | InvalidIDException | InvalidHourlyRateException | InvalidHoursException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}
	}
}