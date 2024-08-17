package com.turing.dsa.adt.HashTable.LinkedList;

public interface LinkedList<T> {
		void insertLast(Node<T> node);
		void insertFirst(Node<T> node);
		void delete(Node<T> node);
		void showAll();
		boolean isEmpty();
		void deleteFirst();
		
		void insertLast(T item);
		void insertFirst(T item);
		boolean isItemExists(T item);
	
		
}
