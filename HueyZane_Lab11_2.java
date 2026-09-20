//Exercise 2

//Declaration of public class
public class HueyZane_Lab11_2
{
	
	//Main function
	public static void main(String[] args)
	{	
		double[] testScores = {54, 32, 78, 94, 36};
		
		InvalidTestScore validOrNot = new InvalidTestScore(testScores);
		validOrNot.Valid();
	}
}