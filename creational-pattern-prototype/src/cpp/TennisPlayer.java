package cpp;

public class TennisPlayer {
	
	public static void main(String[] args) {
		TennisRacketPrototypeManager.buildPrototypes();
		for (int i = 0; i < 10; i++) {
			TennisRacketPrototypeManager.getClonedRacket("pro staff");
		}
	}

}
