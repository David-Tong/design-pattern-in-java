package cpp;

import java.util.HashMap;
import java.util.Map;

public class TennisRacketPrototypeManager {
	private static Map<String, RacketPrototype> racketMap = new HashMap<String, RacketPrototype>();
	
	public static RacketPrototype getClonedRacket(String model) {
		RacketPrototype r = racketMap.get(model);
		return r.clone();
	}
	
	public static void buildPrototypes() {
		WilsonTennisRacket wtr = new WilsonTennisRacket("Wilson", "Pro Staff", 320.0, 32.5);
		racketMap.put("pro staff", wtr);
		HeadTennisRacket htr = new HeadTennisRacket("Head", "Graphene 360 Speed", 320.0, 32.5);
		racketMap.put("graphene 360", htr);
	}
}
