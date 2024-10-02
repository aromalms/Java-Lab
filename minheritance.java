class Box
{
	private double width;
	private double height;
	private double depth;
	
	Box(double w,double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	double volume()
	{
		return width*height*depth;
	}	
}



class Boxweight extends Box
{
	double weight;
	Boxweight(double  w,double h,double d,double m)	
	{
		super(w,h,d);
		weight=m;	
	}
}


class Shipment extends Boxweight
{
	double cost;
	Shipment(double  w,double h,double d,double c,double m)
	{
		super(w,h,d,m);
		cost=c;
	}
	
}

public class minheritance {

	public static void main(String[] args) 
	
	{

		Shipment ship1=new Shipment(5,10,20,4000,1000);
		double volume;
		volume=ship1.volume();
		
		System.out.println("Volume: "+volume);
		System.out.println("Weight: "+ship1.weight);
		System.out.println("Cost: "+ship1.cost);
	};
}
