package sorting;

import java.util.List;

public interface Sort {

	public <T extends Comparable<T>> void sort(T[] items);
}
