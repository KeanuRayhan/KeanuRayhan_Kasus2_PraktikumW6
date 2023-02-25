package Kasus2PaintingShapes;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	//------------------------------------
	// Constructor : Set up the Rectangle.
	//------------------------------------
	public Rectangle(double w, double l) 
	{
		super("Rectangle");
		width = w;
		length = l;
	}
	
	//------------------------------------------
	// Return the surface area of the rectangle.
	//------------------------------------------
	public double area()
	{
		return length*width;
	}
	
	//-----------------------------------
	// Returns the rectangle as a String.
	//-----------------------------------
	public String toString()
	{
		return super.toString() + " of width " + 
				width + " and length " + length;
	}

}
