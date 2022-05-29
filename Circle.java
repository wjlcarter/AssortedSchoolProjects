import java.util.Scanner;

// Name: Wayland Carter
// Date: 6/20/2020
// Unit 1 Guided Practice 2
// Description: calculates diameter, circumference, and area of a circle

public class Circle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in ); // any time we need user input
		
		double radius, diameter, circumference, area;
		
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		if( radius > 0 )
		{
			diameter = radius * 2;
			circumference = Math.PI * diameter;
			area = Math.PI * Math.pow(radius, 2);
			
			System.out.printf("Diameter is %.2f\n", diameter);
			System.out.printf("Circumference is %.2f\n", circumference);
			System.out.printf("Area is %.2f\n", area);
		}
		else
		{
			System.out.println("Error! Radius must be a positive number.");
		}
		
		input.close();
	}
}
