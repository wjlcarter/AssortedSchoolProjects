import java.util.Scanner;

// Name: Wayland Carter
// Date: 6/20/2020
// Unit 1 Graded Exercise 1 - Even or Odd

public class EvenOdd
{
	public static void main(String[] args)
	{
		//remainder operator
		//%
		int number = 0;
		
		//int remainder = integer2 % 2;
		//remainder: 0
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a whole number: ");
		number = input.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.printf("Your number is an even number.");
		}
		else
		{
			System.out.printf("Your number is an odd number.");
		}
		input.close();
	}
}
