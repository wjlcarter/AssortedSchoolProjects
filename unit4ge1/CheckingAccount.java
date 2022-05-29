package unit4ge1;
// Name: Wayland Carter
// Date: 7/18/2020
// Unit 4 Graded Exercise 1

public class CheckingAccount extends Account
{
	private double fee;
	public CheckingAccount(double balance, double fee)
	{
		super(balance);
		setFee(fee);
	}
	
	void setFee(double fee)
	{
		if(fee < 0)
		{
			throw new IllegalArgumentException("Fee must be greater than 0.");
		}
		this.fee = fee;
	}
	
	double getFee()
	{
		return fee;
	}
	
	@Override
	public boolean credit(double amount)
	{
		boolean success;
		success = super.credit(amount);
		if(success)
		{
			super.debit(fee); //debit the fee after the credit
		}
		return success;
	}
	
	@Override
	public boolean debit(double amount)
	{
		boolean success = true;
		if(getBalance() < (amount + fee))
		{
			System.out.println("You don't have that much to debit (with the Fee)");
			success = false;
		}
		else
		{
			success = super.debit(amount + fee);
		}
		return success;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%s: $%.2f\n", super.toString(), "Fee", fee);
	}
}




















