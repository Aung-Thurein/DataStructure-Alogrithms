package com.turing.dsa.adt.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PriorityQueueTest {

	Queue queue = new PriorityQueue(5);

	
	 @Test
	 public void testBaseCase() {
	  
	  queue.enqueue(10); assertEquals(1, queue.getSize()); 
	  assertEquals(false, queue.isEmpty());
	  int element = queue.dequeue(); assertEquals(10, element); }
	 

	@Test
	public void testPriorityQueue() {

		queue.enqueue(32);
		queue.enqueue(3);
		queue.enqueue(45);
		queue.enqueue(36);
		queue.enqueue(8);

		// {45,36,32,8,3}

		int first = queue.dequeue();

		for (int i = 1; i < 4; i++) {
			int second = queue.dequeue();
			assertEquals(true, first > second);
			System.out.println("first " + first + "second " + second);
			first = second;
		}
		

		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(60);
		queue.enqueue(30);
		

		assertEquals(200, queue.dequeue());
		assertEquals(100, queue.dequeue());
		assertEquals(60, queue.dequeue());
		assertEquals(30, queue.dequeue());
		assertEquals(3, queue.dequeue());

	}

}
