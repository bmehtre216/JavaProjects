package practice;

public class AccountTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("001", "Raadhaa");
		account.diposit(100);
		System.out.println(account.withdraw(200));
		account.diposit(-40);
		account.withdraw(0);
	}

}
