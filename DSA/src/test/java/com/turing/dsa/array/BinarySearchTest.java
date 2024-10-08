package com.turing.dsa.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	
	@Test
	public void BinarySearchTestBestCase() {
		int [] items = new int [] {1,2,3,4,5,6};
		Searchable arr = new BinarySearch(items);
		int index = arr.finditem(1);
		assertEquals(0, index);
	}		
	
	@Test
	public void BinarySearchTestAverage() {
		int [] items = new int [] {1,2,3,4,5,6};
		Searchable arr = new BinarySearch(items);
		int index = arr.finditem(4);
		assertEquals(3, index);
	}
	
	@Test
	public void BinarySearchTestWorstCase() {
		int [] items = new int [] {1,2,3,4,5,6};
		Searchable arr = new BinarySearch(items);
		int index = arr.finditem(7);
		assertEquals(-1, index);
	}
	
	@Test
	public void BinarySearchWorstCaseLeft() {
		int [] items = new int [] {1,2,3,4,5,6};
		Searchable arr = new BinarySearch(items);
		int index = arr.finditem(-1);
		assertEquals(-1, index);
		
	}
}
	


