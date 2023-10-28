package bpm;

public class Calculator {
	
	private int result;
	
	public Calculator() {
		this.result = 0;
	}
	
	public void add(int operand) {
		result += operand;
	}
	
	public void substract(int operand) {
		result -= operand;
	}
	
	public int getResult() {
		return result;
	}
	
	public CalculatorMemento createMemento() {
		return new CalculatorMemento(result);
	}
	
	public void restore(CalculatorMemento mememto) {
		result = mememto.getState();
	}

}
