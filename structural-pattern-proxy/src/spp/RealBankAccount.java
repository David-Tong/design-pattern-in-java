package spp;

public class RealBankAccount implements BankAccount {

	private double balance;
	
	public RealBankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println(String.format("Deposited: %f, new balance: %f", amount, balance));
	}

	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(String.format("Withdrew: %f, new balance: %f", amount, balance));
		} else {
			System.out.println("Insufficient balance");
		}
	}

}
