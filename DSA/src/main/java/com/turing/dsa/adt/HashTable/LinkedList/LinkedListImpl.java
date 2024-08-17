package com.turing.dsa.adt.HashTable.LinkedList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedListImpl<T> implements LinkedList<T> , Iterable<Node<T>>{

	Node<T> first;//null
	Node<T> last;//null

	@Override
	public void insertLast(Node<T> node) {

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
	public void insertFirst(Node<T> node) {

		if(first == null) {
			first = node;
			last = node;
		}else{
			node.next = first;
			first = node;
		}
	}
	
	public Node<T> getFirst() {
		return first;
	}
	
	public Node<T> getLast() {
		return last;
	}
	@Override
	public void delete(Node<T> node) {
		
		if(!this.isEmpty()) {
			if(first == node) {
				first = first.next;
				node.next = null;
			}	
			else {
			//middle node delete
				Node<T> previous = first;
				Node<T> current = previous.next;
				
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
	
	
	class LinkedListIterator implements Iterator<Node<T>>{

		Node<T> current;
		public LinkedListIterator() {
			this.current = first;
		}
		
		@Override
		public boolean hasNext() {

			return current != null;
		}

		@Override
		public Node<T> next() {
			if(current != null) {
				Node<T> temp = current;
				current = temp.next;
				return temp;
			}else {
				return null;
			}
			
		}
	}

	@Override
	public Iterator<Node<T>> iterator() {
		return new LinkedListIterator();
	}

	@Override
	public Spliterator<Node<T>> spliterator() {
		return Iterable.super.spliterator();
	}
	
	@Override
	public void forEach(Consumer<? super Node<T>> action) {
		Iterable.super.forEach(action);
	}

	@Override
	public void insertLast(T item) {
		Node<T> node = new Node<>(item);
		this.insertLast(node);
	}

	@Override
	public void insertFirst(T item) {
		Node<T> node = new Node<>(item);
		this.insertFirst(node);
	}

	@Override
	public boolean isItemExists(T item) {
		Node<T> current = first;
		while(current != null)
		{
			if(current.value.equals(item))
			{
				return true;
			}
			current = current.next;
			
		}
		return false;
	}


	

}
