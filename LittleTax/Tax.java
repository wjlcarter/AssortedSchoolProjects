// Name: Wayland Carter
// Date: 7/10/2020
// Quiz 1 Tax

public class Tax
{
	private String name;
	private double income;
	
	//constructor
	public Tax(String name, double income)
	{
		setName(name); // call the set method
		setIncome(income); // call the set method
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setIncome(double income)
	{
		this.income = income;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getIncome()
	{
		if(income < 0)
		{
			income = 0;
		}
		return income;
	}
	
	public double calcIncomeTax()
	{
		double incomeTax = 0;
		if(income <= 9525)
		{
			incomeTax = income/10;
		}
		else if(income > 9525 && income <= 38700)
		{
			incomeTax = income / 12;
		}
		else if(income > 38700 && income <= 82500)
		{
			incomeTax = income / 22;
		}
		else if(income > 82500)
		{
			incomeTax = income / 24;
		}
		
		return incomeTax;
	}
	
	public double flatRateTax()
	{
		double flatRateTax = 0;
		
		flatRateTax = income / 14.5;
		
		return flatRateTax;
	}
	
	
}














