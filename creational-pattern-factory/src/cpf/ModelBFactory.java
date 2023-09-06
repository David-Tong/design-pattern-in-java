package cpf;

public class ModelBFactory implements CarFactory {

	@Override
	public Car makeCar() {
		Car modelB = new ModelB();
		if (modelB.startEngine() == true) {
			modelB.turnOffEngine();
			return modelB;
		}
		return null;
	}

}
