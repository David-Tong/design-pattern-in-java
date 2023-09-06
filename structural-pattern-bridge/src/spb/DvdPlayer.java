package spb;

public class DvdPlayer implements Device {
	
	private int volume = 50;

	@Override
	public void powerOn() {
		System.out.println("DVD player is on");
	}

	@Override
	public void powerOff() {
		System.out.println("DVD player is off");
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
		System.out.println("DVD player volume set to " + this.volume);
	}

	@Override
	public int getVolume() {
		return volume;
	}

}
