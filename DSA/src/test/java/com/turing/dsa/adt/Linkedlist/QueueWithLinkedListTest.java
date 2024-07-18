package com.turing.dsa.adt.Linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QueueWithLinkedListTest {

	
	@Test
	public void testEnqueue() {

		QueueWithLinkedList queue = new QueueWithLinkedList();
		
		queue.enqueue(10);
		queue.dequeue();
		assertEquals(true, queue.isEmpty());
	}
	
	@Test
	public void testEnqueMany() {
		QueueWithLinkedList  queue = new QueueWithLinkedList();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		
		assertEquals(10, queue.dequeue());
		assertEquals(20, queue.dequeue());
		assertEquals(30, queue.dequeue());
		assertEquals(40, queue.dequeue());
		assertEquals(50, queue.dequeue());
		
	}
}
