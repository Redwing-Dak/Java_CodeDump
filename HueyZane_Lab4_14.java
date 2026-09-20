//Exercise 14

//Imports the Scanner and File classes for user input and file handling
import java.util.Scanner;
import java.io.*;

//Declaration of public class
public class HueyZane_Lab4_14
{
	//Main function with IOException handling for file operations
	public static void main(String[] args) throws IOException
	{	
		//Creates a Scanner object to receive user input
		Scanner keyboard = new Scanner(System.in);

		//Prompting the user to enter the name of a file
		System.out.print("Enter the name of a file: ");
		//Reads the file name from user input
		String FileName = keyboard.nextLine();
		//Creates a File object with the specified name
		File UserFile = new File(FileName);
		//Creates a Scanner object to read from the file
		Scanner InputFile = new Scanner(UserFile);
		
		//Variable to track the number of lines read
		int Index = 0;
		//While loop that reads and prints all lines from the file
		while(InputFile.hasNextLine()) {
			//Reads a line from the file
			String Line = InputFile.nextLine();
			//Prints the line number followed by the line content
			System.out.print(Index + 1 + ": ");
			System.out.println(Line);
			//Increments the line counter
			Index++;
		}
		//Closes the file to free resources
		InputFile.close();
	}
}