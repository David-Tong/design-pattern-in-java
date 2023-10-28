package bpm;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		CalculatorHistory history = new CalculatorHistory();
		
		calculator.add(5);
		calculator.substract(3);
		history.save(calculator);
		System.out.println("Result: " + calculator.getResult());
		
		calculator.add(8);
		System.out.println("Result: " + calculator.getResult());
		
		history.undo(calculator);
		System.out.println("Result: " + calculator.getResult());
	}

}
