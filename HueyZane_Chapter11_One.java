//Exercise One

//Declaration of public class
public class HueyZane_Chapter11_One
{
	
	//Main function
	public static void main(String[] args)
	{		
		//Declaration of two double arrays to hold test scores
		double[] badScores = {97.5, 66.7, 88.0, 101.0, 99.0};
		double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0};
		
		//Try statement to validate the test scores
		try {
			//Declaration of TestScores1 object named bad
			TestScores1 bad = new TestScores1(badScores);
			//Calls the GetAverage method
			bad.GetAverage();
		}
		//Catch statement to catch exceptions
		catch(IllegalArgumentException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}
		//Try statement to validate the test scores
		try {
			//Declaration of TestScores1 object named good
			TestScores1 good = new TestScores1(goodScores);
			//Double variable to call the GetAverage method and store the result
			double goodAverage = good.GetAverage();
			//Print statement telling the user the average of the good array
			System.out.println("The average of the good scores is " + goodAverage);	
		}
		//Catch statement to catch exceptions
		catch(IllegalArgumentException e) {
			//Prints the exception message
			System.out.println(e.getMessage());
		}	
	}
}