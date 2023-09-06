package cpf;

public class ModelAFactory implements CarFactory {

	@Override
	public Car makeCar() {
		Car modelA = new ModelA();
		if (modelA.startEngine() == true) {
			modelA.turnOffEngine();
			return modelA;
		}
		return null;
	}

}
