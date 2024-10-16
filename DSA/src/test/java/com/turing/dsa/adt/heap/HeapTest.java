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
	
		
		MaxHeap tree = new MaxHeap(items);
		tree.buildTree();
		Node root = tree.root;
		
		assertEquals(1, root.getValue());
		assertEquals(2, root.getLeft().getValue());
		
		
	}
	@Test
	public void testBuildHeapBaseCaseTwo()
	{
		Integer [] items = {1,2,3};
		
		MaxHeap tree = new MaxHeap(items);
		tree.buildTree();
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
		
		MaxHeap tree = new MaxHeap(items);
		tree.buildTree();
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


	@Test
	public void testHeapifyBaseCase()
	{
		Integer[] items = {1,3,2};
		
		MaxHeap tree = new MaxHeap(items);
		tree.heapfiy();
		tree.buildTree();
		Node root = tree.root;

		assertEquals(3, root.getValue());
		assertEquals(1, root.getLeft().getValue());
		assertEquals(2, root.getRight().getValue());
		
		
	}

	@Test
	public void testHeapifyComplexCase()
	{
		Integer[] items = {1,3,2,6,12,45,7};
		
		MaxHeap tree = new MaxHeap(items);
		tree.heapfiy();
		tree.buildTree();
		Node root = tree.root;

		assertEquals(45, root.getValue());
		
		
	}
	
	@Test
	public void testInsert()
	{
		Integer[] items = {1,7,9,4,12,3,20};
		
		MaxHeap tree = new MaxHeap(items);
		tree.insert(100);
		tree.heapfiy();
		tree.buildTree();
		Node root = tree.root;

		assertEquals(100, root.getValue());
	}
	
	@Test
	public void testDelete()
	{
		Integer[] items = {1,7,9,4,12,3,20};
		
		MaxHeap tree = new MaxHeap(items);
		tree.delete(20);
		tree.heapfiy();
		tree.buildTree();
		Node root = tree.root;

		assertEquals(12, root.getValue());
	}
}
