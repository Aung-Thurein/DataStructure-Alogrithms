package com.turing.dsa.sorting;

public class QuickSortInPlace implements Sortable{

	@Override
	public void sort(int[] arr) {
		quickSort(arr,0, arr.length-1);
	}
	
	public void quickSort(int[]arr, int startIndex, int endIndex) 
	{
		int size = endIndex - startIndex + 1;
		if(size >= 3)
		{
			
			int pivot = arr[endIndex];
			int left = startIndex;
			int right = endIndex;
			
			while(left <= right)
			{
				while(arr[left] < pivot)
				{
					left ++;
				}
				while(arr[right] > pivot)
				{
					right --;
				}
				if(left <= right)
				{
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}
				
			}
			quickSort(arr, startIndex, right);
			quickSort(arr, left, endIndex);
			
		}
		else
		{
			if(size == 2)
			{
				if(arr[startIndex] > arr[endIndex])
				{
					int temp = arr[startIndex];
					arr[startIndex] = arr[endIndex];
					arr[endIndex] = temp;
				}
			}
		}
		
	}
	

}
