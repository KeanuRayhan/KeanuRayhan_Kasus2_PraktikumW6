package Kasus2PaintingShapes;

public class Cylinder extends Shape {
	private double radius;
	private double height;
	
	//------------------------------------
	// Constructor : Set up the Cylinder.
	//------------------------------------
	public Cylinder(double r, double h) 
	{
		super("Cylinder");
		radius = r;
		height = h;
	}
	
	//-----------------------------------------
	// Return the surface area of the cylinder.
	//-----------------------------------------
	public double area()
	{
		return Math.PI*radius*radius*height;
	}
	
	//----------------------------------
	// Returns the cylinder as a String.
	//----------------------------------
	public String toString()
	{
		return super.toString() + " of radius " + 
				radius + " and height " + height;
	}
	
}
