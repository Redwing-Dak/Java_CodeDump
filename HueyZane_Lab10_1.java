//Exercise 1

//Declaration of public class
public class HueyZane_Lab10_1
{
	
	//Main function
	public static void main(String[] args)
	{			
		//Declaration of a ProductionWorker object named john
		//Passes in an employee's name, number, hire date, shift, and hourly pay rate
		ProductionWorker john = new ProductionWorker("John Smith", "123-A", "11-15-2005", 
		1, 16.50);
		//Declaration of a ProductionWorker object named joan
		//Passes in an employee's name, number, hire date, shift, and hourly pay rate
		ProductionWorker joan = new ProductionWorker("Joan Jones", "222-L", "12-12-2005", 
		2, 18.50);
		
		//Prints out the first production worker's information
		System.out.println("Here's the first production worker.");
		System.out.println("Name: " + john.getEmployeeName());
		System.out.println("Employee Number: " + john.getEmployeeNumber());
		System.out.println("Hire Date: " + john.getHireDate());
		if(john.getShift() == 1) {
			System.out.println("Shift: Day");
		}
		else if(john.getShift() == 2) {
			System.out.println("Shift: Night");
		}
		System.out.print("Hourly Pay Rate: ");
		System.out.printf("$%.2f", john.getHourlyRate());
		System.out.println("\n");
		
		//Prints out the second production worker's information
		System.out.println("Here's the second production worker.");
		System.out.println("Name: " + joan.getEmployeeName());
		System.out.println("Employee Number: " + joan.getEmployeeNumber());
		System.out.println("Hire Date: " + joan.getHireDate());
		if(joan.getShift() == 1) {
			System.out.println("Shift: Day");
		}
		else if(joan.getShift() == 2) {
			System.out.println("Shift: Night");
		}
		System.out.print("Hourly Pay Rate: "); 
		System.out.printf("$%.2f", joan.getHourlyRate());
	}
}