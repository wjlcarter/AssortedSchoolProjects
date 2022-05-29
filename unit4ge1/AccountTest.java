package unit4ge1;
// Name: Wayland Carter
// Date: 7/18/2020
// Unit 4 Graded Exercise 1

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args)
	{
		Account accounts[] = new Account[5]; // array of accounts
		int accountCounter = 0;
		int accountType = 0;
		double fee, interestRate, balance;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 1 for checking, 2 for savings, 3 for general account, -1 to quit");
		accountType = input.nextInt();

		while (accountType != -1 && accountCounter < 5)
		{
			System.out.println("Enter balance: ");
			balance = input.nextDouble();
			try
			{
				switch (accountType)
				{
					case 1: //Checking
						System.out.printf("%s: ", "Enter the fee");
						fee = input.nextDouble();
						accounts[accountCounter] = new CheckingAccount(balance, fee);
						break;
					case 2: //Savings
						System.out.printf("%s: ", "Enter the interest rate: ");
						interestRate = input.nextDouble();
						accounts[accountCounter] = new SavingsAccount(balance, interestRate);
						break;
					case 3: //Account
						accounts[accountCounter] = new Account(balance);
						break;
				}
				accountCounter++;
				if(accountCounter != 5)
				{
					System.out.println("Enter 1 for checking, 2 for savings, 3 for general account, -1 to quit");
					accountType = input.nextInt();
				}
			} // end try

			catch (IllegalArgumentException e)
			{
				System.out.println(e.getMessage()); // print message
			}
		}
		// loop through accounts and figure out which is which
		for (Account account : accounts)
		{
			if(account != null)
			{
				if(account instanceof SavingsAccount) //downcast
				{
					SavingsAccount savingsAct = (SavingsAccount)account;
					double yearInterest = savingsAct.calculateInterest();
					savingsAct.credit(yearInterest);
				}
				System.out.printf("%s", account); //downcast and call the appropriate toString
												  //of the child class
			}
		}

		input.close();
	}
}
