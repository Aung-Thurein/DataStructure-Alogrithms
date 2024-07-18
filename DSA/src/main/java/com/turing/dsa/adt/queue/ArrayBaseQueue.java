package com.turing.dsa.adt.queue;

import java.util.Arrays;

public class ArrayBaseQueue implements Queue {

	protected int maxSize;
	protected int[] items;
	protected int front;
	protected int rear;
	protected int noOfItems;

	ArrayBaseQueue(int maxSize) {
		this.maxSize = maxSize;
		this.items = new int[maxSize];
		this.front = -1;
		this.rear = -1;
		this.noOfItems = 0;

	}


	@Override
	public String toString() {
		return "ArrayBaseQueue [maxSize=" + maxSize + ", items=" + Arrays.toString(items) + ", front=" + front
				+ ", rear=" + rear + ", noOfItems=" + noOfItems + "]";
	}


	@Override
	public void enqueue(int item) {
		if (this.rear < this.maxSize-1) {
			this.items[++this.rear] = item;
			this.noOfItems++;
		}

	}

	@Override
	public int dequeue() {
		if(this.front < this.maxSize-1) {
			this.noOfItems--;
			return this.items[++this.front];
		}else 
		{
			throw new RuntimeException("Queue UnderFlow"); 
		}
		
	}

	@Override
	public int peek() {
		if(!isEmpty()) {
			return this.items[this.front+1];
		}else {
			throw new RuntimeException("Queue UnderFlow"); 
		}
	}

	@Override
	public Boolean isEmpty() {
		return this.noOfItems == 0;
	}

	@Override
	public Boolean isFull() {
		return this.noOfItems == this.maxSize;
	}

	@Override
	public int getSize() {
		return this.noOfItems;
	}

}
