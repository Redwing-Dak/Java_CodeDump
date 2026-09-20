//Exercise 18

//Importing the JOptionPane class to receive input
import javax.swing.JOptionPane;

//Declaration of public class
public class HueyZane_Lab3_18
{
	//Main function
	public static void main(String[] args)
	{
		//Variable declarations to be redeclared later
		boolean Vegetarian = false;
		boolean Vegan = false;
		boolean GlutenFree = false;
		
		//Declaration of string variable to hold future user input
		String inputString;
		//Declaration of character variable to hold future user input
		char UserInput;
		//Creates input dialog to ask the user if any of their group members are vegetarian
		inputString = JOptionPane.showInputDialog("Are any members of your group vegetarian? Y or N: ");
		//Converts the user's input into a character
		UserInput = inputString.charAt(0);
		//If statement to set vegetarian to either true or false
		if (UserInput == 'Y')
		{
			//Sets vegetarian to true because at least one group member is vegetarian
			Vegetarian = true;
		}
		//Creates input dialog to ask the user if any of their group members are vegan
		inputString = JOptionPane.showInputDialog("Are any members of your group vegan? Y or N: ");
		//Converts the user's input into a character
		UserInput = inputString.charAt(0);
		//If statement to set vegan to either true or false
		if (UserInput == 'Y')
		{
			//Sets vegan to true because at least one group member is vegan
			Vegan = true;
		}
		//Creates input dialog to ask the user if any of their group members are gluten-free
		inputString = JOptionPane.showInputDialog("Are any members of your group gluten-free? Y or N: ");
		//Converts the user's input into a character
		UserInput = inputString.charAt(0);
		//If statement to set gluten-free to either true or false
		if (UserInput == 'Y')
		{
			//Sets gluten-free to true because at least one group member is gluten-free
			GlutenFree = true;
		}
		
		//If statement that checks how many boolean variables were set to true
		if (!Vegetarian && !Vegan && !GlutenFree)
		{
			//Print statement telling the user what their options are if the group has no restricions
			JOptionPane.showMessageDialog(null, "Your options are: Joe's Gourmet Burgers, Main Street Pizza Company, Corner Cafe, " + 
			"Mama's Fine Italian, and The Chef's Kitchen.");
		}
		else if (Vegetarian == true && Vegan == false && GlutenFree == false)
		{
			//Print statement telling the user what their options are if they have at least one vegetarian member
			JOptionPane.showMessageDialog(null, "Your options are: Main Street Pizza Company, Corner Cafe, Mama's Fine Italian, " +
			"and The Chef's Kitchen.");
		}
		else if (Vegetarian == true && Vegan == true && GlutenFree == false)
		{
			//Print statement telling the user what their options are if they have at least one vegetarian and vegan member
			JOptionPane.showMessageDialog(null, "Your options are: Corner Cafe, and The Chef's Kitchen.");
		}
		else if (Vegetarian == true && Vegan == true && GlutenFree == true)
		{
			//Print statement telling the user what their options are if they have at least one vegetarian, vegan, and gluten-free member
			JOptionPane.showMessageDialog(null, "Your options are: Corner Cafe, and The Chef's Kitchen.");
		}
	}
}