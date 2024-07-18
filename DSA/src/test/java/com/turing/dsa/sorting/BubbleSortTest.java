package com.turing.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {
	
	@Test
	public void bubbleTest() {
	//	int arr [] = Util.getRandomArray(5, 100);
		int arr[] = new int [] {2,43,44,31,12,0};
		Util.print("Array",arr);
		
		Sortable algo = new BubbleSort();
		algo.sort(arr);
		
		Util.print("Sorted", arr);
		
		assertTrue(Util.isSorted(arr));
	}

}
