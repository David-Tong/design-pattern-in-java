package bpi;

public class AddExpression implements Expression {
	
	private Expression expression;
	private Expression expression2;
	
	public AddExpression(Expression expression, Expression expression2) {
		this.expression = expression;
		this.expression2 = expression2;
	}

	@Override
	public int interpret(Context context) {
		return expression.interpret(context) + expression2.interpret(context);
	}

}
