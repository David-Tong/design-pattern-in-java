package bpm;

public abstract class Component {
	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void changed(String event) {
		mediator.notify(this, event);
	}
}
