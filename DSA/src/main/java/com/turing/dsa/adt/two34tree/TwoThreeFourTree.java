package com.turing.dsa.adt.two34tree;

public class TwoThreeFourTree<T extends Number> {

	Node<T> root;
	
	void insert(T value)
	{
		if (root == null)
		{
			Node<T> node = new Node<T>(2);
			node.key[0] = value;
			this.root = node;
		}
	}
	
}
