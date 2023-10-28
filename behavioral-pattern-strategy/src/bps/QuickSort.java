package bps;

import java.util.List;

public class QuickSort implements SortingStrategy {

	@Override
	public List<Integer> sort(List<Integer> data) {
		quickSort(data, 0, data.size() - 1);
		return data;
	}
	
	private void quickSort(List<Integer> data, int low, int high) {
		if (low < high) {
			int pivot = partition(data, low, high);
			quickSort(data, low, pivot - 1);
			quickSort(data, pivot + 1, high);
		}
	}
	
	private int partition(List<Integer> data, int low, int high) {
		int pivot = low;
		
		int i = pivot + 1;
		int j = pivot + 1;
		while (j <= high) {
			if (data.get(j) <= data.get(pivot)) {
				if (i != j) {
					swap(data, i, j);
				}
				i++;	
			}
			j++;
		}
		swap(data, pivot, i - 1);		
		return i - 1;
	}
	
	private void swap(List<Integer> data, int i, int j) {
		int tmp = data.get(j);
		data.set(j, data.get(i));
		data.set(i, tmp);
	}

}
