package com.turing.dsa.adt.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import com.turing.dsa.adt.stack.Stack;
import com.turing.dsa.adt.stack.StackOverflowException;
import com.turing.dsa.adt.stack.StackUnderflowException;
import com.turing.dsa.adt.stack.Stackable;

public class StackTest {
	//arrange
	Stackable stack = new Stack(10);
	
	@Test
	public void pushTestSingle() {
		
		//act
		stack.push(10);
	
		//assert
		assertEquals(1,stack.getSize());
		assertEquals(10, stack.peek());
		}
	
	@Test 
	public void pushTestMultiple() {
		
		//act 
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			
		}
		for (int i = 9; i >= 0 ; i--) {
			int element = stack.pop();
			assertEquals(i, element);
			
		}
		
	}
	@Test
	public void pushTestNegative() {
		
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			
		}
		 StackOverflowException exception = assertThrows(StackOverflowException.class, () ->{
			stack.push(11);
		});
		
		assertEquals(true, stack.isFull());
		
		
	}
	@Test
	public void popTestSingle() {
		stack.push(100);
		
		int original = stack.getSize();
		assertEquals(100, stack.pop());
		assertEquals(original-1, stack.getSize());
		
	}
	
	@Test
	public void popTestNegative() {
		StackUnderflowException exception = assertThrows(StackUnderflowException.class, () ->{
			stack.pop();	
	});
		assertEquals(true, stack.isEmpty());
}
}
