package bpo;

import java.util.ArrayList;
import java.util.List;

public class NewsletterPublisher implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private String latestNewsletter;
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void publish(String newsletter) {
		latestNewsletter = newsletter;
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(latestNewsletter);
		}
	}

}
