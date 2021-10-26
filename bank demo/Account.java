package Bankdemo;

public class Account {

	private double balance;
	
	//set the balance to 0.00
	public Account() {
		balance=0.0;
		}
	
	//deposit
	public void deposit(double amount) {
		balance =balance+amount;
		
	}
	//withdraw
	public void  withdraw(double amount) {
		if(amount<=balance) {
		balance=balance-amount;
	}else {
		System.err.println("money is not upto mark");}
	}
	//get balance
	public double getbalance() {
		return balance;
	}
	
	
	

}