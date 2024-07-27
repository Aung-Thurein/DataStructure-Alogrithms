package com.turing.dsa.adt.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class InOrderTest {

	@Test
	public void TestInOrderBaseCase()
	{
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		Node node12 = new Node(12);
		
		node10.setLeft(node11);
		node10.setRight(node12);
	
		Tree tree = new Tree(node10);

		InOrderTraversal traversal = new InOrderTraversal(tree);
		Iterator<Node> iterator = traversal.iterator();
		
		assertEquals(node11, iterator.next());
		assertEquals(node10, iterator.next());
		assertEquals(node12, iterator.next());
	}
	
	@Test
	public void testInOrderBaseCase0()
	{
		Node node10 = new Node(10);
		Tree tree = new Tree(node10);
		InOrderTraversal traversal = new InOrderTraversal(tree);
		
		Iterator<Node> iterator = traversal.iterator();
		
		assertEquals(node10, iterator.next());
		assertEquals(false, iterator.hasNext());
	}
	
	@Test
	public void testInOrderManyCase()
	{
		Node node10 = new Node(10);
		Node node9 = new Node(9);
		Node node8 = new Node(8);
		Node node15 = new Node(15);
		Node node12 = new Node(12);
	
		node10.setLeft(node9);
		node9.setLeft(node8);
		
		node10.setRight(node15);
		node15.setLeft(node12);
		
		Tree tree = new Tree(node10);
		InOrderTraversal traversal = new InOrderTraversal(tree);
		
		Iterator<Node> iterator = traversal.iterator();
		
		assertEquals(node8, iterator.next());
		assertEquals(node9, iterator.next());
		assertEquals(node10, iterator.next());
		assertEquals(node12, iterator.next());
		assertEquals(node15, iterator.next());
		
	}
}
