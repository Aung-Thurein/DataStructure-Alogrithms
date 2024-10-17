package com.turing.dsa.adt.heap;

public class PriorityQueueWithHeap {

	MaxHeap heap;
	
	public PriorityQueueWithHeap()
	{
		Integer[] empty = {};
		heap = new MaxHeap(empty);
	}
	
	public void enqeue(int value)
	{
		this.heap.insert(value);
		this.heap.heapfiy();
		this.heap.buildTree();
	}
	
	public int deqeue()
	{
		return this.heap.deqeue();
	}
}

