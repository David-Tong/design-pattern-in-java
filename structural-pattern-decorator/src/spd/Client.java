package spd;

public class Client {
	public static void main(String[] args) {
		String message = "Hello, this is a notification";
		
		Notifier notifier = new EmailNotifier();
		notifier = new WeChatDecorator(notifier);
		notifier = new MobileDecorator(notifier);
		notifier.send(message);
	}
}
