//Chapter 3, Assignment 1
//Test Score Average - Receives three test scores from the user and
//determines the average and letter grade

//Importing the Scanner class to receive input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Chapter3_One
{
	//Main function
	public static void main(String[] args)
	{
		//Declaration of Scanner object to receive input
		Scanner keyboard = new Scanner(System.in);

		//Print statement asking the user to enter three test scores
		System.out.print("Enter the scores of three tests: ");
		//Reads in the user's inputs and assigns them to double variables
		double TestOneScore = keyboard.nextDouble();
		double TestTwoScore = keyboard.nextDouble();
		double TestThreeScore = keyboard.nextDouble();
		//Double variables to calculate the average of the three test scores
		double TestAverage = (TestOneScore + TestTwoScore + TestThreeScore) / 3;
		
		//Declaration of a character variable to redeclared later
		char LetterGrade = 'E';
		//If statement to calculate what the letter grade is for the test average
		if (TestAverage >= 90 && TestAverage <= 100)
			//Sets the letter grade to A
			LetterGrade = 'A';
		else if (TestAverage >= 80 && TestAverage <= 89)
			//Sets the letter grade to B
			LetterGrade = 'B';
		else if (TestAverage >= 70 && TestAverage <= 79)
			//Sets the letter grade to C
			LetterGrade = 'C';
		else if (TestAverage >= 60 && TestAverage <= 69)
			//Sets the letter grade to D
			LetterGrade = 'D';
		else if (TestAverage < 60)
			//Sets the letter grade to F
			LetterGrade = 'F';
		
		//Print statement telling the user what the test average and letter grade is
		System.out.println("The average of the tests is: " + TestAverage +
		" The letter grade is: " + LetterGrade);
	}
}