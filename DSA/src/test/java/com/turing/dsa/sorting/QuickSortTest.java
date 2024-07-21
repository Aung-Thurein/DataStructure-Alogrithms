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
		int arr [] = new int [] {3,8};
		Util.print("Array", arr);
		algo.sort(arr);
		Util.print("Sorted", arr);
		
		assertEquals(true,Util.isSorted(arr));

	}
	@Test
	public void QuickSortManyCase()
	{
		Sortable algo = new QuickSortV1();
		int arr [] = new int [] {3,8,4,10,2,4};
		Util.print("Array", arr);
		algo.sort(arr);
		Util.print("Sorted", arr);
		
		assertEquals(true,Util.isSorted(arr));

	}
	
}
