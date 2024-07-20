package com.turing.dsa.recursion;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.turing.dsa.reursion.MergeSort;
import com.turing.dsa.sorting.Sortable;
import com.turing.dsa.sorting.Util;

public class MergeSortTest {
	@Test
	public void mergeSortBaseCase()
	{
		Sortable mergeSort = new MergeSort();
		int[] arr = new int[] {8,2};
		mergeSort.sort(arr);
		
		assertTrue(Util.isSorted(arr));
		
	}
	@Test
	public void mergeSortManyCase()
	{
		Sortable mergeSort = new MergeSort();
		int[] arr = new int[] {4,3,23,2,12,231,31};
		mergeSort.sort(arr);

		assertTrue(Util.isSorted(arr));
	}
	
	@Test
	public void mergeSortRandom()
	{
		Sortable mergeSort = new MergeSort();
		int[] arr = Util.getRandomArray(100, 100);
		mergeSort.sort(arr);

		assertTrue(Util.isSorted(arr));
	}
	
	
}
