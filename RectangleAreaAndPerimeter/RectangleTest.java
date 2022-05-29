import java.util.Scanner;

// Name: Wayland Carter
// Date: 7/17/2020
// Midterm - RectangleTest

public class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle rectangle1;
		double length, width;
		  
		Scanner input = new Scanner(System.in);
		  
		System.out.print("Enter length of rectangle: ");
		length = input.nextDouble();
		  
		System.out.print("Enter width of rectangle: ");
		width = input.nextDouble();
		
		rectangle1 = new Rectangle(length, width);
		
		rectangle1.printRectangle();
		
		input.close();
	}

}
