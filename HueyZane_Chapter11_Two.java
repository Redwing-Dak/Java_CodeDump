//Exercise Two

//Declaration of public class
public class HueyZane_Chapter11_Two
{
	
	//Main function
	public static void main(String[] args)
	{		
		//Declaration of two double arrays to hold test scores
		double[] badScores = {97.5, 66.7, 88.0, 101.0, 99.0};
		double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0};
		
		//Try statement to validate the test scores
		try {
			//Declaration of TestScores2 object named bad
			TestScores2 bad = new TestScores2(badScores);
			//Calls the GetAverage method
			bad.GetAverage();
		}
		//Catch statement to catch exceptions
		catch(InvalidTestScoreException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}
		//Try statement to validate the test scores
		try {
			//Declaration of TestScores2 object named good
			TestScores2 good = new TestScores2(goodScores);
			//Double variable to call the GetAverage method and store the result
			double goodAverage = good.GetAverage();
			//Print statement telling the user the average of the good array
			System.out.println("The average of the good scores is " + goodAverage);
		}
		//Catch statement to catch exceptions
		catch(InvalidTestScoreException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}
	}
}