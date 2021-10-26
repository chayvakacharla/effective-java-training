package bankstructure;

import java.util.Scanner;



public class bankapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password="p@ss";
		BankAccount b1=new BankAccount(222, "Vivek",password, 50000, 12);
		
		

		
		
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n1:check your balance \n 2:profile \n 3:deposit\n 4:withdraw\n 5:credit intrest\n  ");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				b1.getBalance();
				break;
			
			case 3:
				b1.deposit();
				break;
				
			case 4:
				b1.withdraw();
				break;
			
			case 5:
				b1.creditInterest();
				break;
				
			case 2:
				b1.show();
				break;
			case 6:
				break;
			}
		}
		while(ch!=6);
		
		
	}
		
	
}
		
		
		