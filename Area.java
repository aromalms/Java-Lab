//Name: Aromal M S
//Experiment No:6
//Date:11/10/2023
//Batch: CS B
//Roll no:15
import java.util.Scanner;
class Overload
{
	void area(float x)
	{
		float a=x*x;
		System.out.println("Area of the Square= "+a +"sq.units");
	}
	void area(float x,float y)
	{
		float a=x*y;
		System.out.println("Area of the Rectangle= "+a +"sq.units");
	}
	void area(double x)
	{
		double a= 3.14*x*x;
		System.out.println("Area of the Circle= "+a +"sq.units");
	}
}

public class Area 
{

	public static void main(String[] args)
	{
	 Overload obj=new Overload();
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the side of square");
	 float b=s.nextFloat();
	 System.out.println("Enter the length of rectangle");
	 float c=s.nextFloat();
	 System.out.println("Enter the breadth of rectangle");
	 float d=s.nextFloat();
	 System.out.println("Enter the radius of circle");
	 double e=s.nextDouble();
	 obj.area(b);
	 obj.area(c,d);
     obj.area(e);
	}
}
