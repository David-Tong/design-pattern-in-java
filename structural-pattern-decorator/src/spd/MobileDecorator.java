package spd;

public class MobileDecorator extends NotifierDecorator {

	public MobileDecorator(Notifier notifier) {
		super(notifier);
	}
	
	@Override
	public void send(String message) {
		super.send(message);
		System.out.println("Sending Mobile message: " + message);
	}

}
