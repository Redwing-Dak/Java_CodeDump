//Exercise 15

//Imports the Scanner class for user input and PrintWriter for file writing
import java.util.Scanner;
import java.io.*;

//Declaration of public class
public class HueyZane_Lab4_15
{
	//Main function
	public static void main(String[] args) throws IOException
	{	
		//Creates a Scanner object to receive user input
		Scanner keyboard = new Scanner(System.in);
		//Creates a PrintWriter object to write to a new file
		PrintWriter OutputFile = new PrintWriter("Lab4_13_2.txt");

		//Prompting the user to enter a file name
		System.out.print("Enter the name of a file: ");
		String FileName = keyboard.nextLine();
		//Creates a File object for reading
		File UserFile = new File(FileName);
		Scanner InputFile = new Scanner(UserFile);
		
		//Loop to read each line from the file and write it in uppercase to the output file
		while(InputFile.hasNextLine()) {
			String Line = InputFile.nextLine();
			OutputFile.println(Line.toUpperCase()); // Converts each line to uppercase before writing
		}
		//Closes the output file to save changes
		OutputFile.close();
	}
}