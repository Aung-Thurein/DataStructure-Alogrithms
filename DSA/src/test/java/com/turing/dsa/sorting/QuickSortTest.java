package com.turing.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuickSortTest {

	@Test
	public void QuickSortBaseCase()
	{
		Sortable algo = new QuickSortV1();
		int arr [] = new int [] {8,3};
		Util.print("Array", arr);
		algo.sort(arr);
		Util.print("Sorted", arr);
		
		assertEquals(true,Util.isSorted(arr));

	}
	
	@Test
	public void QuickSortBaseCaseAnotherWord()
	{
		Sortable algo = new QuickSortV1();
		int arr [] = new int [] {8,3,1};
		Util.print("Array", arr);
		algo.sort(arr);
		Util.print("Sorted", arr);
		
		assertEquals(true,Util.isSorted(arr));

	}
	@Test
	public void QuickSortManyCase()
	{
		Sortable algo = new QuickSortV1();
		int arr [] = new int [] {51,2,32,43,9,3,1};
		Util.print("Array", arr);
		algo.sort(arr);
		Util.print("Sorted", arr);
		
		assertEquals(true,Util.isSorted(arr));

	}
	
}
