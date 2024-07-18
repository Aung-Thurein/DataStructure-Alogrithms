package com.turing.dsa.adt.queue;

public class CircularQueue extends ArrayBaseQueue {

	CircularQueue(int maxSize) {
		super(maxSize);
	}

	@Override
	public void enqueue(int item) {
		if(!this.isFull()) {
		this.rear = (this.rear + 1) % this.maxSize;
		this.items[this.rear] = item;
		this.noOfItems++;
		}

	}

	@Override
	public int dequeue() {
		if(!this.isEmpty()) {
		this.front = (this.front + 1) % this.maxSize;
		noOfItems--;
		return this.items[this.front];
		}else {
			throw new RuntimeException("Queue UnderFlow"); 
		}
	}

}
