package sorting;

public class MedianSort implements Sort {

	@Override
	public <T extends Comparable<T>> void sort(T[] items) {
		if(items != null && items.length > 1) {
			medianSort(items, 0, items.length - 1);
		}
	}

	public <T extends Comparable<T>> void medianSort(T[] items, int left, int right) {
		if (left < right) {
			
		}
	}
}
