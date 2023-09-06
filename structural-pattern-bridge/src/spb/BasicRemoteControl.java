package spb;

public class BasicRemoteControl extends RemoteControl {

	public BasicRemoteControl(Device device) {
		super(device);
	}

	@Override
	public void powerOn() {
		System.out.print("Basic Remote : power on -> ");
		device.powerOn();
	}

	@Override
	public void powerOff() {
		System.out.print("Basic Remote : power off -> ");
		device.powerOff();
	}

	@Override
	public void volumeUp() {
		device.setVolume(device.getVolume() + 10);
	}

	@Override
	public void volumeDown() {
		device.setVolume(device.getVolume() - 10);
	}

}
