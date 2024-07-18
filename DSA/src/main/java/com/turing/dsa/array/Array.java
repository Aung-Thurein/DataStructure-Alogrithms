package com.turing.dsa.array;	

public class Array {
	
	int size;
	protected int [] items;
	
	public Array (int arr[]) {
		this.items = arr;
	}
	
	public Array(int size) {
		this.items = new int [size];
	}
	


	void put (int index, int value) {
		this.items[index] = value;
	}
	
	int get (int index) {
		return this.items[index];
	}
	
	public static void main (String [] args) {
		
		Array arr =new Array(5);
		
	}

	
}
