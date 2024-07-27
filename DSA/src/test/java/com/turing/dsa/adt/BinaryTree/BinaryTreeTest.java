package com.turing.dsa.adt.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
	@Test
	public void testInsert()
	{
		Tree tree = new Tree();
		
		tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        
        assertEquals(true, BinaryTreeUtils.isBinaryTree(tree));
	}
	@Test
	public void testSearch()
	{
		Tree tree = new Tree();
		
		tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        
        
     Node FoundNode = tree.search(4);
     assertEquals(4, FoundNode.getValue());

	}
}
