package com.turing.dsa.adt.two34tree;

public class TwoThreeFourTree<T extends Number> {

	Node<T> root;
	
	public Node<T> getRoot()
	{
		return root;
	}
	void insert(T value)
	{
		if (root == null)
		{
			Node<T> node = new Node<T>();
			node.insertKey(value);
			this.root = node;
		}
		else
		{
			Node current = this.root;
			
			if(current.isLeaf() && !current.isFourNode())
			{
				current.insertKey(value);
			}
		}
	}
	
}
