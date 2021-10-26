package bankdemo;
import java.util.Scanner;

public class Bank {
	private int Account_Number;
	private String Name;
	private String Password;
	
	private long Balance;
	private int Interest_Rate;
	Scanner scan=new Scanner(System.in);
	public void Create_Account()
	{
		
		System.out.println("Enter the Bank Account Number :");
		Account_Number=scan.nextInt();
		System.out.println("Enter the Name of the Person :");
		Name=scan.next();
		System.out.println("Enter the Password :");
		Password=scan.next();
		System.out.println("Enter the balance :");
		Balance=scan.nextLong();
		System.out.println("Enter the Interest Rate");
		Interest_Rate=scan.nextInt();
		
	}
		
	public void Deposit()
	{
		System.out.println("Enter the amount to be deposit :");
		long Amount=scan.nextLong();
		Balance=Balance+Amount;
		System.out.println("Successfully deposited " +(Balance+Amount)+" rupees");
		
	}
	
	public void Withdraw()
	{
		
		String psw;
		
		System.out.println("Enter the password :");
		psw=scan.next();
		if(Password.equals(psw))
		{
			System.out.println("Enter the amount to be withdraw :");
			long Amount=scan.nextLong();
			if(Amount<=0)
			{
				System.out.println("Should not withdraw amount.Please withdraw some other Amount!!!");
			}
			else if(Amount>Balance)
			{
				System.out.println("Less Balance..Please withdraw some other Amount!!!");
			}
			else 
			{
				System.out.println("Successfully withdraw!! Available balance is " +(Balance-Amount)+" rupees");
			}
			
		}
		else
		{
			System.out.println("Invalid Password!!!!");
		}
		
		
	}
	public void Credit_Interest()
	{
		Balance=(Balance*Interest_Rate/1200);
		System.out.println("Credited Interest is :"+Balance);
	
	}
	public void getBalance() {
		String psw1;
		
		System.out.println("Enter the password :");
		psw1=scan.next();
		if(Password.equals(psw1))
		{
		System.out.println(Balance);
		}
		else
		{
			System.out.println("Invalid Password!!!!");
		}
		
		
		
		
	}

	

}
