package com.turing.dsa.adt.BinaryTree;

import org.junit.jupiter.api.Test;

public class PreOrderIterativeTest {
	
	@Test
	public void testPreOrder()
	{
		Node node10 = new Node(10);
		Node node8 = new Node(8);
		Node node3 = new Node(3);
		Node node9 = new Node(9);
		Node node15 = new Node(15);
		Node node12= new Node(12);
		Node node25 = new Node(15);
		
		node10.setLeft(node8);
		node10.setRight(node15);
		
		node8.setLeft(node3);
		node8.setRight(node9);
		
		node15.setLeft(node12);
		node15.setRight(node25);
		
		Tree tree = new Tree(node10);
		
		PreOrderIterative traversal = new PreOrderIterative(tree);
		traversal.traverse();



	}

}
