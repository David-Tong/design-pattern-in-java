package bpo;

public class NewsletterMain {

	public static void main(String[] args) {
		NewsletterPublisher publisher = new NewsletterPublisher();
		
		Reader alice = new Reader("Alice");
		Reader bob = new Reader("Bob");
		Reader charlie = new Reader("Charlie");
		
		publisher.registerObserver(alice);
		publisher.registerObserver(bob);
		publisher.publish("New edition of the newsletter is out!");
		
		publisher.registerObserver(charlie);
		publisher.removeObserver(alice);
		publisher.publish("Another edition of the newsletter is here!");
	}

}
