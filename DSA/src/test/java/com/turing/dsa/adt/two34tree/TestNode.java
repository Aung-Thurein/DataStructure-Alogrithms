package com.turing.dsa.adt.two34tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestNode {

	@Test
	public void test_twoNode()
	{
		Node<Integer> node = new Node<Integer>(2);
		
		

		node.children.add(new Node<Integer>(1));
		node.children.add(new Node<Integer>(1));
		
		assertEquals(2, node.getN_Node());
	}
	
	@Test
	public void test_threeNode()
	{
		Node<Integer> node = new Node<Integer>(3);
	

		node.children.add(new Node<Integer>(1));
		node.children.add(new Node<Integer>(1));
		
		assertEquals(3, node.getN_Node());
	}
	
	@Test
	public void test_fourNode()
	{
		Node<Integer> node = new Node<Integer>(4);
		

		node.children.add(new Node<Integer>(1));
		node.children.add(new Node<Integer>(1));
		
		assertEquals(4, node.getN_Node());
	}
	
	@Test
	public void test_leaf()
	{
		Node<Integer> node = new Node<Integer>(4);
		
		assertEquals(true, node.isLeaf());
	}
	
	@Test
	public void test_NonLeaf()
	{
		Node<Integer> node = new Node<Integer>(3);
		node.children.add(new Node<Integer>(2));
		node.children.add(new Node<Integer>(2));
		
		
		assertEquals(false, node.isLeaf());
	}

}
