import java.util.Scanner;
public class ExceptDemo 
{

	public static void main(String[] args) 
	{	
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{	
			System.out.println("Select Choice");
			System.out.println("1.Arithmetic Operation");
			System.out.println("2.Array Operation");
			System.out.println("3.Exit");
			choice=sc.nextInt();
		    switch(choice)
		    {
		    case 1:
		    	Arithmeticexception();
		    	break;
		    case 2:
		    	ArrayIndexexception();
		    	break;
		    case 3:
		    	System.out.println("Successfully Exited");
		    default:
		    	System.out.println("Invalid Choice");
		    }
		}while(choice!=3);
	}

static void Arithmeticexception() throws ArithmeticException
{
	
	try
	{
	int a,b,c;
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the Value of a");
	a=ob.nextInt();
	System.out.println("Enter the Value of b");
	b=ob.nextInt();
	c=a/b;
	System.out.println("Result of a/b is "+c);
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception Caught"+" "+e);
	}
	
	finally
	{
		System.out.println("Finally block executed\n");
	}
}

static void ArrayIndexexception() throws ArrayIndexOutOfBoundsException
{
	try
	{	
		int size;
		int value;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		size=ab.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			arr[i]=ab.nextInt();
		}
		System.out.println("Enter the value of Index");
		value=ab.nextInt();
		System.out.println("Element at Index "+value +" is"+" "+arr[value]);
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Index Out Of Bounds Exception Caught"+" "+e);
	}
	
	finally
	{
		System.out.println("Finally block executed\n");
	}
}
}


