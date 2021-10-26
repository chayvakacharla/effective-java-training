package bankdemo;
import java.util.Scanner;


public class bankmain {
	public static void main(String[] args)
	{
		Bank b1 = new Bank();
		
		
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n1:Create Account\n 2:Deposit Amount\n 3:Withdraw Amount\n 4:Credit Interest\n 5:balance check\n");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				b1.Create_Account();
				break;
			
			case 2:
				b1.Deposit();
				break;
				
			case 3:
				b1.Withdraw();
				break;
			
			case 4:
				b1.Credit_Interest();
				break;
				
			case 5:
				b1.getBalance();
				break;
			case 6:
				break;
			}
		}
		while(ch!=6);
		
		
	}
		
	
}


