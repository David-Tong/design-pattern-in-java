package spp;

public class BankAccountProxy implements BankAccount {
	
	private RealBankAccount account;
	private String userRole;
	
	public BankAccountProxy(String userRole, double initialBalance) {
		this.userRole = userRole;
		this.account = new RealBankAccount(initialBalance);
	}

	@Override
	public void deposit(double amount) {
		if ("Admin".equals(userRole) || "User".equals(userRole)) {
			account.deposit(amount);
		} else {
			System.out.println("Unauthorized access");
		}
	}

	@Override
	public void withdraw(double amount) {
		if ("Admin".equals(userRole)) {
			account.withdraw(amount);
		} else {
			System.out.println("Unauthorized access");
		}

	}

}
