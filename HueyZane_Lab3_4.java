//Exercise 4

//Importing the JOptionPane class to receive input
import javax.swing.JOptionPane;
//Importing the DecimalFormat class to format output
import java.text.DecimalFormat;

//Declaration of public class
public class HueyZane_Lab3_4
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of a DecimalFormat object to format output like an average
		DecimalFormat Average = new DecimalFormat("00.00");
		
		//Declaration of string variable to hold future user input
		String inputString;
		//Creates dialog box asking the user for the first test score
		inputString = JOptionPane.showInputDialog("Enter the first test score: ");
		//Double variable to convert the user's input into a double for future use
		double TestOneScore = Double.parseDouble(inputString);
		//Creates dialog box asking the user for the second test score
		inputString = JOptionPane.showInputDialog("Enter the second test score: ");
		//Double variable to convert the user's input into a double for future use
		double TestTwoScore = Double.parseDouble(inputString);
		//Creates dialog box asking the user for the third test score
		inputString = JOptionPane.showInputDialog("Enter the third test score: ");
		//Double variable to convert the user's input into a double for future use
		double TestThreeScore = Double.parseDouble(inputString);
		//Double variable to calculate the average of the three test scores
		double TestAverage = (TestOneScore + TestTwoScore + TestThreeScore) / 3;
		
		//Character variable to store the letter associated with the test average
		char TestLetter = 'E';
		//If statement that sets the letter grade according to the test average
		if (TestAverage >= 90 && TestAverage <= 100)
			//Sets the letter grade to A
			TestLetter = 'A';
		else if (TestAverage >= 80 && TestAverage <= 89)
			//Sets the letter grade to B
			TestLetter = 'B';
		else if (TestAverage >= 70 && TestAverage <= 79)
			//Sets the letter grade to C
			TestLetter = 'C';
		else if (TestAverage >= 60 && TestAverage <= 69)
			//Sets the letter grade to D
			TestLetter = 'D';
		else if (TestAverage < 60)
			//Sets the letter grade to F
			TestLetter = 'F';
			
		//Creates message box telling the user what the average test score is
		//and what the associated letter grade is
		JOptionPane.showMessageDialog(null, "The test score average is: " + 
		Average.format(TestAverage) + "\n And the associated letter grade is: " 
		+ TestLetter);
	}
}