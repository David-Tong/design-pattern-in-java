package spd;

public class WeChatDecorator extends NotifierDecorator {

	public WeChatDecorator(Notifier notifier) {
		super(notifier);
	}
	
	@Override
	public void send(String message) {
		super.send(message);
		System.out.println("Sending WeChat message: " + message);
	}

}
