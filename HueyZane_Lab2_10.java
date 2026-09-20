//Exercise 10

//Importing the JOptionPane class to receive input
import javax.swing.JOptionPane;

//Declaration of public class
public class HueyZane_Lab2_10
{
	//Main function
	public static void main(String[] args)
	{
		//String variable to temporarily store the user's input
		String inputString;
		//Reading user input into inputString before converting to the necessary data type
		inputString = JOptionPane.showInputDialog("What is the first test score?");
		//Integer variable to convert the user's input into a usable data type
		//Integer variable to store the TestOneScore
		int TestOneScore = Integer.parseInt(inputString);
		//Reading user input into inputString before converting to the necessary data type
		inputString = JOptionPane.showInputDialog("What is the second test score?");
		//Integer variable to convert the user's input into a usable data type
		//Integer variable to store the TestTwoScore
		int TestTwoScore = Integer.parseInt(inputString);
		//Reading user input into inputString before converting to the necessary data type
		inputString = JOptionPane.showInputDialog("What is the third test score?");
		//Integer variable to convert the user's input into a usable data type
		//Integer variable to store the TestThreeScore
		int TestThreeScore = Integer.parseInt(inputString);
		
		//Double variable to calculate and store the average of the three tests
		double TestAverage = (TestOneScore + TestTwoScore + TestThreeScore) / 3;
		System.out.println(TestAverage);
		
		//Message box to display the scores of all three tests and the average of the tests
		JOptionPane.showMessageDialog(null, "The first test score is " + TestOneScore +
		", the second test score is " + TestTwoScore + ", the third test score is " +
		TestThreeScore + ", and the test average is " + TestAverage);
		
		//Closes the message box and stops running its threads
		System.exit(1000);
	}
}