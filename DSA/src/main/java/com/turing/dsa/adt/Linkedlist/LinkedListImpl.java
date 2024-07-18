package com.turing.dsa.adt.Linkedlist;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedListImpl implements LinkedList , Iterable<Node>{

	Node first;//null
	Node last;//null
	@Override
	public void insertLast(Node node) {

		if(first == null) {
			first = node;
			last = node;	
		}
		
		else if(last != null) {
			last.next = node;
		}
		last = node;
		
		
	}
	
	@Override
	public void deleteFirst() {
		if(first != null ) {
			first = first.next;
		}
		if(first == null) {
			
			last = null;
		}

	}
	@Override
	public void insertFirst(Node node) {

		if(first == null) {
			first = node;
			last = node;
		}else{
			node.next = first;
			first = node;
		}
	}
	
	public Node getFirst() {
		return first;
	}
	
	public Node getLast() {
		return last;
	}
	@Override
	public void delete(Node node) {
		
		if(!this.isEmpty()) {
			if(first == node) {
				first = first.next;
				node.next = null;
			}	
			else {
			//middle node delete
				Node previous = first;
				Node current = previous.next;
				
				while(current != null) {
					if(current == node) {
						
					//delete
						previous.next = current.next;
						if(node.next == null) {
							last = previous;
							node.next = null;
												
						}
						
			  			break;
					}
				//last node delete
					previous = current;
					current = current.next;
					
					
					
					
					
				}
			}
			
		
		}
		
	}
	
	@Override
	public  boolean isEmpty() {
		return first == null;
	}


	@Override
	public void showAll() {
		Node currentNode = first;
		while(currentNode != null) {
			System.out.println("Items : " + currentNode.value);
			currentNode = currentNode.next;
		}
		
	
		
	}
	
	
	class LinkedListIterator implements Iterator<Node>{

		Node current;
		public LinkedListIterator() {
			this.current = first;
		}
		
		@Override
		public boolean hasNext() {

			return current != null;
		}

		@Override
		public Node next() {
			if(current != null) {
				Node temp = current;
				current = temp.next;
				return temp;
			}else {
				return null;
			}
			
		}

	
	
		
	}
	
	

	@Override
	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}

	@Override
	public Spliterator<Node> spliterator() {
		// TODO Auto-generated method stub
		return Iterable.super.spliterator();
	}
	
	@Override
	public void forEach(Consumer<? super Node> action) {
		// TODO Auto-generated method stub
		Iterable.super.forEach(action);
	}


	

}
