package bpm;

public interface Mediator {
	void notify(Component sender, String event);
}
