//Name: Aromal M S
//Experiment No:6
//Date:04/10/2023
//Batch: CS B
//Roll no:15
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str=new String();
		String rev=new String();
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		str=s.nextLine();
		int length=str.length();
		char[] a=str.toCharArray();
		for(int i=0; i<=length/2; i++)
		{
			if(a[i]!=a[length-i-1])
		  {
			flag=1;
		  }
		}
		if(flag==1)
		{
			System.out.println("String is not palindrome");
		}
		else
			{
			System.out.println("String is palindrome");
		}

	}

}
