//Name: Aromal M S
//Experiment No:4
//Date:04/10/2023
//Batch: CS B
//Roll no:15
import java.util.Scanner;

public class matrixmult 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int m=50,n=50,r=50,s=50,i,j,k;
		int a[][]=new int [m][n];
		int b[][]=new int [m][n];
		int c[][]=new int [m][n];
		Scanner d= new Scanner(System.in);
		System.out.println("Enter the number of rows of first matrix");
		m=d.nextInt();
		System.out.println("Enter the number of columns of first matrix");
		n=d.nextInt();
		System.out.println("Enter the number of rows of second matrix");
		r=d.nextInt();
		System.out.println("Enter the number of columns of second matrix");
		s=d.nextInt();
		if(n!=r)
		{
			System.out.println("Matrices cannot be multiplied");
		}
		else
		System.out.println("Enter the elements of first matrix");
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				a[i][j]=d.nextInt();
		    }
		}
		System.out.println("Enter the elements of second matrix");
		for(i=0; i<r; i++)
		{
			for(j=0; j<s; j++)
			{
				b[i][j]=d.nextInt();
			}
		}
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				c[i][j]=0;
				for(k=0; k<m; k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Product of two matrices is");
		for(i=0; i<m; i++)
		{   
			for(j=0; j<n; j++)
			{
				System.out.print(""+ c[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
			
		}
		}

}
