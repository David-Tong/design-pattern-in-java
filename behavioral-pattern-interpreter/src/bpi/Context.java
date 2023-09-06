package bpi;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	private Map<String, Integer> map = new HashMap<String, Integer>();
	
	public int get(String key) {
		return map.get(key);
	}
	
	public void set(String key, Integer value) {
		map.put(key, value);
	}

}
