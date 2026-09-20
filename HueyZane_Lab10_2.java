//Exercise 2

//Library imports
import java.text.DecimalFormat;	//Allows for the formatting of numbers

//Declaration of public class
public class HueyZane_Lab10_2
{
	
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of a DecimalFormat object named money
		//Formats a number to two decimal places and adds a comma after three digits
		DecimalFormat money = new DecimalFormat("$###,###.00");
	
		//Declaration of a ShiftSupervisor object named john
		//Passes in a shift supervisor's name, number, date hired, annual salary, and production bonus
		ShiftSupervisor john = new ShiftSupervisor("John Smith", "123-A", "11-15-2005", 
		48000.00, 6500.00);
		//Declaration of a ShiftSupervisor object named joan
		//Passes in a shift supervisor's name, number, date hired, annual salary, and production bonus
		ShiftSupervisor joan = new ShiftSupervisor("Joan Jones", "222-L", "12-12-2005",
		55000.00, 8000.00);
		
		//Prints the first supervisor's information
		System.out.println("Here's the first shift supervisor.");
		System.out.println("Name: " + john.getEmployeeName());
		System.out.println("Employee Number: " + john.getEmployeeNumber());
		System.out.println("Hire Date: " + john.getHireDate());
		System.out.println("Annual Salary: " + money.format(john.getAnnualSalary()));
		System.out.println("Production Bonus: " + money.format(john.getProductionBonus()) + "\n");
		
		//Prints the second supervisor's information
		System.out.println("Here's the second shift supervisor.");
		System.out.println("Name: " + joan.getEmployeeName());
		System.out.println("Employee Number: " + joan.getEmployeeNumber());
		System.out.println("Hire Date: " + joan.getHireDate());
		System.out.println("Annual Salary: " + money.format(joan.getAnnualSalary()));
		System.out.println("Production Bonus: " + money.format(joan.getProductionBonus()));
	}
}