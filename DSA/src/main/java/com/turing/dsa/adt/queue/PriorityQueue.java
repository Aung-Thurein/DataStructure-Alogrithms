package com.turing.dsa.adt.queue;

public class PriorityQueue extends CircularQueue{
	
	public PriorityQueue(int maxSize) {
		super(maxSize);
	}
	
	int getIndexLowerIndes(int index) {
		
		int nextIndex = index - 1;
		if(nextIndex < 0) {
			nextIndex += this.maxSize;
		}
		return nextIndex;
	}

	@Override
	public void enqueue(int item) {
		super.enqueue(item);
		if(this.noOfItems > 1) {
			int index = rear;
			int comparsion = 0;
			
			while(comparsion < (this.noOfItems - 1)  && this.items[index] > this.items[this.getIndexLowerIndes(index)]) {
				int temp = this.items[index];
				this.items[index] = this.items[this.getIndexLowerIndes(index)];
				this.items[this.getIndexLowerIndes(index)] = temp;
				comparsion ++;
				index = this.getIndexLowerIndes(index);
				
			}
		
			
		}
			System.out.println("Queue" + this);
	}
}
