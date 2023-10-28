package bps;

public class RedLightState implements TrafficLightState {

	@Override
	public void handle(TrafficLight trafficLight) {
		System.out.println("Red Light: Stopped");
		trafficLight.setState(new GreenLightState());
	}

}
