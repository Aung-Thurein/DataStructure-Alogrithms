package com.turing.dsa.adt.Linkedlist.doublylinkedlist;

public class DoublyNode {

	DoublyNode next;
	DoublyNode previous;
	int value;
	
	public DoublyNode(int value) {
		this.value = value;
	}
	
	public DoublyNode getNext() {
		return this.next;
	}
	
	public DoublyNode getPrevious() {
		return this.previous;
	}
	
}
