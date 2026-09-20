//Exercise 12

//Imports the Scanner class for user input
import java.util.Scanner;

//Declaration of public class
public class HueyZane_Lab4_12
{
	//Main function
	public static void main(String[] args)
	{	
		//Creates a Scanner object to receive user input
		Scanner keyboard = new Scanner(System.in);
		
		//Variables to store sales data for five stores
		int StoreOneSales = 0;
		int StoreTwoSales = 0;
		int StoreThreeSales = 0;
		int StoreFourSales = 0;
		int StoreFiveSales = 0;

		//Prompting the user to enter sales data for each store
		System.out.print("Enter today's sales for store 1: ");
		StoreOneSales = keyboard.nextInt();
		System.out.print("Enter today's sales for store 2: ");
		StoreTwoSales = keyboard.nextInt();
		System.out.print("Enter today's sales for store 3: ");
		StoreThreeSales = keyboard.nextInt();
		System.out.print("Enter today's sales for store 4: ");
		StoreFourSales = keyboard.nextInt();
		System.out.print("Enter today's sales for store 5: ");
		StoreFiveSales = keyboard.nextInt();
		
		//Loop to display sales data as asterisks, where each '*' represents $100 in sales
		while(StoreOneSales >= 100) {
			System.out.print("*");
			StoreOneSales -= 100;
		}
		System.out.print("\n");
		while(StoreTwoSales >= 100) {
			System.out.print("*");
			StoreTwoSales -= 100;
		}
		System.out.print("\n");
		while(StoreThreeSales >= 100) {
			System.out.print("*");
			StoreThreeSales -= 100;
		}
		System.out.print("\n");
		while(StoreFourSales >= 100) {
			System.out.print("*");
			StoreFourSales -= 100;
		}
		System.out.print("\n");
		while(StoreFiveSales >= 100) {
			System.out.print("*");
			StoreFiveSales -= 100;
		}
	}
}