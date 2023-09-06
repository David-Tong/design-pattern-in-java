package spf;

import java.util.HashMap;
import java.util.Map;

public class SoldierFlyweightFactory {
	private Map<String, SoldierType> soldierTypeMap = new HashMap<String, SoldierType>();
	
	public SoldierType getSoldierType(String type, String weapon, String armor) {
		if (!soldierTypeMap.containsKey(type)) {
			soldierTypeMap.put(type, new SoldierType(type, weapon, armor));
		}
		return soldierTypeMap.get(type);
	}
}
