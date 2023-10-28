package bps;

public class GreenLightState implements TrafficLightState {

	@Override
	public void handle(TrafficLight trafficLight) {
		System.out.println("Green Light: Go");
		trafficLight.setState(new YellowLightState());
	}

}
