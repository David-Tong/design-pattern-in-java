package spb;

public class AdvancedRemoteControl extends RemoteControl {

	public AdvancedRemoteControl(Device device) {
		super(device);
	}

	@Override
	public void powerOn() {
		System.out.print("Advanced Remote : power on -> ");
		device.powerOn();
	}

	@Override
	public void powerOff() {
		System.out.print("Advanced Remote : power off -> ");
		device.powerOff();
	}

	@Override
	public void volumeUp() {
		device.setVolume(device.getVolume() + 5);
	}

	@Override
	public void volumeDown() {
		device.setVolume(device.getVolume() - 5);
	}

}
