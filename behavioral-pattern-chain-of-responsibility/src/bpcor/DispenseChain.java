package bpcor;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency currency);
}
