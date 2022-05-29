package unit4ge1;
// Name: Wayland Carter
// Date: 7/18/2020
// Unit 4 Graded Exercise 1

public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(double interestRate, double balance)
	{
		super(balance); //calls constructor of Account class
		
		setInterestRate(interestRate);
	}
	
	void setInterestRate(double interestRate)
	{
		if(interestRate < 0)
		{
			throw new IllegalArgumentException("Interest rate must be greater than 0.");
		}
		this.interestRate = interestRate;
	}
	
	double getInterestRate()
	{
		return interestRate;
	}
	
	double calculateInterest()
	{
		return getBalance() * interestRate;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%s: %.2f\n", super.toString(), "Interest Rate", interestRate);
	}
}
