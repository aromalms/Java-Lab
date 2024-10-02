//Name: Aromal M S
//Experiment No:6
//Date:11/10/2023
//Batch: CS B
//Roll no:15
import java.util.Scanner;
class Add
{
	int getTotal(int a,int b)
	{
		int c=a+b;
		return(c);
	}
}
public class Sum 
	{
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			Add d=new Add();
			System.out.println("Enter two numbers");
			int a=s.nextInt();
			int b=s.nextInt();
			int e=d.getTotal(a,b);
			System.out.println("Sum= "+e);
		}
	}

