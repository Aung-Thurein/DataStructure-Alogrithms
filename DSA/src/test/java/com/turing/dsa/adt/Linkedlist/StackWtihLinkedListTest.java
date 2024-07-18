package com.turing.dsa.adt.Linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackWtihLinkedListTest {

	@Test
	public void testPushSingle() {
		StackWithLinkedList stack = new StackWithLinkedList();
		stack.push(100);
		
		assertEquals(100, stack.pop());
	}
	
	
	@Test
	public void tesPushMultiple() {
		StackWithLinkedList stack = new StackWithLinkedList();
		 
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			
		}
		
		for (int i = 9; i >= 0; i--) {
			int element = stack.pop();
			System.out.println("Elements" + element);
			assertEquals(i, element);
			
		}
	}
}
