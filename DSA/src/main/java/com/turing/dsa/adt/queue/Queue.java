package com.turing.dsa.adt.queue;

public interface Queue {
	void enqueue(int item);
	int dequeue();
	int peek();
	Boolean isEmpty();
	Boolean isFull();
	int getSize();
	
}
