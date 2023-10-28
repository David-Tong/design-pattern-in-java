package bpo;

public class Reader implements Observer {
	private String name;
	
	public Reader(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(String.format("Notification to %s : %s", name, message));
	}

}
