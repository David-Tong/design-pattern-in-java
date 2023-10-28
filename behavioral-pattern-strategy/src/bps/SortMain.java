package bps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortMain {

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>(Arrays.asList(5, 2, 4, 1, 3));
		Sorter sorter = new Sorter(new BubbleSort());
		List<Integer> sortedData = sorter.sort(data);
		System.out.println("BubbleSort result: " + sortedData);

		data = new ArrayList<Integer>(Arrays.asList(5, 2, 4, 1, 3));
		sorter = new Sorter(new QuickSort());
		sortedData = sorter.sort(data);
		System.out.println("QuickSort result: " + sortedData);
	}

}
