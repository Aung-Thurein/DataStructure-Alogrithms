package com.turing.dsa.adt.HashTable;

import com.turing.dsa.adt.HashTable.LinkedList.LinkedListImpl;

public class HashTable {
	
	LinkedListImpl<Integer>table[];

	public HashTable()
	{
		this.table = new LinkedListImpl[10];
		
		for (int i = 0; i < 10; i++) {
		 table[i] = new LinkedListImpl<Integer>();	
		
		}
	}
	
	public void insert(int number)
	{
		int index = this.hash(number);
		
		this.table[index].insertFirst(number);
	}
	
	public boolean isItemExist(int number)
	{
		int index = this.hash(number);
		
		return this.table[index].isItemExists(number);
	}

	public int hash(int value)
	{
		int hash = value % 10;
		
		return hash;
	}
	

}




