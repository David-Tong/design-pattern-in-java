package bpm;

public class Button extends Component {
	public void click() {
		System.out.println("Button clicked");
		changed("clicked");
	}
}
