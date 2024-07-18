package com.turing.dsa.adt.Linkedlist;

import com.turing.dsa.adt.stack.StackUnderflowException;

public class QueueWithLinkedList extends LinkedListImpl{
 
	public void enqueue(int value) {
		Node node = new Node(value);
		
		super.insertLast(node);
		
	}
	
	public int dequeue() {
		
		Node first = super.getFirst();
	if(first != null) {
		super.deleteFirst();
		return first.value;
		
	}else {
		throw new StackUnderflowException("Queue is empty");
		
	}
		
		
		
	}
}
