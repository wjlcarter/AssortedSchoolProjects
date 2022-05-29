import java.util.Scanner;

// Name: Wayland Carter
// Date: 7/10/2020
// Quiz 1 TaxTest

public class TaxTest
{
	public static void main(String[] args)
	{
		Tax tax1;
		String name;
		double income, taxRate;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.printf("%s, enter your yearly income: ", name);
		income = input.nextDouble();
		
		tax1 = new Tax(name, income);
		
		taxRate = (tax1.calcIncomeTax() / income) * 100;
		
		System.out.printf("%s, you owe $%.2f\n", name, tax1.calcIncomeTax());
		System.out.printf("You have an effective tax rate of %.1f", taxRate);
		
		input.close();
	}
}
