//Exercise 9

//Declaration of public class
public class HueyZane_Lab10_9
{
	
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of SavingsAccount object named savings
		SavingsAccount savings = new SavingsAccount(100.0, 0.03, 2.50);
		//Print statements to display the current balance, the number of deposits, and the number of withdrawals
		System.out.println("Balance: $" + savings.getBalance());
		System.out.println("Number of deposits: " + savings.getNumberDeposits());
		System.out.println("Number of withdrawals: " + savings.getNumberWithdrawals());
		
		//Calls the Deposit method three times and passes in a different amount each time
		savings.Deposit(25.00);
		savings.Deposit(10.00);
		savings.Deposit(35.00);
		
		//Print statements to display the current balance, the number of deposits, and the number of withdrawals
		System.out.println("");
		System.out.println("Balance: $" + savings.getBalance());
		System.out.println("Number of deposits: " + savings.getNumberDeposits());
		System.out.println("Number of withdrawals: " + savings.getNumberWithdrawals());
		
		//Calls the Withdraw method four times and passes in a different amount each time
		savings.Withdraw(100.00);
		savings.Withdraw(50.00);
		savings.Withdraw(1.00);
		savings.Withdraw(1.00);
		
		//Print statements to display the current balance, the number of deposits, and the number of withdrawals
		System.out.println("");
		System.out.println("Balance: $" + savings.getBalance());
		System.out.println("Number of deposits: " + savings.getNumberDeposits());
		System.out.println("Number of withdrawals: " + savings.getNumberWithdrawals());
		
		//Calls the MonthlyProcess method
		savings.MonthlyProcess();
		
		//Print statements to display the current balance, the number of deposits, and the number of withdrawals
		System.out.println("");
		System.out.print("Balance: $");
		System.out.printf("%.2f", savings.getBalance());
		System.out.print("\n");
		System.out.println("Number of deposits: " + savings.getNumberDeposits());
		System.out.println("Number of withdrawals: " + savings.getNumberWithdrawals());
	}
}