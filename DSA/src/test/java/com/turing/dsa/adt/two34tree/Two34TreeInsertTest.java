package com.turing.dsa.adt.two34tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Two34TreeInsertTest {

	@Test
	public void insertKey()
	{
		Node<Integer> node = new Node<Integer>(2);
		node.key[0] = 5;
		node.insertKey(10);
		
		assertEquals(5, node.key[0]);
		assertEquals(10, node.key[1]);
		
	}
	
	@Test
	public void insertKey1()
	{
		Node<Integer> node = new Node<Integer>(2);
		node.key[0] = 55;
		node.insertKey(2);
		
		assertEquals(2, node.key[0]);
		assertEquals(55, node.key[1]);
		
	}
	
	@Test
	public void insertKey3()
	{
		Node<Integer> node = new Node<Integer>(2);
		node.key[0] = 5;
		node.insertKey(108);
		node.insertKey(43);

		
		assertEquals(5, node.key[0]);
		assertEquals(43, node.key[1]);
		assertEquals(108, node.key[2]);
		
	}
}
