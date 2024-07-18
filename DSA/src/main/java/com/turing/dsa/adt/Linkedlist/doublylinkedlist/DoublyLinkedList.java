package com.turing.dsa.adt.Linkedlist.doublylinkedlist;

import java.util.Iterator;

public class DoublyLinkedList implements Iterable<DoublyNode> {
	
	DoublyNode first;
	DoublyNode last;
	
	public void insertFirst(DoublyNode node) {
		if(isEmpty()) {
			first = node;
			last = node;
		}else {
			node.next = first;
			first.previous = node;
			first = node;
		}
	}
	
	public void insertLast(DoublyNode node) {
		if(isEmpty()) {
			first = node;
			last = node;
		}else {
			last.next = node;
			node.previous = last;
			last = node;
		}
	}
	
	public void insertAfter(DoublyNode existingNode, DoublyNode newNode) {
		
		if(existingNode == last) {
			insertLast(newNode);
		}else {
			if(existingNode.next != null) {
				existingNode.next.previous = newNode;
			}
			
			//mid point insert
			newNode.previous = existingNode;
		
			newNode.next = existingNode.next;
			existingNode.next = newNode;
			
		}
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public DoublyNode getFirst() {
		return this.first;
	}
	
	public DoublyNode getLast() {
		return this.last;
	}

	@Override
	public Iterator<DoublyNode> iterator() {

		return new DoublyLinkedListIterator();
	}
	
	public Iterator<DoublyNode> reverseItertor(){
		return new DoublyLinkedListReverseIterator();
	}
	
	class DoublyLinkedListIterator implements Iterator<DoublyNode>{

		DoublyNode current;
		
		public DoublyLinkedListIterator() {
			this.current = first;
			
		}
		@Override
		public boolean hasNext() {

		return this.current != null;
		}

		@Override
		public DoublyNode next() {
			
			if(current != null) {
				DoublyNode temp = current;
				current = current.next;
				
				return temp;
			}else {
				return null;
				
			}
			
		}
		
	}
	
	class DoublyLinkedListReverseIterator implements Iterator<DoublyNode>{

		DoublyNode current;
		
		public DoublyLinkedListReverseIterator() {
			this.current = last;
		}
		@Override
		public boolean hasNext() {
			
			return this.current != null;
		}

		@Override
		public DoublyNode next() {
			if(current != null) {
				DoublyNode temp = current;
				current = current.previous;
				return temp;
			}else {
				return null;
				
			}
		}
		
	}


}
