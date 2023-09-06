package spb;

public class Main {

	public static void main(String[] args) {
		Device tv = new TV();
		Device dvdPlayer = new DvdPlayer();
		
		RemoteControl basicRemoteControl = new BasicRemoteControl(tv);
		basicRemoteControl.powerOn();
		basicRemoteControl.powerOff();
		basicRemoteControl.volumeUp();
		basicRemoteControl.volumeDown();
		
		RemoteControl advancedRemoteControl = new AdvancedRemoteControl(dvdPlayer);
		advancedRemoteControl.powerOn();
		advancedRemoteControl.powerOff();
		advancedRemoteControl.volumeUp();
		advancedRemoteControl.volumeDown();
		
		basicRemoteControl = new BasicRemoteControl(dvdPlayer);
		basicRemoteControl.powerOn();
		basicRemoteControl.powerOff();
		basicRemoteControl.volumeUp();
		basicRemoteControl.volumeDown();
	}

}
