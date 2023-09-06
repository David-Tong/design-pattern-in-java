package bpm;

public class GUIMain {

	public static void main(String[] args) {
		Button button = new Button();
		TextBox textBox = new TextBox();
		Label label = new Label();
		
		new ConcretMediator(button, textBox, label);
		button.click();
	}

}
