package bps;

public class YellowLightState implements TrafficLightState {

	@Override
	public void handle(TrafficLight trafficLight) {
		System.out.println("Yellow Light: Be prepared to stop");
		trafficLight.setState(new RedLightState());
	}

}
