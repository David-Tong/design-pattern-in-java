package cpf;

public class ModelB implements Car {
	
	@Override
	public Boolean startEngine() {
		System.out.println("modelB startEngine");
		return true;
	}

	@Override
	public void turnOffEngine() {
		System.out.println("modelB turnOffEngine");
	}
}
