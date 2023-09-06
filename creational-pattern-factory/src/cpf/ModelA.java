package cpf;

public class ModelA implements Car {

	@Override
	public Boolean startEngine() {
		System.out.println("modelA startEngine");
		return true;
	}

	@Override
	public void turnOffEngine() {
		System.out.println("modelA turnOffEngine");
	}

}
