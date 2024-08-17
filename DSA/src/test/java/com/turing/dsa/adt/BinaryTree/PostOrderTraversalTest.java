package com.turing.dsa.adt.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class PostOrderTraversalTest {

	@Test
	void testBaseCase()
	{
		
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(25);
		PostOrderTraversal traversal = new PostOrderTraversal(tree);
		Iterator<Node> iterator= traversal.iterator();
		
		assertEquals(5, iterator.next().getValue());
		assertEquals(25, iterator.next().getValue());
		assertEquals(10, iterator.next().getValue());
				
	}
	
	@Test
	void testMany()
	{
		
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(25);
		tree.insert(6);
		tree.insert(12);
		PostOrderTraversal traversal = new PostOrderTraversal(tree);
		Iterator<Node> iterator= traversal.iterator();

		assertEquals(6, iterator.next().getValue());	
		assertEquals(5, iterator.next().getValue());
		assertEquals(12, iterator.next().getValue());
		assertEquals(25, iterator.next().getValue());
		assertEquals(10, iterator.next().getValue());
				
	}
	
}
