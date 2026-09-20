//Exercise 1

//Declaration of public class
public class HueyZane_Lab11_1
{
	
	//Main function
	public static void main(String[] args)
	{	
		double[] testScores = {54, 32, 78, 94, 36};
		
		TestScores testAverage = new TestScores(testScores);
		
		double average = testAverage.Average();
		System.out.println("The average of the tests is: " + average);
	}
}