
package com.turing.dsa.adt.Linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class LinkedListTest {

	@Test
	public void testLinkedList() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		LinkedListImpl list = new LinkedListImpl();
		
		list.insertLast(first);
		list.insertLast(second);
		list.insertLast(third);


		Iterator<Node> iterator = list.iterator();

		assertEquals(first, iterator.next());
		assertEquals(second, iterator.next());
		assertEquals(third, iterator.next());
		
		assertEquals(false, iterator.hasNext());
	
	}
	@Test
	public void testInsertedFirstEmptyCase() {
	Node first = new Node(10);
	 
	LinkedListImpl list = new LinkedListImpl();
	list.insertFirst(first);

	Iterator <Node> iterator = list.iterator();
	assertEquals(first, iterator.next());
	
	assertFalse(list.isEmpty());
		
	}
	@Test
	public void testInsertFirstManyCase() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		LinkedListImpl list = new LinkedListImpl();
		list.insertFirst(first);
		list.insertFirst(second);
		list.insertFirst(third);
		
		Iterator <Node> iterator = list.iterator();
		assertEquals(third, iterator.next());
		assertEquals(second, iterator.next());
		assertEquals(first, iterator.next());
		
		assertEquals(false, iterator.hasNext());
	}
	
	@Test
	public void testInsertFirstAndLastManyCase() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		//[40,30,10,20]
		LinkedListImpl list = new LinkedListImpl();
		list.insertFirst(first);
		list.insertLast(second);
		list.insertFirst(third);
		list.insertFirst(fourth);
		
		
		Iterator <Node> iterator = list.iterator();
		
		assertEquals(fourth, iterator.next());
		assertEquals(third, iterator.next());
		assertEquals(first, iterator.next());
		assertEquals(second, iterator.next());
	}
	
	@Test
	public void testDeleteFirst() {
		Node first = new Node(10);
		Node second = new Node(20);
		
		LinkedListImpl list = new LinkedListImpl();
		
		list.insertFirst(first);
		
		list.deleteFirst();
		
		assertEquals(true, list.isEmpty());
	}
	

	@Test
	public void testDeleteFirstManyCase() {
		Node first = new Node(10);
		Node second = new Node(20);
		
		LinkedListImpl list = new LinkedListImpl();
		list.insertFirst(first);
		list.insertFirst(second);
		
		list.deleteFirst();//delete second
		Iterator <Node> iterator = list.iterator();
			
		assertEquals(first, iterator.next());
		assertEquals(false, iterator.hasNext());
	}
	
	
	@Test
	public void testDeleteNodeFirst() {
		Node first = new Node(10);
		Node second = new Node(20);
		
		LinkedListImpl list = new LinkedListImpl();
		list.insertFirst(first);
		list.insertLast(second);
		
		
		list.delete(first);
		Iterator <Node> iterator = list.iterator();
		
		assertEquals(second, iterator.next());
	}
	
	@Test
	public void testDeleteNodeMiddle() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		LinkedListImpl list = new LinkedListImpl();
		list.insertFirst(first);
		list.insertLast(second);
		list.insertLast(third);
		
		
		
		list.delete(second);
		Iterator <Node> iterator = list.iterator();
		
		assertEquals(first, iterator.next());
		assertEquals(third, iterator.next());
	}
	
	
	@Test
	public void testDeleteNodeLast() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		LinkedListImpl list = new LinkedListImpl();
		
		list.insertFirst(first);
		list.insertLast(second);
		list.insertLast(third);
			
		list.delete(third);
		Iterator <Node> iterator = list.iterator();
		
		
		assertEquals(first, iterator.next());
		assertEquals(second, iterator.next());
		
		
	}
	
	@Test
	public void testDeleteNodeMany() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);
		
		
		
		LinkedListImpl list = new LinkedListImpl();
		
		list.insertFirst(first);
		list.insertLast(second);
		list.insertLast(third);
		list.insertLast(fourth);
		list.insertLast(fifth);
		list.delete(fourth);
		
		Iterator <Node> iterator = list.iterator();
		assertEquals(first, iterator.next());
		assertEquals(second, iterator.next());
		assertEquals(third, iterator.next());
		assertEquals(fifth, iterator.next());
		assertEquals(false, iterator.hasNext());
	}
	
	
}
