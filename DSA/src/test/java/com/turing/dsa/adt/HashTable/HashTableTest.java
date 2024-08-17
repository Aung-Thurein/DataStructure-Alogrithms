package com.turing.dsa.adt.HashTable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HashTableTest {

	@Test
	void test()
	{
		HashTable hash = new HashTable();
		hash.insert(100);
		hash.insert(200);
		hash.insert(32);
		hash.insert(54);
		
		assertEquals(true,hash.isItemExist(100));
        assertEquals(true,hash.isItemExist(200));
        assertEquals(true,hash.isItemExist(32));
        assertEquals(true,hash.isItemExist(54));
        assertEquals(false,hash.isItemExist(203));


	}
}
