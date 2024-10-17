package com.turing.dsa.adt.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PriorityQueueWithHeapTest {

	@Test
	public void testEnqeue()
	{
		PriorityQueueWithHeap queue = new PriorityQueueWithHeap();
		queue.enqeue(100);
		queue.enqeue(50);
		queue.enqeue(300);
		
		assertEquals(300, queue.deqeue());
	}
}

