package com.turing.dsa.sorting;

import java.util.ArrayList;

public class RadixSort implements Sortable {

	@Override
	public void sort(int[] arr) {
	
		int radix = digitLength(arr);
		
		for (int i = 0; i < radix; i++) {
			
			ArrayList<Integer> bucket[] = new ArrayList[10];
			
			for (int j = 0; j < 10; j++) {
				
				bucket[j] = new ArrayList<Integer>();
			}
			for(int element : arr)
			{
				int bucketIndex = bucketIndex(element, i);
				bucket[bucketIndex].add(element);
			}
			int index = 0;
			//adding
			for (int j = 0; j < 10; j++) {
				for(int element : bucket[j])
				{
					arr[index ++] = element;
				}
				
			}
		}
	}
	
	public int bucketIndex(int element, int index)
	{
		String str = String.valueOf(element);
		
		if(str.length() > index)
		{
			return Integer.valueOf(str.charAt(str.length() - 1 - index) + "");
		}
		return 0;
	
	}
	
	public int digitLength(int arr []) 
	
	{	int maxElement = this.max(arr);

		return String.valueOf(maxElement).length();	
		
	}
	
	public int max(int [] arr)
	{	
		int maxElement = arr[0];
		if(arr.length == 1)
		{
			return maxElement;
			
		}
		else
		{
			for (int i = 0; i < arr.length; i++) {
				if(arr[0] < arr[i])
				{
					maxElement = arr[i];
				}
			}
			
			return maxElement;
		}
	}
}
