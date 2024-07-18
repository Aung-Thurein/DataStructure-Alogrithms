package com.turing.dsa.sorting;

import java.util.Random;

public class Util {
	static Random random = new Random();
	
	static void print(String message, int[] arr) {
		System.out.println(message);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ,   ");

		}
		System.out.println("");

	}

	static public int[] getRandomArray(int n, int range) {
		int arr[] = new int[n];
	
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = random.nextInt(range);

		}
		return arr;

	}
	static public Boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}

		}
		return true;

	}


}
