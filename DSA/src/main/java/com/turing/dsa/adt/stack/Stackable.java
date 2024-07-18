package com.turing.dsa.adt.stack;

public interface Stackable {
	
	void push(int a);
	int pop ();
	int peek();
	int getSize();
	Boolean isFull();
	Boolean isEmpty();

}
