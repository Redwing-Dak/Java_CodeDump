//Exercise 17

//Library imports
import javax.swing.JOptionPane;	//Allows for reading input from the user
import java.util.Random;

//Declaration of public class
public class HueyZane_Lab5_17
{
	/* ComputerChoice
	Takes in a random variable and returns a random number between 1 and 3
	Parameter - random is a randomly generated number
	Returns a random number between 1 and 3
	*/
	public static int ComputerChoice(Random random) {
		//Declaration of Random object so that numbers can be randomly generated
		Random randomNumber = new Random();
		//Returns a random number between 1 and 3
		return randomNumber.nextInt(3) + 1;
	}
	
	/* UserChoice
	Takes no parameters and asks the user whether they choose rock, paper, or scissors
	Returns the user's choice of rock, paper, or scissors
	*/
	public static String UserChoice() {
		//Input dialog asking the user whether they want to play rock, paper, or scissors
		String User = JOptionPane.showInputDialog("Choose rock, paper or scissors: ");
		//Returns the user's input in lowercase form
		return User.toLowerCase();
	}
	
	/* DisplayComputerChoice
	Takes in an integer and determines whether the computer is playing rock, paper, or scissors
	Parameter - ComputerChoice is an integer that stores the randomly generated number
	Returns whether the computer is playing rock, paper, or scissors
	*/
	public static String DisplayComputerChoice(int ComputerChoice) {
		//Forward declaration to be redeclared later
		String ComputerGuess = "";
		//If statement to determine what the computer is playing
		if(ComputerChoice == 1) {
			//Sets the computer's guess to rock
			ComputerGuess = "rock";
			//Message dialog telling the user that the computer chose rock
			JOptionPane.showMessageDialog(null, "The computer chose: " + ComputerGuess);
		}
		else if(ComputerChoice == 2) {
			//Sets the computer's guess to paper
			ComputerGuess = "paper";
			//Message dialog telling the user that the computer chose paper
			JOptionPane.showMessageDialog(null, "The computer chose: " + ComputerGuess);
		}
		else if(ComputerChoice == 3) {
			//Sets the computer's guess to scissors
			ComputerGuess = "scissors";
			//Message dialog telling the user that the computer chose scissors
			JOptionPane.showMessageDialog(null, "The computer chose: " + ComputerGuess);
		}
		//Returns the computer's guess
		return ComputerGuess;
	}
	
	/* DetermineWinner
	Takes in the user's choice and the computer's choice and determines who the winner is
	Parameter - UserChoice is a string that holds the user's play
	Parameter - ComputerChoice is a string that holds the computer's play
	*/
	public static boolean DetermineWinner(String UserChoice, String ComputerChoice) {
		//If statement to check if the user's play beats the computer's, is beaten by the computer, or is the same as the computer's
		if((UserChoice.equals("paper") && ComputerChoice.equals("rock")) || 
		  (UserChoice.equals("rock") && ComputerChoice.equals("scissors")) || 
		  (UserChoice.equals("scissors") && ComputerChoice.equals("paper"))) {
			//Message dialog telling the user that they beat the computer
			JOptionPane.showMessageDialog(null, "You beat the computer!");
			//Returns false as the game is not tied
			return false;
		}
		else if((ComputerChoice.equals("paper") && UserChoice.equals("rock")) || 
		  (ComputerChoice.equals("rock") && UserChoice.equals("scissors")) || 
		  (ComputerChoice.equals("scissors") && UserChoice.equals("paper"))) {		
			//Message dialog telling the user that the computer beat them
			JOptionPane.showMessageDialog(null, "The computer beat you!");
			//Returns false as the game is not tied
			return false;
		}
		else{
			//Message dialog telling the user that they tied with the computer
			JOptionPane.showMessageDialog(null, "You and the computer tied!");
			//Returns true as the game is tied
			return true;
		}	
	}

	//Main function
	public static void main(String[] args)
	{
		//Declaration of Random object so numbers can be randomly generated
		Random randomNumber = new Random();
		//Boolean variable to determine if the game is a tie
		boolean IsTie = false;

		//Do while loop that runs once and then runs repeatedly until the game leaves a tied state
		do {
			//Integer variable that calls the ComputerChoice method, passes in randomNumber, and stores the result
			int ComputerNumber = ComputerChoice(randomNumber);
			//String variable that calls the UserChoice method, and stores the result
			String UserChoice = UserChoice();
			//String variable that calls the DisplayComputerChoice method, passes in ComputerNumber, and stores the result
			String ComputerGuess = DisplayComputerChoice(ComputerNumber);
			//Calls the DetermineWinner, passes in UserChoice and ComputerGuess, and stores there result
			IsTie = DetermineWinner(UserChoice, ComputerGuess);
		}
		while(IsTie == true);
	}
}