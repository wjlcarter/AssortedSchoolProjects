// Name: Wayland Carter
// Date: 7/17/2020
// Midterm - Rectangle

public class Rectangle
{
	//instance variables
	private double length, width;
	
	public Rectangle(double length, double width)
	{
		setLength(length);
		setWidth(width);
	}

	public Rectangle(double length)
	{
		setLength(length);
	}
	
	public void setLength(double length)
	{
		if(length < 0)
		{
			this.length = 0;
		}
		else if(length > 20)
		{
			this.length = 20;
		}
		else
		{
			this.length = length;
		}
	}
	
	public void setWidth(double width)
	{
		if(width < 0)
		{
			this.width = 0;
		}
		else if(width > 20)
		{
			this.width = 20;
		}
		else
		{
			this.width = width;
		}
		
		this.width = width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getPerimeter()
	{
		double perimeter;
		perimeter = (length + width) * 2;
		return perimeter;
	}
	
	public double getArea()
	{
		double area;
		area = length * width;
		return area;
	}
	
	public void printRectangle()
	{
		System.out.printf("Length of rectangle is: %.2f", length);
		System.out.printf("\nWidth of rectangle is: %.2f", width);
		System.out.printf("\nPerimeter of rectangle is: %.2f", getPerimeter());
		System.out.printf("\nArea of rectangle is: %.2f", getArea());
	}
	
}
