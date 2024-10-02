//Name: Aromal M S
//Experiment No:4
//Date:04/10/2023
//Batch: CS B
//Roll no:15
import java.util.Scanner;
public class Frequency 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	String str=new String();
	Scanner b=new Scanner(System.in);
	int i=0,count=0;
	char c;
	System.out.println("Enter the string");
	str=b.nextLine();
	System.out.println("Enter the character");
	c=b.next().charAt(0);
	for(i=0; i<str.length();i++)
	{
		if(c==str.charAt(i))
		{
			count++;
		}
	}
	System.out.println("Frequency of " +c +" is " +count );	
	}


}
