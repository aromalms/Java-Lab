import java.util.Scanner;
class InvalidAmountException extends Exception
{
	InvalidAmountException(String str)
	{
		super(str);
	}
}

class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String str)
	{
		super(str);
	}
}

class Account
{
	int account_number;
	String customer_name;
	int account_balance;
	Scanner sc=new Scanner(System.in);
	public void setCustomerDetails()
	{
		System.out.println("Enter Account Number");
		account_number=sc.nextInt();
		System.out.println("Enter Customer Name");
		customer_name=sc.next();
		System.out.println("Enter Account Balance");
		account_balance=sc.nextInt();
	}
	public void getCustomerDetails()
	{
		System.out.println("Account Number: "+account_number);
		System.out.println("Enter Account Number"+customer_name);
		System.out.println("Enter Account Number"+account_balance);
	}
}


public class Custom_Exception {

	public static void main(String[] args) 
	{
		InvalidAmountException amountException=new InvalidAmountException("Invaid Amount");
		InsufficientFundsException fundsException=new InsufficientFundsException("Insufficient Funds");
		Scanner ob=new Scanner(System.in);
		int choice;
		System.out.println("Enter number of Customers");
		int n=ob.nextInt();
		Account[] account=new Account[n];
		
		for(int i=0; i<n;i++)
		{
			account[i]=new Account();
			account[i].setCustomerDetails();
		}
		
		do {
			System.out.println("1.Display Account Details");
			System.out.println("2.Search by Account Number");
			System.out.println("3.Deposit the amount");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit");
			System.out.println("Enter your Choice");
			choice=ob.nextInt();
			
			switch(choice)
			{
			case 1:
				for(int i=0;i<n; i++)
				{
					account[i].getCustomerDetails();
				}
				break;
			case 2:
				System.out.println("Enter the Account Number");
				int searchAccount=ob.nextInt();
				try
				{
					System.out.println("Enter the Amount to Deposit");
					int depositAmount=ob.nextInt();
					if(depositAmount<0)
					{
						throw amountException;
						
					}
					else
					{
						for(int i=0; i<n;i++)
							
					}
				}
			}
		}

	}


