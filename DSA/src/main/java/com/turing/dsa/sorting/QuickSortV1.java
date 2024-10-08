package com.turing.dsa.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSortV1 implements Sortable{

	@Override
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	public void  quickSort(int[]arr, int startIndex, int endIndex)
	{
		int size = endIndex - startIndex + 1;
		
		//divide
		if(size >= 3)
		{
			int pivot = arr[endIndex];

			if(pivot ==1)
			{
				int temp = arr[startIndex];
				arr[startIndex] = arr[endIndex];
				arr[endIndex] = temp;
			}
			pivot = arr[endIndex];
			
			
			List<Integer> leftSide = new ArrayList<Integer>();
			List<Integer> rightSide = new ArrayList<Integer>();

			
			for (int i = startIndex; i < endIndex; i++) {
				if(arr[i] <= pivot)
				{
					leftSide.add(arr[i]);
				}
				else
				{
					rightSide.add(arr[i]);
				}

			}
			
			//copied Back
			int index = startIndex;

			for(Integer left : leftSide)
			{
				arr[index++] = left;
			}
			int pivotIndex = index;
			arr[index++] = pivot;
			
			for(Integer right : rightSide)
			{
				arr[index++] = right;
			}
			
			quickSort(arr, startIndex, pivotIndex-1);
			if(rightSide.size() > 0)
			{
				quickSort(arr, pivotIndex+1, endIndex);
				
			}
			
			
			
		}
		else
		{
			if(size == 2)
			{
				if(arr[startIndex] > arr [endIndex])
				{
					int temp = arr[startIndex];
					arr[startIndex] = arr[endIndex];
					arr[endIndex] = temp;
				}
				
			}
		}
	}

}
