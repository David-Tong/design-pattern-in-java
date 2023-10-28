package bps;

import java.util.List;

public class Sorter {
	private SortingStrategy strategy;
	
	public Sorter(SortingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public List<Integer> sort(List<Integer> data) {
		return strategy.sort(data);
	}

}
