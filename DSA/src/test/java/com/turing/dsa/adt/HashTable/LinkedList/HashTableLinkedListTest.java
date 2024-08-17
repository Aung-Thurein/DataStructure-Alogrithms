package com.turing.dsa.adt.HashTable.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HashTableLinkedListTest {
	@Test
	public void test()
	{
		LinkedListImpl<Integer> linkedList = new LinkedListImpl<Integer>();
		
		linkedList.insertFirst(100);
		linkedList.insertFirst(200);
		
		assertEquals(true, linkedList.isItemExists(200));
		assertEquals(true, linkedList.isItemExists(100));
		assertEquals(false, linkedList.isItemExists(300));
	}

	
}
