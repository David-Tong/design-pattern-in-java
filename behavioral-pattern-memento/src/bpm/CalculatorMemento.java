package bpm;

public class CalculatorMemento {
	
	private int state;
	
	public CalculatorMemento(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}
	
}
