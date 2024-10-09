package com.turing.dsa.adt.two34tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Two34TreeInsertTest {

	@Test
	public void testLeafBaseCase()
	{
	
		TwoThreeFourTree<Integer> tree = new TwoThreeFourTree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(100);
		
		Node<Integer> root = tree.getRoot();
		
		assertEquals(5, root.key[0]);
		assertEquals(10, root.key[1]);
		assertEquals(100, root.key[2]);
		
	}
	
}
