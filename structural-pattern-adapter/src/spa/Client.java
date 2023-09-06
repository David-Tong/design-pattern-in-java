package spa;

public class Client {

	public static void main(String[] args) {
		FahrenheitTemperature f = new FahrenheitTemperature(100);
		FahrenheitToCelsiusAdapter adapter = new FahrenheitToCelsiusAdapter(f);
		System.out.println("The temperature is " + adapter.getCTemperature() + " degrees Celsisu.");
	}

}
