package bpcor;

public class Dollar20Dispenser implements DispenseChain {
	
	private DispenseChain nextChain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 20) {
			int numbers = currency.getAmount() / 20;
			int remainders = currency.getAmount() % 20;
			System.out.println("Dispensing " + numbers + " $20 bank notes");
			if (remainders > 0) {
				nextChain.dispense(new Currency(remainders));
			}		
		} else {
			nextChain.dispense(currency);
		}
	}

}
