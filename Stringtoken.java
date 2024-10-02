import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtoken {

	public static void main(String[] args) 
	
	{	
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("Enter the integer with a space");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
		String a;
		while(st.hasMoreTokens())
		{
			 a=st.nextToken();
			n=Integer.parseInt(a);
			sum=sum+n;
		}
		System.out.println("Sum is "+sum);
		sc.close();
	}
	
}

