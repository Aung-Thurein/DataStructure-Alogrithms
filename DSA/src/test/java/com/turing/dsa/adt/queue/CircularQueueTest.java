package com.turing.dsa.adt.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class CircularQueueTest extends QueueTest{
	Queue queue = new CircularQueue(5);
	
	@Test
	public void testCircularTest() {
		for (int i = 0; i < 5; i++) {
			queue.enqueue(i);
		}
		
		assertEquals(5, queue.getSize());
		assertEquals(false, queue.isEmpty());
		
		for (int i = 0; i < 5; i++) {
			assertEquals(i, queue.dequeue() );
		}
		
		queue.enqueue(10);
		//assertEquals(10, queue.peek());
		assertEquals(1, queue.getSize());
		assertEquals(10, queue.dequeue());
	}

}
