package com.turing.dsa.adt.BinaryTree;

public class Tree {
	Node root;
	
	public Tree(Node root)
	{
		this.root = root;
	}
	public Tree()
	{
		
	}
	
	public void insert(int value)
	{
		Node newNode = new Node(value);
		this.insert(newNode);
	}

	public void insert(Node newNode) {
		
		if(root == null)
		{
			root = newNode;
		}
		else 
		{
			Node current = root;
			Node parent;
			
			while(true)
			{
				parent = current;
				if(newNode.value < current.value)
				{
					current = current.Left;
					if(current == null)
					{
						parent.Left = newNode;
						return;
					}
				}
				else 
				{
					current = current.Right;
					if(current == null)
					{
						parent.Right = newNode;
						return;
					}
				}
				
			}
			
		}
	}
	
	public Node search(int value)
	{	
		Node current = root;
		
		while(current != null)
		{
			if(current.getValue() == value)
			{
				return current;
			}
			if(current.getValue() > value)
			{
				current = current.Left;
			}
			if(current.getValue() < value)
			{
				current = current.Right;
			}
		}
		
		return null;
		
	}
}
