package spb;

public class TV implements Device {
	
	private int volume = 50;

	@Override
	public void powerOn() {
		System.out.println("TV is on");
	}

	@Override
	public void powerOff() {
		System.out.println("TV is off");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		} else if (volume < 0) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}
		System.out.println("TV volume set to " + this.volume);
	}

	@Override
	public int getVolume() {
		return volume;
	}

}
