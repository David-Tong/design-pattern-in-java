package bpcor;

public class Dollar10Dispenser implements DispenseChain {
	
	private DispenseChain nextChain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 10) {
			int numbers = currency.getAmount() / 10;
			int remainders = currency.getAmount() % 10;
			System.out.println("Dispensing " + numbers + " $10 bank notes");
			if (remainders > 0) {
				nextChain.dispense(new Currency(remainders));
			}		
		} else {
			nextChain.dispense(currency);
		}
	}

}
