package multipleaccount;
import java.util.Scanner;


public class SavingsAccount {
	private int AccountNumber=1000;
	private String Password;
	 double InterestRate=2.0;
	double Balance=0;
	String Name;
	Scanner scan =new Scanner(System.in);
	
	SavingsAccount a1=new SavingsAccount();

	public void createaccount() {
		System.out.println("enter the Name");
		Name=scan.next();
		AccountNumber+=1;//can be easy while working with arrays and sets
		System.out.println("please enter your password");
		String x=scan.next();
		System.out.println("re enter your password");
		String y=scan.next();
		if (x.equals(y)) {
			Password=x;}
		else {
				System.out.println("passwords do not match");//we can use loop but i don't know when to stop
			}
		
		System.out.println("your allowted number is "+AccountNumber );
		System.out.println("which type of account you are creating ");
		int ch;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n1:savings account\n2:current account");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				if(a1.SavingsDeposit()) {
					
				int ch1;
					do {
						System.out.println("Enter your choice");
						System.out.println("\n1:details\n2:deposit\n3:withdraw\4:get balance\n5:CreditInterest");
						ch1=scan.nextInt();
						switch(ch1) {
						case 1:
							a1.show();
							break;
						case 2:
							a1.SavingsWithdraw();
							break;
						case 3:
						a1.SavingsDeposit();
						break;
						case 4:
						a1.getBalance();
						break;
						case 5:
						a1.CreditInterest();
						break;
						
						}
						
						}while(ch!=6);}
				
				
				
				break;
				
			
			case 2:	int ch1;
			do {
				System.out.println("Enter your choice");
				System.out.println("\n1:details\n2:deposit\n3:withdraw\4:get balance\n5:CreditInterest");
				ch1=scan.nextInt();
				switch(ch1) {
				case 1:
					a1.show();
					break;
				case 2:
					a1.CurrentWithdraw();
					break;
				case 3:
				a1.SavingsDeposit();
				break;
				case 4:
				a1.getBalance();
				break;
				case 5:
				System.out.println("it won't have any credit_interest");
				break;
				
				}
				
				}while(ch!=6);
				break;
				
			
			
		
			}
			
		}while(ch!=3);
		
	}
	public boolean SavingsDeposit()
	{
		System.out.println("Enter the amount to be deposit :");
		double Amount=scan.nextLong();
		if(Amount>5000) {
		Balance=Balance+Amount;
		System.out.println("Successfully deposited " +(Balance+Amount)+" rupees");
		return true;}
		
		else {
			System.out.println("this a savings account aand minimum balance should be greather than 4999");
			
		
		return false;
		}
	}
		
	
	
public void show() {
	System.out.println("account number\t"+AccountNumber);
	System.out.println("name         \t"+Name);
	System.out.println("password     \t"+Password);
	System.out.println("balance      \t"+Balance);
	System.out.println("interest rate\t"+InterestRate);
	System.out.println();}

public void SavingsWithdraw()
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
		else if(Amount>=Balance-5000)
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
public void CurrentWithdraw()
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
public void CreditInterest()
{
	Balance=(Balance*InterestRate/1200);
	System.out.println("Credited Interest is :"+Balance);

}
public void getBalance() {
	
	
	
	{
	System.out.println(Balance);
	}


}}

