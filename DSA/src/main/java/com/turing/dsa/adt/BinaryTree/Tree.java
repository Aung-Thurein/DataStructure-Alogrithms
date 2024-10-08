package com.turing.dsa.adt.BinaryTree;

import java.util.Iterator;

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
	
	public void delete(int value)
	{
		Node current = this.root;
		Node Parent = this.root;
		Boolean isLeftChild = true;
		
		while(current.value != value)
		{	
			Parent = current;
			if(current.value > value)
			{
				current = current.Left;
				isLeftChild = true;
			}
			else
			{
				current = current.Right;
				isLeftChild = false;
			}
				
		}
		
		if(current.isLeaf())
		{
			
			if(isLeftChild)
			{
				Parent.Left = null;
			}
			else 
			{
				Parent.Right = null;
			}
			
		}
		else if(current.isLeftChildOnly())
		{
			System.out.println("Left child only");
			
			if(isLeftChild)
			{
				Parent.Left = current.Left;
			}
			else 
			{
				Parent.Right = current.Left;
			}
		}
		else if(current.isRightChildOnly())
		{
			System.out.println("Right child only");
			
			if(isLeftChild)
			{
				Parent.Left = current.Right;
			}
			else
			{
				Parent.Right = current.Right;
			}
		}
		else if(current.isBothHave())
		{
			System.out.println("Both child");
			
			Node inOrderSuccessor = this.inOrderSuccessor(value);
			int temp = inOrderSuccessor.value;
			this.delete(inOrderSuccessor.value);
		
			current.value = temp;
			
			
		}
			
			
		
	}
	
	public Node inOrderSuccessor(int value)
	{
		InOrderTraversal traversal = new InOrderTraversal(this);
		Iterator<Node> iterator = traversal.iterator();
		Node current = iterator.next();
		Node next;
		while(iterator.hasNext())
		{
			 next = iterator.next();
			if(current.value == value)
			{
				return next;
			}
			current = next;
		}
		
		return null;
	}
}
