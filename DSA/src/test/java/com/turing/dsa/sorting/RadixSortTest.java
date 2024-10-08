package com.turing.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RadixSortTest {

	
	@Test
	void radixSortTest()
	{
		//have to doing for negative case
		int[] arr = new int [] {51,2,32,43,9,3,1};

		RadixSort algo = new RadixSort();
		int element = algo.max(arr);
		assertEquals(51, element);
		
		element = algo.digitLength(arr);
		assertEquals(2, element);
		
		algo.sort(arr);
		assertEquals(true, Util.isSorted(arr));
		
	}
	
	
}
