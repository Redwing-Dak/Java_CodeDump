//Chapter 4, Assignment Four
//Conversion Table - Prints celsius in increments of 3 and their fahrenheit conversions
//Prints fahrenheit in increments of 10 and their celsius conversions

//Declaration of public class
public class HueyZane_Chapter4_One
{
	//Main function
	public static void main(String[] args)
	{	
		//Integer variable to store the first Fahrenheit value
		int Fahrenheit = 40;
		//Integer variable to store the first Celsius value
		int Celsius = 8;	
		
		//Print statement saying a for loop is being used to generate the first table
		System.out.println("<<< For Loop >>>");
		//Print statement creating the header of the first table
		System.out.println("Celsius    Fahrenheit    Fahrenheit    Celsius");
		//Print statement dividing the header from the contents of the first table
		System.out.println("----------------------------------------------");
		
		//Index declaration to be used for all three loops
		int i = 10;
		//For loop to generate the first table
		for(; i > 0; i--) {
			//Double variable to convert the current Celsius value into Fahrenheit
			double FahrenheitConversion = (9.0/5.0) * Celsius + 32;
			//Double variable to convert the current Fahrenheit value into Celsius
			double CelsiusConversion = (5.0/9.0) * (Fahrenheit - 32);
			
			//Formatted print statement
			System.out.printf("%6d         %6.1f        %6d     %6.3f \n", 
			Celsius, FahrenheitConversion, Fahrenheit, CelsiusConversion);
			//Increases Fahrenheit by 10 degrees
			Fahrenheit += 10;
			//Increases Celsius by 3 degrees
			Celsius += 3;
		}
		
		//Print statement saying a while loop is being used to generate the second table
		System.out.println("\n <<< While Loop >>>");
		//Print statement creating the header of the second table
		System.out.println("Celsius    Fahrenheit    Fahrenheit    Celsius");
		//Print statement dividing the header from the contents of the second table
		System.out.println("----------------------------------------------");	
		
		//Resets the index for the second loop
		i = 10;
		//Resets the current Fahrenheit value for the second loop
		Fahrenheit = 40;
		//Resets the current Celsius value for the second loop
		Celsius = 8;
		//While loop to generate the second loop
		while(i > 0) {
			//Double variable to convert the current Celsius value into Fahrenheit
			double FahrenheitConversion = (9.0/5.0) * Celsius + 32;
			//Double variable to convert the current Fahrenheit value into Celsius
			double CelsiusConversion = (5.0/9.0) * (Fahrenheit - 32);
			
			//Formatted print statement
			System.out.printf("%6d         %6.1f        %6d     %6.3f \n", 
			Celsius, FahrenheitConversion, Fahrenheit, CelsiusConversion);
			//Increases Fahrenheit by 10 degrees
			Fahrenheit += 10;
			//Increases Celsius by 3 degrees
			Celsius += 3;
			//Decrements the index by one
			i--;
		}
		
		//Print statement saying a do while loop is being used to generate the third table
		System.out.println("\n <<< Do While Loop >>>");
		//Print statement creating the header of the third table
		System.out.println("Celsius    Fahrenheit    Fahrenheit    Celsius");
		//Print statement dividing the header from the contents of the first table
		System.out.println("----------------------------------------------");
		
		//Resets the index for the third loop
		i = 10;
		//Resets the current Fahrenheit value for the third loop
		Fahrenheit = 40;
		//Resets the current Celsius value for the third loop
		Celsius = 8;
		//Do while loop to generate the third table
		do {
			//Double variable to convert the current Celsius value into Fahrenheit
			double FahrenheitConversion = (9.0/5.0) * Celsius + 32;
			//Double variable to convert the current Fahrenheit value into Celsius
			double CelsiusConversion = (5.0/9.0) * (Fahrenheit - 32);
			
			//Formatted print statement
			System.out.printf("%6d         %6.1f        %6d     %6.3f \n", 
			Celsius, FahrenheitConversion, Fahrenheit, CelsiusConversion);
			//Increases Fahrenheit by 10 degrees
			Fahrenheit += 10;
			//Increases Celsius by 3 degrees
			Celsius += 3;
			//Decrements the index by one
			i--;
		} while(i > 0);
	}
}