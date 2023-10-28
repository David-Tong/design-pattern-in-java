package bps;

import java.util.List;

public class BubbleSort implements SortingStrategy {

	@Override
	public List<Integer> sort(List<Integer> data) {
		for (int i=0; i<data.size(); i++) {
			for (int j=data.size() - 1; j > i; j--) {
				if (data.get(j) < data.get(j - 1)) {
					int tmp = data.get(j);
					data.set(j, data.get(j - 1));
					data.set(j - 1, tmp);
				}
			}
		}	
		return data;
	}

}
