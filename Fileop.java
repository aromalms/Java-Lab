import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
public class Fileop 
{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		String data=new String();
		System.out.println("Enter data");
		data=sc.nextLine();
		FileWriter out;
		FileReader finp;
		FileWriter fout;
		try
		{
			out=new FileWriter("Sample.txt");
			out.write(data);
			out.flush();	
		}
		catch(IOException e)
		{
			System.out.println("An IO Exception Occured"+e);
		}
		
		try
		{
			finp=new FileReader("Sample1.txt");
			fout=new FileWriter("newSample.txt");
			int i;
			while((i=finp.read())!=-1)
			{
				fout.write(i);
			System.out.println("Data is "+ (char)i);
			}
			finp.close();
			fout.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist"+e);
		}
		
		catch(IOException e)
		{
				System.out.println("An IO Exception Occured"+e);
		}
		sc.close();
	}
}
