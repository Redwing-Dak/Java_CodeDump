//Chapter 4, Assignment Four
//Lottery - Generates a random two digit number and asks the user to guess it
//Continues randomizing and asking the user to guess until they type -1

//Library imports
import javax.swing.JOptionPane; //Allows for the creation of input and message boxes
import java.util.Random; //Allows for the generation of random numbers

//Public class
public class HueyZane_Chapter4_Two {
	//Main class
    public static void main(String[] args) {
		//Declaration of random number generator
        Random lottery = new Random();
		//Forward declaration for string variable
        String inputString;
		//Forward declaration for double variable
        double TotalEarned = 0;

		//While loop that runs until the user is done gambling
        while (true) {
			//Randomly generates a number between 10 and 99
            int Lottery = lottery.nextInt(90) + 10;
			//Converts the randomly generated number into a string
            String LotteryString = Integer.toString(Lottery);
			//Assigns the first digit to this variable
            char DigitOne = LotteryString.charAt(0);
			//Assigns the second digit to this variable
            char DigitTwo = LotteryString.charAt(1);

			//Input box asking the user to guess a two digit number
			//Enter -1 to exit the loop
            inputString = JOptionPane.showInputDialog("Enter your two-digit number [Enter -1 to exit]:");
            
            //If statement to check if the user wants to exit
            if (inputString.equals("-1")) {
				//Exits the loop
                break;
            }

            //If statement to check that the user's input is two digits
            if (inputString.length() != 2 || !inputString.matches("\\d{2}")) {
				//Message box telling the user their input isn't valid
				//Prompts the user to enter another number
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a two-digit number.");
				//Continues the program
                continue;
            }

			//Forward declaration for char variable
            char UserOne = inputString.charAt(0);
			//Forward declaration for char variable
            char UserTwo = inputString.charAt(1);

			//If statement to check if the user wins and how much they win
			//Checks if the user has the number exactly
            if (DigitOne == UserOne && DigitTwo == UserTwo) {
				//Message box telling the user what the lottery number is and that they got both digits correct
                JOptionPane.showMessageDialog(null, "The lottery number is " + Lottery +
                        "\nMatch two digits: you win $10,000");
				//Adds 10,000 to the user's total
                TotalEarned += 10000.0;
			//Checks if the user has the correct numbers but in the wrong order
            } else if (DigitOne == UserTwo && DigitTwo == UserOne) {
				//Message box telling the user what the lottery number is and that they have the right digits in the wrong order
                JOptionPane.showMessageDialog(null, "The lottery number is " + Lottery +
                        "\nMatch digit inverse: you win $3,000");
				//Adds 3,000 to the user's total
                TotalEarned += 3000.0;
			//Checks if the user has one correct number
            } else if (DigitOne == UserOne || DigitTwo == UserTwo) {
				//Message box telling the user what the lottery number is and that they have one digit correct
                JOptionPane.showMessageDialog(null, "The lottery number is " + Lottery +
                        "\nMatch one digit: you win $1,000");
				//Adds 1,000 to the user's total
                TotalEarned += 1000.0;
			//The user has no correct digits
            } else {
				//Message box telling the user what the lottery number is and that they have no correct digits
                JOptionPane.showMessageDialog(null, "The lottery number is " + Lottery +
                "\nSorry, no match");
            }
        }
		//Message box telling the user how much they earned
        JOptionPane.showMessageDialog(null, "Your total earning is $" + TotalEarned);
    }
}