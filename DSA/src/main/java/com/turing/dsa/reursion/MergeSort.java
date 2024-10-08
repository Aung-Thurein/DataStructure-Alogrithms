package com.turing.dsa.reursion;

import com.turing.dsa.sorting.Sortable;

public class MergeSort implements Sortable {

	
	@Override
	public void sort(int[] arr) {
		mergeSort(arr, 0, arr.length-1);
	}

	public void mergeSort(int[] arr, int startIndex, int endIndex)
	{	
		if(startIndex < endIndex)
		{
			//split
			int middle = (startIndex + endIndex) / 2;
			mergeSort(arr, startIndex, middle);
			mergeSort(arr, middle + 1, endIndex);
			
			//merge
			int i = startIndex;
			int j = middle + 1;
			
			int size = endIndex - startIndex + 1;
			
			int[] mergedArr = new int[size];
			int current = 0;
			
			while(i <= middle && j <= endIndex)
			{
				if(arr[i] < arr[j])
				{
					mergedArr[current] = arr[i];
					i++;
				}
				else
				{
					 mergedArr[current] = arr[j];
					 j++;
				}
				current ++;
			}
			
			while(i <= middle)
			{
				mergedArr[current++] = arr[i++];
			}
			while(j <= endIndex)
			{
				mergedArr[current++] = arr[j++];
			}
			
			System.arraycopy(mergedArr, 0, arr, startIndex, size);

			
		}


	}
}
