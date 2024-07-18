package com.turing.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InsertionSortTest {

	@Test
	public void InsertSort() {
		Sortable algo = new InsertionSort();
		int arr [] = new int [] {56,28,23,65,32};
		Util.print("Array", arr);
		algo.sort(arr);
		Util.print("Sorted", arr);
		
		assertEquals(true,Util.isSorted(arr));
		
		
	}

}
