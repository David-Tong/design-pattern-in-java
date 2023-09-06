package cpf;

public class TuringStorage {
	
	Car[] carStorage = new Car[10];
	
	public void importCars() {
		ModelAFactory factoryA = new ModelAFactory();
		ModelBFactory factoryB = new ModelBFactory();
		
		for (int i = 0; i < 5; i++) {
			carStorage[i] = factoryA.makeCar();
		}
		
		for (int i = 5; i < 10; i++) {
			carStorage[i] = factoryB.makeCar();
		}
	}

	public static void main(String[] args) {
		TuringStorage storage = new TuringStorage();
		storage.importCars();
	}

}
