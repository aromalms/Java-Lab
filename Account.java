import java.util.Scanner;
public class Account {
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		int choice;
		int n;
		System.out.println("Enter the number of customers");
		n=sc.nextInt();
		Customer 
		
		do
		{	System.out.println("Enter the Choice:");
			System.out.println("1.To Open Account");
			System.out.println("1.To Open Account");
			System.out.println("2.Show Account");
			System.out.println("3.Search Account");
			System.out.println("4.Deposit Account");
			System.out.println("5.Withdraw Account");
		    switch(choice)
		    {
		    case 1:
		    	OpenAccount();
		    	break;
		    case 2:
		    	//ShowAccount();
		    	break;
		    case 3:
		    	//SearchAccount();
		    	break;
		    case 4:
		    	//DepositAccount();
		    	break;
		    case 5:
		    	//WithdrawAccount();
		    	break;
		    	
		    default:
		    	System.out.println("Invalid Choice");
		    }
		}while(choice!=5);
		
	}
	
	
	static void OpenAccont()
	{
		int flag=0;
		System.out.println("1.To Open Ac");
	}


}
