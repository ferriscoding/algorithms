package sorting;

import java.util.List;

/**
 * Insertion Sort
 * Best: O(n)
 * Average: O(n^2)
 * Worst: O(n^2)
 * @author ferris
 *
 */
public class InsertionSort implements Sort {

	
	
	private <T extends Comparable<T>> void insert(T[] items, int pos, T obj) {
		int i = pos - 1;
		
		while (i >= 0 && items[i].compareTo(obj) > 0) {
			items[i + 1] = items[i];
			i = i - 1;
		}
		items[i + 1] = obj;
	}

	@Override
	public <T extends Comparable<T>> void sort(T[] items) {
		if(items != null && items.length > 1) {
			for(int i = 0; i < items.length; i++) {
				insert(items, i, items[i]);
			}
		}
		
	}

}
