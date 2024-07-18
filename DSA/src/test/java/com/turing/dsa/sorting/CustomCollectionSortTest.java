package com.turing.dsa.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CustomCollectionSortTest {
	
	@Test
	public void Test() {
		List<Human>list = new ArrayList<Human>();
		list.add(new Human("one", 60));
		list.add(new Human("two", 30));
		list.add(new Human("three", 14));
		list.add(new Human("four", 5));
		list.add(new Human("five", 98));
		
		Collections.sort(list);
		list.forEach(System.out::println);
		
	}

}
