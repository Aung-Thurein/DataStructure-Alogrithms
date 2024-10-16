package com.turing.dsa.adt.two34tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TestTwoThreeFourTree {

	@Test
	public void testInsertBaseCase()
	{
		TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<Integer>();
		Node<Integer> result = tree.insert(100);
		assertEquals(100, result.key[0]);
	}
	
	@Test
	public void testInsertBaseCase2()
	{
		TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<Integer>();
		Node<Integer> result = tree.insert(100);
		tree.insert(99);
		tree.insert(102);
		assertEquals(99, result.key[0]);
		assertEquals(100, result.key[1]);
		assertEquals(102, result.key[2]);
		
	}
	
	@Test
	public void testInsertBaseCase3()
	{
		
		/*
		  [100]
		 [99] [102][150]
		 
		 */
		TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<Integer>();
		Node<Integer> result = tree.insert(100);
		tree.insert(99);
		tree.insert(102);
	
		result = tree.insert(150);
		
		Node<Integer> root = tree.getRoot();
		assertEquals(100, root.key[0]);
		
		
		ArrayList<Node<Integer>> children = root.getChildren();
		Node<Integer> child0 = children.get(0);
		Node<Integer> child1 = children.get(1);
		
		assertEquals(99, child0.key[0]);
		assertEquals(102, child1.key[0]);
		assertEquals(150, child1.key[1]);
	}
	
}
