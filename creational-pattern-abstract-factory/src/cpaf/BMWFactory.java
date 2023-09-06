package cpaf;

public class BMWFactory implements CarFactory {

	@Override
	public Sedan createSedan() {
		return new BMWM5();
	}

	@Override
	public SUV createSUV() {
		return new BMWX5();
	}

}
