abstract class Shape
{
 abstract void numberOfSides();
}
class Rectangle extends Shape
{
 void numberOfSides()
 {
	 System.out.println("Rectangle has 4 sides");
	 System.out.println("Sum of its angle is 360");
}
}
class Triangle extends Shape
{
 void numberOfSides()
 {
	 System.out.println("Triangle has 3 sides");
	 System.out.println("Sum of its angle is 180");
 }
}
class Hexagon extends Shape
{
 void numberOfSides()
 {
	 System.out.println("Hexagon has 6 sides");
	 System.out.println("Sum of its angle is 720");
	 }
}
public class abs2
{
 public static void main(String[] args)
 {
  Rectangle a= new Rectangle();
  a.numberOfSides();
  Triangle b =new Triangle();
  b.numberOfSides();
  Hexagon c= new Hexagon();
  c.numberOfSides();
 }
}