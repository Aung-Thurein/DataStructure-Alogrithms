package com.turing.dsa.adt.heap;

import com.turing.dsa.sorting.Sortable;

public class HeapSort implements Sortable {
	
	public void heapify(int[] arr, int n, int index)
	{
		int largest = index;
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		
		if(left < n && arr[index] < arr[left])
		{
			largest = left;
	
		}
		if(right < n && arr[largest] < arr[right])
		{
			largest = right;
			
		}
		
		if(largest !=  index)
		{
			//swap
			int temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
			
			this.heapify(arr, n, largest);
		}
	}

	@Override
	public void sort(int[] arr) {
		int n = arr.length;
	
		for (int i = n/2 -1; i >= 0; i--) {
			
			this.heapify(arr, n, i);
		}
		
		for (int i = n-1 ; i >= 0; i--) {
			
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			this.heapify(arr, i, 0);
		}
		
	}

}
