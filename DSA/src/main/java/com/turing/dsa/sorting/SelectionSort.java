package com.turing.dsa.sorting;

import java.util.Iterator;

public class SelectionSort implements Sortable {

	@Override
	public void sort(int[] arr) {
			for (int i = 0; i < arr.length -1; i++) {
				int minIndex = i; 
				for (int j = i+1; j < arr.length; j++) {
					if(arr [minIndex] > arr[j]) {
						minIndex = j;
					}
					
				}
				int temp = arr[i];
				arr [i] = arr[minIndex];
				arr[minIndex] = temp;
			}
	}

}
