package bpi;

public class ArithmeticInterpreter {

	public static void main(String[] args) {
		
		Context context = new Context();
		context.set("x", 5);
		context.set("y", 7);
		
		VariableExpression x = new VariableExpression("x");
		VariableExpression y = new VariableExpression("y");
		AddExpression sum = new AddExpression(x, y);
		
		int result = sum.interpret(context);
		System.out.println("x + y = " + result);
	}

}
