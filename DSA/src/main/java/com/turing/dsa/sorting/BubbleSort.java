package com.turing.dsa.sorting;

public class BubbleSort implements Sortable{

	@Override
	public void sort(int[] arr) {
		
		for (int i = 0; i < arr.length -1; i++) {

			for (int j = 0; j < arr.length -i -1; j++) {
					
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
				}
				
				
			}
			Util.print("Iteration",arr);
			
		}
	}
	

}
