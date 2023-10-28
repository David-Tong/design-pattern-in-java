package bpm;

import java.util.Stack;

public class CalculatorHistory {
	private Stack<CalculatorMemento> history = new Stack<CalculatorMemento>();
	
	public void save(Calculator calculator) {
		history.add(calculator.createMemento());
	}
	
	public void undo(Calculator calculator) {
		if (!history.isEmpty()) {
			calculator.restore(history.pop());
		}
	}

}
