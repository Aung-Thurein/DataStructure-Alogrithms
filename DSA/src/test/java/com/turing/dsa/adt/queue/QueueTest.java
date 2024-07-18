package com.turing.dsa.adt.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class QueueTest {
//	Queue queue = new ArrayBaseQueue(5);
	Queue queue = new CircularQueue(5);

	@Test
	public void testBaseCase() {
		queue.enqueue(10);
		assertEquals(1, queue.getSize());

		assertEquals(10, queue.dequeue());
	}

	@Test
	public void testManyCase() {
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		assertEquals(5, queue.getSize());
		assertEquals(false, queue.isEmpty());
		assertEquals(true, queue.isFull());

		assertEquals(10, queue.dequeue());
		assertEquals(20, queue.dequeue());
		assertEquals(30, queue.dequeue());
		assertEquals(40, queue.dequeue());
		assertEquals(50, queue.dequeue());

		assertEquals(true, queue.isEmpty());
	}

	@Test
	public void testEnqueOverFlow() {
	
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		assertEquals(5, queue.getSize());
		assertEquals(false, queue.isEmpty());
		assertEquals(true, queue.isFull());
		
		assertEquals(10, queue.dequeue());
		assertEquals(20, queue.dequeue());
		assertEquals(30, queue.dequeue());
		assertEquals(40, queue.dequeue());
		assertEquals(50, queue.dequeue());
		
		assertEquals(0, queue.getSize());
		
		queue.enqueue(4);
		
	}
	
	@Test
	public void testDequeUnderFlow() {
		for (int i = 0; i < 5; i++) {
			queue.enqueue(i);
		}
		
		for (int i = 0; i < 5; i++) {
			assertEquals(i, queue.dequeue());
			
		}
		RuntimeException exception = assertThrows(RuntimeException.class, ()->{
			int element = queue.dequeue();
		});
		
		
		
	}
	
	@Test
	public void testPeek() {
		queue.enqueue(10);
		assertEquals(10, queue.peek());

		assertEquals(false, queue.isEmpty());
	}

}
