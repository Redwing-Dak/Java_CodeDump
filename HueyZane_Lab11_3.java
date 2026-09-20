//Library import
import java.util.Scanner;	//Allows for reading user input

//Public class
public class HueyZane_Lab11_3 {
	//Main class
    public static void main(String[] args) {
		//Declaration of Scanner object named keyboard
        Scanner keyboard = new Scanner(System.in);
		//Integer to hold the number of units on hand
        int unitsOnHand = -1;
		//Double to hold the price of an item
        double price = -1;
        
		//Print statement asking the user for an item's description
        System.out.print("Enter the item description: ");
		//Stores the user's input
        String description = keyboard.nextLine();
        
        //While loop that runs until the number of units is positive
        while (unitsOnHand < 0) {
			//Try statement to validate the units on hand
            try {
				//Print statement asking the user for the number of units on hand
                System.out.print("Enter the units on hand: ");
				//Converts the user's input into an integer and stores it
                unitsOnHand = keyboard.nextInt();
                
				//If statement checking if the units on hand is positive
                if (unitsOnHand < 0) {
					//Throws an exception and passes in the units on hand
                    throw new NegativeUnitsException(unitsOnHand);
                }
            }
			//Catch statement to catch exceptions
			catch (NegativeUnitsException e) {
				//Prints the exception message
                System.out.println(e.getMessage());
				//Sets the units on hand so that the loop runs again
                unitsOnHand = -1;
            }
        }
        
        //While loop that runs until the price is positive
        while (price < 0) {
			//Try statement to validate the price
            try {
				//Print statement asking the user for the price of an item
                System.out.print("Enter the item price: ");
				//Converts the user's input into a double and stores it
                price = keyboard.nextDouble();
                
				//If statement checking if the price is positive
                if (price < 0) {
					//Throws an exception and passes in the price
                    throw new NegativePriceException(price);
                }
            }
			//Catch statement to catch exceptions
			catch (NegativePriceException e) {
				//Prints the exception message
                System.out.println(e.getMessage());
				//Sets the price so that the loop runs again
                price = -1;
            }
        }
        
        
		//Try statement to validate the RetailItem declaration
        try {
			//Declaration of RetailItem named item
			//Passes in the description, unitsOnHand, and price
            RetailItem item = new RetailItem(description, unitsOnHand, price);
			//Print statements telling the user what they entered for the description,
			//units on hand, and price
            System.out.println("You entered: ");
            System.out.println("    Description: " + item.getDescription());
            System.out.println("    Units on hand: " + item.getUnitsOnHand());
            System.out.println("    Price: $" + item.getPrice());
        }
		//Catch statement to catch exceptions
		catch (NegativeUnitsException | NegativePriceException e) {
			//Print statement telling the user there is an error in the constructor
			//Prints the exception message
            System.out.println("Error in RetailItem constructor: " + e.getMessage());
        }
    }
}