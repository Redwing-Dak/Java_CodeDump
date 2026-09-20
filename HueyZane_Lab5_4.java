//Exercise 4

//Library imports
import javax.swing.JOptionPane;	//Allows for reading input from the user

//Declaration of public class
public class HueyZane_Lab5_4
{
	/* GallonsNeeded
	The method takes in no parameters, asks the user for the number of rooms being painted, asks for the square footage of each room,
	and calculates the number of gallons of paint needed for the project
	Returns the total number of gallons needed to complete the project
	*/
	public static double GallonsNeeded () {
		//Input dialog asking for how many rooms are being painted
		String inputString = JOptionPane.showInputDialog("Enter the number of rooms being painted: ");
		//Converts the user's input into an integer
		int TotalRooms = Integer.parseInt(inputString);
		
		//Forward declarations to be redeclared later
		double SquareFootage = 0;
		double GallonsNeeded = 0;
		
		//For loop to iterate through each room
		for(; TotalRooms > 0; TotalRooms--) {
			//Input dialog asking for the square footage of the room's walls
			inputString = JOptionPane.showInputDialog("Enter the square footage of the walls in the room: ");
			//Adds the user's input to the total amount of square footage
			SquareFootage += Integer.parseInt(inputString);
		}
		//While loop to calculate the number of gallons needed
		while(SquareFootage >= 115) {
			//Increments the number of gallons by 1
			GallonsNeeded++;
			//Subtracts 115 from the square footage total
			SquareFootage -= 115;
		}
		//If statement to calculate an amount less than a full gallon
		if(SquareFootage < 115 && SquareFootage > 0) {
			//Adds the amount less than a gallon to the total needed
			GallonsNeeded = GallonsNeeded + (SquareFootage / 1);
			//Subtracts the remaining amount of square footage from the total
			SquareFootage -= SquareFootage; 
		}
		
		//Message dialog telling the user how many gallons of paint are needed
		JOptionPane.showMessageDialog(null, "The total number of gallons needed is: " + GallonsNeeded);
		//Returns the total number of gallons for future use
		return GallonsNeeded;
	}
	
	/* LaborNeeded
	Takes in the number of gallons needed and calculates how many hours it will take to finish
	Parameter - Gallons is a double to hold the number of gallons needed
	Returns the total number of hours needed to complete the project
	*/
	public static double LaborNeeded(double Gallons) {
		//Declaration of double to hold the total labor hours that are needed
		double HoursOfLabor = 0;
		
		//While loop to add the necessary number of hours per gallon
		while(Gallons > 0) {
			//Adds 8 to the number of hours needed
			HoursOfLabor += 8;
			//Subtracts 1 from the number of gallons
			Gallons--;
		}
		//If statement to calculate less than a full hour
		if(Gallons < 1 && Gallons > 0) {
			//Adds the amount less than an hour to the total
			HoursOfLabor = HoursOfLabor + (Gallons / 1);
		}
		
		//Message dialog telling the user how many hours the project will take
		JOptionPane.showMessageDialog(null, "The total hours this project will take is: " + HoursOfLabor);
		//Returns the total number of hours for future use
		return HoursOfLabor;
	}
	
	/* PaintPrice
	Takes in the number of gallons needed and calculates how much the paint will cost
	Parameter - Gallons is a double that holds the total number of gallons needed
	Returns the total cost of the paint
	*/
	public static double PaintPrice(double Gallons) {
		//InputDialog asking the user how much a gallon of paint costs
		String inputString = JOptionPane.showInputDialog("Enter how much a gallon of paint costs: ");
		//Converts the user's input into a double
		double GallonCost = Double.parseDouble(inputString);
		//Double variable to hold the total cost of paint
		double PaintCost = 0;
		
		//Takes the number of gallons and multiplies it by the price of a gallon
		PaintCost = Gallons * GallonCost;
		
		//Message dialog telling the user the total cost of paint
		JOptionPane.showMessageDialog(null, "The total cost of paint is: $" + PaintCost);
		//Returns the total cost of paint
		return PaintCost;
	}
	
	/* Labor
	Takes in the number of hours worked and calculates the cost of labor
	Parameter - HoursWorked is a double to hold the total number of hours
	Returns the total cost of labor
	*/
	public static double Labor(double HoursWorked) {
		//Sets the hourly wage
		double WagePerHour = 18;
		//Multiplies the number of hours worked by the hourly wage
		double TotalLabor = HoursWorked * WagePerHour;
		
		//Message dialog telling the user the total cost of labor
		JOptionPane.showMessageDialog(null, "The total cost of labor is: $" + TotalLabor);
		//Returns the labor cost
		return TotalLabor;
	}
	
	/* Total
	Takes in the cost of paint and labor and adds it together to find the overall total
	Parameter - PaintCost is a double that holds the total cost of paint
	Parameter - TotalLabor is a double that holds the total cost of labor
	Returns the overall total
	*/
	public static double Total(double PaintCost, double TotalLabor) {
		//Calculates the total by adding the paint cost and labor cost
		double Total = PaintCost + TotalLabor;
		
		//Message dialog telling the user the total cost of the project
		JOptionPane.showMessageDialog(null, "The total project cost is: $" + Total);
		//Returns the overall cost
		return Total;
	}
	
	//Main function
	public static void main(String[] args)
	{
		//Calls the GallonsNeeded method and stores the result in a double
		double Gallons = GallonsNeeded();
		//Calls the LaborNeeded method, passes in Gallons, and stores the result in a double
		double HoursOfLabor = LaborNeeded(Gallons);
		//Calls the PaintPrice method, passes in Gallons, and stores the result in a double
		double PriceOfPaint = PaintPrice(Gallons);
		//Calls the Labor method, passes in HoursOfLabor, and stores the result in a double
		double LaborCosts = Labor(HoursOfLabor);
		//Calls the Total method, passes in PriceOfPaint and LaborCosts, and stores the result in a double
		double TotalCost = Total(PriceOfPaint, LaborCosts);
		//Message dialog telling the user how many gallons of paint are needed, how many hours the project will take,
		//how much the paint will cost, how much the labor will cost, and how what the total cost is
		JOptionPane.showMessageDialog(null, "The gallons of paint needed is: " + Gallons +
		", the hours of labor needed  is: " + HoursOfLabor + ", the price of paint is: $" + PriceOfPaint +
		", the price of labor is: $" + LaborCosts + ", and the total cost is: $" + TotalCost);
	}
}