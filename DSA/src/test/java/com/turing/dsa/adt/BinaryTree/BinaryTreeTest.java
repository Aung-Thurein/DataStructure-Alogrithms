package com.turing.dsa.adt.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.Disabled;
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
	
	@Test
	public void testDelete()
	{
		Tree tree = new Tree();
		
		tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        
        
      tree.delete(4);
      assertEquals(true, BinaryTreeUtils.isBinaryTree(tree));
      
      InOrderTraversal traversal = new InOrderTraversal(tree);
      Iterator<Node> iterator = traversal.iterator();
      
      //5,8,9,10,25,30,102
      assertEquals(5, iterator.next().getValue());
      assertEquals(8, iterator.next().getValue());
      assertEquals(9, iterator.next().getValue());
      assertEquals(10, iterator.next().getValue());
      assertEquals(25, iterator.next().getValue());
      assertEquals(30, iterator.next().getValue());
      assertEquals(102, iterator.next().getValue());
      

	}
	@Test
	public void testDeleteLeftOnlyChild()
	{
		Tree tree = new Tree();
		
		tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        
        tree.delete(5);
        assertEquals(true, BinaryTreeUtils.isBinaryTree(tree));
        
        
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        assertEquals(4, iterator.next().getValue());
        assertEquals(8, iterator.next().getValue());
        assertEquals(9, iterator.next().getValue());
        assertEquals(10, iterator.next().getValue());
        assertEquals(25, iterator.next().getValue());
        assertEquals(30, iterator.next().getValue());
        assertEquals(102, iterator.next().getValue());
        
		
	}
	
	@Test
	public void testDeleteRightOnlyChild()
	{
		Tree tree = new Tree();
		
		tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        
        tree.delete(30);
        assertEquals(true, BinaryTreeUtils.isBinaryTree(tree));
        
        
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
      
       
        assertEquals(4, iterator.next().getValue());
        assertEquals(5, iterator.next().getValue());
        assertEquals(8, iterator.next().getValue());
        assertEquals(9, iterator.next().getValue());
        assertEquals(10, iterator.next().getValue());
        assertEquals(25, iterator.next().getValue());
        assertEquals(102, iterator.next().getValue());
        
		
		
	}

	@Test
	public void testDeleteBothChild()
	{
		Tree tree = new Tree();
		
		tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        
        tree.delete(8);
        assertEquals(true, BinaryTreeUtils.isBinaryTree(tree));
        
        
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
      
       
        assertEquals(4, iterator.next().getValue());
        assertEquals(5, iterator.next().getValue());
        assertEquals(9, iterator.next().getValue());
        assertEquals(10, iterator.next().getValue());
        assertEquals(25, iterator.next().getValue());
        assertEquals(30, iterator.next().getValue());
        assertEquals(102, iterator.next().getValue());
        
		
		
	}
	
	@Test
	public void testSuccessor()
	{
		Tree tree = new Tree();
		
		tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        tree.insert(6);

        assertEquals(8, tree.inOrderSuccessor(6).getValue());
        assertEquals(5, tree.inOrderSuccessor(4).getValue());

        
	}
}
