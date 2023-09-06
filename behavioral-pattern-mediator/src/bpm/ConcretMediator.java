package bpm;

public class ConcretMediator implements Mediator {
	
	private Button button;
	private TextBox textBox;
	private Label label;
	
	public ConcretMediator(Button button, TextBox textBox, Label label) {
		this.button = button;
		this.textBox = textBox;
		this.label = label;
		button.setMediator(this);
		textBox.setMediator(this);
		label.setMediator(this);
	}

	@Override
	public void notify(Component sender, String event) {
		if (sender == button && event.equals("clicked")) {
			textBox.clear();
			label.show("Button was clicked");
		}
	}

}
