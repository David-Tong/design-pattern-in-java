package spp;

public class Client {
	public static void main(String[] args) {
		BankAccount adminAccount = new BankAccountProxy("Admin", 1000);
		adminAccount.deposit(500);
		adminAccount.withdraw(200);
		
		BankAccount userAccount = new BankAccountProxy("User", 1000);
		userAccount.deposit(500);
		userAccount.withdraw(200);
	}
}
