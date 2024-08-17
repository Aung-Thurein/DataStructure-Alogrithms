package com.turing.dsa.sorting;

public class ShellSort implements Sortable {

	@Override
	public void sort(int[] arr) {
		
		int n = arr.length;
		int gap = n / 2;
		
		while(gap >= 1)
		{
			int temp;
			for (int i = gap; i < n; i++) {
				temp = arr[i];
				int j = i;
				for (; (j >= gap) && arr[j-gap] > temp; j-= gap) {
					arr[j] = arr[j-gap];
				}
				arr[j] = temp;
			}
			
			gap = gap / 2;
			
		}		
	}

	
}

