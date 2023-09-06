package cpaf;

public class TeslaFactory implements CarFactory {

	@Override
	public Sedan createSedan() {
		return new TeslaModelS();
	}

	@Override
	public SUV createSUV() {
		return new TeslaModelY();
	}

}
