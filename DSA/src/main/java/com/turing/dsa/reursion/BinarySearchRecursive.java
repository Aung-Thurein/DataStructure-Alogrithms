package com.turing.dsa.reursion;

import com.turing.dsa.array.Array;
import com.turing.dsa.array.Searchable;

public class BinarySearchRecursive extends Array implements Searchable{
	
	public BinarySearchRecursive (int []items) {
		super(items);
	}
	
	@Override
	public int finditem(int value) 
	{
		return finditem(value, 0, items.length-1);
	}
	
	
	public int finditem(int value, int first, int last)	
	{
		int middle = (first+last) / 2;
		
		if(first <= last)
		{
			if(this.items[middle] == value)
			{
				return middle;
			}
			else if(this.items[middle] < value)
			{
				return finditem(value, middle + 1, last);
			}
			else
			{
				return finditem(value, first , middle - 1);
			}
		}
		else {	
			return -1;
			
		}

 	}
	
	
	
	}

