package com.turing.dsa.adt.Linkedlist.doublylinkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.turing.dsa.adt.Linkedlist.doublylinkedlist.DoublyLinkedList.DoublyLinkedListIterator;


public class DoublyLinkedListTest {


	@Test
	public void testInsertFirstEmpty() {
		DoublyLinkedList list = new DoublyLinkedList();
		DoublyNode node = new DoublyNode(10);
		
		list.insertFirst(node);
		
		assertEquals(false, list.isEmpty());
		assertEquals(node, list.getFirst());
		assertEquals(node, list.getLast());
	}
	

	@Test
	public void testInsertFirtNonEmptyCase() {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		
		DoublyNode first = new DoublyNode(10);
		DoublyNode second = new DoublyNode(20);
		
		list.insertFirst(first);
		list.insertFirst(second);
		
		Iterator <DoublyNode> iterator = list.iterator();

		DoublyNode element1 = iterator.next();
		assertEquals(second, element1);
		
		DoublyNode element2 = iterator.next();
		assertEquals(first, element2);
		
		assertEquals(false, iterator.hasNext());
		
		assertTrue(list.getFirst() == element1);
		assertTrue(list.getLast() == element2);

		
		assertTrue(element1.getNext() == element2);
		assertTrue(element2.getPrevious() == element1);
	}
	

	@Test
	public void testInsertFirstNonEmptyThreeNode() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		DoublyNode first = new DoublyNode(10);
		DoublyNode second = new DoublyNode(20);
		DoublyNode third = new DoublyNode(30);
		
		list.insertFirst(first);
		list.insertFirst(second);
		list.insertFirst(third);
	
		// [third,second,first]
		
		
		Iterator<DoublyNode> iterator = list.iterator();
		DoublyNode element1 = iterator.next();
		assertEquals(third, element1);
		
		DoublyNode element2 = iterator.next();
		assertEquals(second, element2);
	
		DoublyNode element3 = iterator.next();
		assertEquals(first, element3);
		
		assertTrue(element1.getNext() == element2);
		assertTrue(element2.getNext() == element3);
		
		assertTrue(element3.getPrevious() == element2);
		assertTrue(element2.getPrevious() == element1);
		
		assertEquals(false, iterator.hasNext());
	}
	
	@Test
	public void testReverseOrder() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		DoublyNode first = new DoublyNode(10);
		DoublyNode second = new DoublyNode(20);
		DoublyNode third =new DoublyNode(30);
		
		list.insertFirst(first);
		list.insertFirst(second);
		list.insertFirst(third);
		
		Iterator<DoublyNode> iterator = list.reverseItertor();
		
		assertEquals(first, iterator.next() );
		assertEquals(second, iterator.next() );
		assertEquals(third, iterator.next() );
	}
	
	@Test
	public void testInsertLastEmpty() {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		DoublyNode first = new DoublyNode(10);

		list.insertLast(first);
		
		assertEquals(first, list.getFirst());
		assertEquals(first, list.getLast());
		
		
	}
	
	@Test
	public void testInsertLastThreeNode() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		DoublyNode first = new DoublyNode(10);
		DoublyNode second = new DoublyNode(20);
		DoublyNode third = new DoublyNode(30);
		
		list.insertLast(first);
		list.insertLast(second);
		list.insertLast(third);
		
		Iterator<DoublyNode> iterator = list.iterator();
		DoublyNode element1 = iterator.next();
		assertEquals(first, element1);
		
		DoublyNode element2 = iterator.next();
		assertEquals(second, element2);
		
		DoublyNode element3 = iterator.next();
		assertEquals(third, element3);
		
		assertTrue(element1.getNext() == element2);
		assertTrue(element2.getNext() == element3);
		
		assertTrue(element3.getPrevious() == element2);
		assertTrue(element2.getPrevious() == element1);
		
		assertEquals(false, iterator.hasNext());
		assertEquals(first, list.getFirst());
		assertEquals(third, list.getLast());

	}
	
	@Test
	public void testInsertLastEmptyManyCaseWithLoop() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		DoublyNode[] nodes = new DoublyNode[10];
		
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new DoublyNode(i);
			list.insertLast(nodes[i]);
		}
	Iterator<DoublyNode> iterator = list.iterator();
		for (int i = 0; i < nodes.length; i++) {
			DoublyNode node = nodes[i];
			assertEquals(node, iterator.next());
			
		}
		
		for (int i = 1; i < nodes.length; i++) {
			DoublyNode previousNode = nodes[i-1];
			DoublyNode nextNode = nodes[i];
			
			assertTrue(previousNode.getNext() == nextNode);
			assertTrue(nextNode.getPrevious() == previousNode);
 		}
		
		assertEquals(list.getFirst(), nodes[0]);
		assertEquals(list.getLast(), nodes[9]);
	}
	
	@Test
	public void testInsertAfterSingleItem() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		DoublyNode first = new DoublyNode(10);
		DoublyNode second = new DoublyNode(20);
		
		
		list.insertFirst(first);
		list.insertAfter(first, second);
	
		Iterator <DoublyNode> iterator = list.iterator();
		
		assertEquals(first, iterator.next());
		assertEquals(second, iterator.next());
		
		assertTrue(first.getNext() == second);
		assertTrue(second.getPrevious() == first);
	}
	
	
	@Test
	public void testInsertAfterManyItem() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		DoublyNode first = new DoublyNode(10);
		DoublyNode second = new DoublyNode(20);
		DoublyNode third = new DoublyNode(30);
		DoublyNode fourth = new DoublyNode(40);
	
		
		list.insertFirst(first);
		list.insertLast(second);
		list.insertAfter(first,third);
		list.insertAfter(third, fourth);
		
		//[first,third,fourth,second]
		Iterator <DoublyNode> iterator = list.iterator();
		
		assertEquals(first, iterator.next());
		assertEquals(third, iterator.next());
		assertEquals(fourth, iterator.next());
		assertEquals(second, iterator.next());
		
		assertTrue(first.getNext() == third);
		assertTrue(third.getNext() == fourth);
		assertTrue(fourth.getNext() == second);
		
		assertTrue(second.getPrevious() == fourth);
		assertTrue(fourth.getPrevious() == third);
		assertTrue(third.getPrevious() == first);
		
		assertEquals(first, list.getFirst());
		assertEquals(second, list.getLast());
	}
	
}
