// Import necessary libraries
import java.util.Scanner;  // For taking input from the user
import java.io.*;          // For handling file operations

// Declaration of the public class
public class HueyZane_Lab4_6
{
    // Main function that executes the program
    public static void main(String[] args) throws IOException
    {   
        // Create a scanner object to read input from the user
        Scanner keyboard = new Scanner(System.in);
        
        // Ask the user to enter the name of a file
        System.out.print("Enter the name of a file: ");
        String FileName = keyboard.nextLine();  // Store the file name entered by the user
        
        // Create a File object to access the file
        File UserFile = new File(FileName);
        
        // Create a scanner to read from the file
        Scanner inputFile = new Scanner(UserFile);
        
        // Ask the user to enter a character to search for
        System.out.print("Enter a character: ");
        String UserCharacter = keyboard.nextLine();  // Store the character entered by the user
        
        // Convert the input string to a single character
        char UserChar = UserCharacter.charAt(0);
        
        // Variable to count the occurrences of the character
        int NumOccurrences = 0;
        
        // Loop through each line in the file
        while(inputFile.hasNextLine()) {
            String line = inputFile.nextLine();  // Read the next line from the file
            
            // Loop through each character in the line
            for(int index = 0; index < line.length(); index++) {
                
                // If the current character matches the user input character, increment the counter
                if(line.charAt(index) == UserChar) {
                    NumOccurrences += 1; 
                }
            }
        }
        
        // Close the file scanner to release resources
        inputFile.close();
        
        // Print the total number of occurrences of the character in the file
        System.out.println("There are " + NumOccurrences + " of your character!");
    }
}