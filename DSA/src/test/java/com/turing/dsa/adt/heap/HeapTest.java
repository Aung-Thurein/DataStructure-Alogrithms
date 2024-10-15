package com.turing.dsa.adt.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.turing.dsa.adt.BinaryTree.Node;

public class HeapTest {

	@Test
	public void testBuildHeapBaseCaseOne()
	{
		Integer [] items = {1,2};
	
		
		CompleteBinaryTree tree = new CompleteBinaryTree(items);

		Node root = tree.root;
		
		assertEquals(1, root.getValue());
		assertEquals(2, root.getLeft().getValue());
		
		
	}
	@Test
	public void testBuildHeapBaseCaseTwo()
	{
		Integer [] items = {1,2,3};
		
		CompleteBinaryTree tree = new CompleteBinaryTree(items);

		Node root = tree.root;
		
		assertEquals(1, root.getValue());
		assertEquals(2, root.getLeft().getValue());
		assertEquals(3, root.getRight().getValue());
		
	}
	
	@Test
	public void testBuildHeapComplexCase()
	{
		Integer [] items = {1,2,3,4,5,6};
		
	/*
	  	[1]
	 [2] 		[3]
	[4] [5]	  [6]	
	 */
		
		CompleteBinaryTree tree = new CompleteBinaryTree(items);

		Node root = tree.root;
		
		assertEquals(1, root.getValue());
		assertEquals(2, root.getLeft().getValue());
		assertEquals(3, root.getRight().getValue());
		
		Node node2 = root.getLeft();
		Node node3 = root.getRight();
		
		assertEquals(4, node2.getLeft().getValue());
		assertEquals(5, node2.getRight().getValue());
		
		
		assertEquals(6, node3.getLeft().getValue());
		
		
	}
}
