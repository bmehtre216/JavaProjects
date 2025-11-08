package practice;

public class BankAccount {
	
	private String accNumber;
	private String accHolderNameString;
	private double balance;
	
	public BankAccount(String accNumber, String accHolderNameString) {
		this.accNumber = accNumber;
		this.accHolderNameString = accHolderNameString;
	}
	
	public void diposit(double money) {
		if(money <= 0) {
			System.out.println("Invalid diposit");
		}else {
			balance += money;
		}
	}
	
	public double withdraw(double money) {
		if(money <= 0) {
			System.out.println("Invalid withdrawl");
		}
		else if(balance >= money) {
			balance -= money;
		}
		else{
			money = balance;
			balance = 0;
		}
		return money;
	}
}
