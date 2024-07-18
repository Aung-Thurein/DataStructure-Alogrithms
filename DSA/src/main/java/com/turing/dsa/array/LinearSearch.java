package com.turing.dsa.array;

import java.util.Iterator;

public class LinearSearch extends Array implements Searchable {

	
	public LinearSearch(int[] item) {
		super(item);

	}

	@Override
	public int finditem(int item) {
		int length = this.items.length -1;
		for (int i = 0; i <= length; i++) 
		{	if(this.items[i] == item){
			return i;
		}
		}
		return -1;
	}


}
