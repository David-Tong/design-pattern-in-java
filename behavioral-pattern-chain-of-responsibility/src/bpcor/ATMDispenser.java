package bpcor;

public class ATMDispenser {
	
	private DispenseChain c1;
	
	public ATMDispenser() {
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();
		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
	
	public void dispenseMoney(Currency currency) {
		if (currency.getAmount() % 10 != 0) {
			System.out.println("Amount should be in multiple of 10.");
			return;
		}
		
		c1.dispense(currency);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMDispenser atm = new ATMDispenser();
		Currency currency = new Currency(370);
		atm.dispenseMoney(currency);
	}

}
