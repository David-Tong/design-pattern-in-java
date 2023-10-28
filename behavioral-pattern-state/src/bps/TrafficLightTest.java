package bps;

public class TrafficLightTest {

	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight(new GreenLightState());
		
		for (int index=0; index<6; index++) {
			trafficLight.change();
		}
	}

}
