package bpi;

public class VariableExpression implements Expression {
	
	private String key;
	
	public VariableExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpret(Context context) {
		return context.get(key);
	}

}
