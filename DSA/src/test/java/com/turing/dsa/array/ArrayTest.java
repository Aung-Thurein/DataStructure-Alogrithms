package com.turing.dsa.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayTest {
	
	@Test
	public void TestLinearSearch()
	{	int items [] = new int[] {1,2,3,4,5,6};
		Searchable arr = new LinearSearch(items);
		int index = arr.finditem(1);
		assertEquals(0, index);
		
		
	}
	
	@Test
	public void TestLinearSearchAverage()
	{
		int items [] = new int [] {1,2,3,4,5,6};
		Searchable arr = new LinearSearch(items);
		int index = arr.finditem(4);
		assertEquals(3, index);
	}
	
	@Test
	public void TestLinearSearchWorstCase()
	{
		int items [] = new int[] {1,2,3,4,5,6};
		Searchable arr = new LinearSearch (items);
		int index = arr.finditem(6);
		assertEquals(5, index);
	}
	@Test
	public void TestSortedLinearSearch() {
		int items[] = new int [] {1,2,3,4,5,6};
		Searchable arr = new SortedLinearSearch(items);
		int index = arr.finditem(1);
		assertEquals(0, index);
	}
	@Test
	public void TestSortedLinearSearchAverage() {
		int items [] = new int [] {1,2,3,4,5,6};
		Searchable arr = new SortedLinearSearch(items);
		int index = arr.finditem(4);
		assertEquals(3, index);
	}
	
	@Test
	public void TestSortedLinearSearchWorstCase() {
		int items [] = new int [] {1,2,3,4,5,6};
		Searchable arr = new SortedLinearSearch(items);
		int index = arr.finditem(-4);
		assertEquals(-1, index);
	}
		
	
	@Test
	public void Test()
	{	Array arr = new Array(5);
		arr.put(1,100);
		arr.put(2, 60);
		arr.put(3, 90);
		arr.put(4, 23);
	
			
		
		
	}
}
