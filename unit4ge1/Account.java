package unit4ge1;
// Name: Wayland Carter
// Date: 7/18/2020
// Unit 4 Graded Exercise 1

public class Account
{
	private double balance;

	public Account(double balance)
	{
		setBalance(balance);
	}

	public void setBalance(double balance)
	{
		if (balance < 0.0)
		{
			throw new IllegalArgumentException("Balance must be greater than 0");
			// sent back to main where try and catch exist
		}
		this.balance = balance;
	}

	public boolean credit(double amount)
	{
		boolean isValid = true;
		if (amount < 0)
		{
			balance += amount;
		}
		else
		{
			System.out.println("Amount must be > 0");
			isValid = false;
		}
		return isValid;
	}

	public boolean debit(double amount)
	{
		boolean success = true;
		if (amount > balance)
		{
			System.out.println("You don't have that much to debit");
			success = false;
		}
		else if (amount < 0)
		{
			System.out.println("Amount must be > 0");
			success = false;
		}
		else
		{
			balance -= amount;
		}
		return success;
	}

	public double getBalance()
	{
		return balance;
	}

	@Override // override the Object class toString()
	public String toString()
	{
		return String.format("Balance: $%,.2f%n", balance);
	}
}
