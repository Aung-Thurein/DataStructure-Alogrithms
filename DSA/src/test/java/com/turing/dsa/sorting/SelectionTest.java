package com.turing.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class SelectionTest {
	

	@Test
	void SelectionSortTest() {
		assertEquals(true, Util.isSorted(new int[] { 1, 2, 3, 4, 5, 6 }));
		
		SelectionSort algo = new SelectionSort();
		int[] arr = Util.getRandomArray(10, 100);
		Util.print("Arr", arr);

		algo.sort(arr);
		Util.print("Sorted", arr);

		assertTrue(Util.isSorted(arr));
	}

	 
	


	
}
