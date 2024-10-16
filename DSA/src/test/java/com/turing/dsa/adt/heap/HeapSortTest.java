package com.turing.dsa.adt.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.turing.dsa.sorting.Util;

public class HeapSortTest {
	
	HeapSort algo = new HeapSort();
	@Test
	public void HeapSortBaseCase()
	{
		int arr [] = new int [] {8,3};
		Util.print("Array", arr);
		algo.sort(arr);
		Util.print("Sorted", arr);
		
		assertEquals(true,Util.isSorted(arr));

	}
	
	@Test
	public void HeapSortBaseCaseAnotherWord()
	{
		int arr [] = new int [] {3,8};
		Util.print("Array", arr);
		algo.sort(arr);
		Util.print("Sorted", arr);
		
		assertEquals(true,Util.isSorted(arr));

	}
	@Test
	public void HeapSortManyCase()
	{
		int arr [] = new int [] {51,2,32,43,9,3,1};
		Util.print("Array", arr);
		algo.sort(arr);
		Util.print("Sorted", arr);
		
		assertEquals(true,Util.isSorted(arr));

	}

}
