package sorting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sorting.InsertionSort;
import sorting.Sort;

public class InsertionSortTest extends SortingBaseTest {
	
	private Sort sort = new InsertionSort();
	
	@Before
    public void initObjects() {
		Sort sort = new InsertionSort();
    }
	
	@Test
	public void stringTest() {
		sort.sort(unsortedStrings);
		Assert.assertArrayEquals(unsortedStrings, sortedStrings);
	}
	
	@Test
	public void integerTest() {
		
		sort.sort(unsortedInts);
		Assert.assertArrayEquals(unsortedInts, sortedInts);
	}
	
	@Test 
	public void nullTest() {
		sort.sort(null);
	}

}
