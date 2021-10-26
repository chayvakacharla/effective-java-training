package Bankdemo;

public class bankmain {

	public static void main(String[] args) {
		Account cust1=new Account();
		Account cust2=new Account();
		cust1.deposit(500);
		cust2.deposit(100);
		System.out.println(cust1.getbalance());
		System.out.println(cust2.getbalance());
        cust1.withdraw(800);
        System.out.println(cust1.getbalance());
	}

}
