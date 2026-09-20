//Exercise 10

//Importing the JOptionPane class to receive input
import javax.swing.JOptionPane;
//Importing the DecimalFormat class to format output
import java.text.DecimalFormat;

//Declaration of public class
public class HueyZane_Lab3_10
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of a DecimalFormat object to format output like a percent
		DecimalFormat percent = new DecimalFormat("00.0%");
		
		//Declaration of string variable to hold future user input
		String inputString;
		//Createss input dialog asking the user for the number of calories in a given item
		inputString = JOptionPane.showInputDialog("Enter the number of " +
		"calories in a food item: ");
		//Double variable to connvert the user's input into a double
		double CalorieAmount = Double.parseDouble(inputString);
		//Creates input dialog asking the user for the number of fat grams in a given item
		inputString = JOptionPane.showInputDialog("Enter the number of " +
		"fat grams in a food item: ");
		//Double variable to convert the user's input into a double
		double FatGramAmount = Double.parseDouble(inputString);
		
		//Double variable to calculate the number of calories that come from fat
		double CaloriesFromFat = FatGramAmount * 9;
		//Double variable to calculate the percentage of calories that come from fat
		double PercentageFromFat = CaloriesFromFat / CalorieAmount;
		
		//If statement checking if the number of calories that come from fat is
		//higher than the total number of calories
		if (CaloriesFromFat >= CalorieAmount)
			//Print statement informing the user that an error has occurred
			System.out.println("Error! There cannot be more calories from fat than total calories!");
		
		else
			//Print statement informing the user what the percentage of calories from fat is
			JOptionPane.showMessageDialog(null, "The percentage of calories " +
			"from fat are: " + percent.format(PercentageFromFat));
			
			//If statement to determine if the item is high in fat or low in fat
			if (PercentageFromFat < 0.3)
				//Print statement telling the user that the item is low in fat
				JOptionPane.showMessageDialog(null, "This food is low in fat!");
			else
				//Print statement telling the user that the item is high in fat
				JOptionPane.showMessageDialog(null, "This food is high in fat!");
	}
}