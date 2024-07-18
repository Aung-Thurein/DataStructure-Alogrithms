package com.turing.dsa.adt.Linkedlist;

import com.turing.dsa.adt.stack.StackUnderflowException;

public class StackWithLinkedList extends LinkedListImpl {

	public void push(int value) {
		Node node = new Node(value);
	
		super.insertLast(node);
		
	}
	
	public int pop() {
		Node last = super.getLast();
		
		if(last == null) {
			throw new StackUnderflowException("Stack is empty");
		}
		else {
			super.delete(last);
			return last.value;
		}
		
		
		
		
	}
	
	
	
}
