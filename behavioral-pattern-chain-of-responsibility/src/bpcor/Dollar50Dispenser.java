package bpcor;

public class Dollar50Dispenser implements DispenseChain {
	
	private DispenseChain nextChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 50) {
			int numbers = currency.getAmount() / 50;
			int remainders = currency.getAmount() % 50;
			System.out.println("Dispensing " + numbers + " $50 bank notes");
			if (remainders > 0) {
				nextChain.dispense(new Currency(remainders));
			}
		} else {
			nextChain.dispense(currency);
		}
	}

}
