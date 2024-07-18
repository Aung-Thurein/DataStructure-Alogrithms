package com.turing.dsa.adt.stack;

public class Stack implements Stackable {
	
	int size;
	int [] items;
	int top = -1;
	
	public Stack(int size)
	{
		this.size = size;
		this.items = new int [size];
	}

	@Override
	public void push(int a) {
		if(! isFull()) {
			
			this.items[++top] = a ;
			
		}else {
			throw new StackOverflowException("Stack is Full");
		}
		
		
	}

	@Override
	public int pop() {
		if(! isEmpty()) {
		
			return this.items[top--];
		}
		else {
			throw new StackUnderflowException("Stack is Empty");
		}
		
	}

	@Override
	public int peek() {
		return this.items[this.top];
	}

	@Override
	public int getSize() {
		return this.top + 1;
	}

	@Override
	public Boolean isFull() {
		return top == size -1;
	}

	@Override
	public Boolean isEmpty() {
		
		return top == -1;
		
		
	}

}
