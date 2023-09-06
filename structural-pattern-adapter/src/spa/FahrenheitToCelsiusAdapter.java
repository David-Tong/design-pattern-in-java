package spa;

public class FahrenheitToCelsiusAdapter implements CelsiusTemperature {
	
	private FahrenheitTemperature fTemperature;
	
	public FahrenheitToCelsiusAdapter(FahrenheitTemperature fTemperature) {
		this.fTemperature = fTemperature;
	}

	@Override
	public double getCTemperature() {
		return (fTemperature.getTemperature() - 32) * 5 / 9;
	}

}
