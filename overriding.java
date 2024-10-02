class Employee1
{
	void display()
	{
		System.out.println(".......Employee.......");
	}
	void calcSalary()
	{
		System.out.println("Salary of Employee is 100000");
	}
}
class Engineer extends Employee1
{
    void calcSalary()
    {	
    	
    	System.out.println("Salary of Engineer is 20000");
    	display();
    	super.calcSalary();
    }
}
public class overriding 
	{ 
	public static void main(String[] args)
	{
		Engineer obj=new Engineer();
	    obj.calcSalary();
   }
}







