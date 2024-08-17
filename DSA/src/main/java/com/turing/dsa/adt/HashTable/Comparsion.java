package com.turing.dsa.adt.HashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class Comparsion {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 1000000	; i++) {
			list.add(i);
		}
		
		double start = System.currentTimeMillis();
		boolean contain = list.contains(1000000);
		double end = System.currentTimeMillis();
		
		System.out.println("Time " + (end-start) + "ms");
		
		
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		 
		for(int i = 0; i < 1000000; i++)
		{
			hash.put(i, i);
		}
		
		double start1 = System.currentTimeMillis();
		boolean contain1 = hash.containsKey(1000000);
		double end1 = System.currentTimeMillis();
		System.out.println("Time" + (end1 - start1) + "ms");
	}
	
	

}
