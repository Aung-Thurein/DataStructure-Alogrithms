package com.turing.dsa.adt.two34tree;

import java.util.ArrayList;

public class Node<T extends Number> {
	
	Node<T> parent;
	public Number[] key;
	public ArrayList<Node<T>> children;
	
	static int ORDER = 4;
	
	int noOfNode = 1;
	
	public Node()
	{
		this.noOfNode = noOfNode;
		this.key =(T[]) new Number[ORDER - 1];
		this.children = new ArrayList<>();
	}
	
	Node<T> getParent()
	{
		return this.parent;
	}
	
	public void setParent(Node<T> parent)
	{
		this.parent = parent;
	}
	
	public ArrayList<Node<T>> getChildren()
	{
		return this.children;
	}
	
	public int insertKey(T value)
	{
		this.noOfNode ++;
		int posToInsert = 0;
	
		for (int i = 0; i < this.key.length; i++) {
			if(key[i] == null || key[i].doubleValue() > value.doubleValue())
			{
				posToInsert = i;
				break;
			}
		}
		
		for (int i = key.length - 1; i > posToInsert; i--) {
			
			key[i] = key[i-1];
		}
		key[posToInsert] = value;
	
		return posToInsert;
		
	}
	
	public Node<T> split(Node<T> node)
	{
		if(!node.isFourNode())
		{
			return node;
		}
		else
			{
				if(node.getParent() == null)
				{
					//Split 4node --> (3key)
					//no parent
					return this.SplitWhenNoParent(node);
				}
				else
				{
					return splitNodeWithParent(node);
				}
			}
			
		}

	public Node<T> splitNodeWithParent(Node<T> node) {
		
		if(parent.isFourNode())
		{
			while(parent.isFourNode())
			{
				 parent = parent.split(parent);
				
			}
			
			return parent;
			
		}
		else
		{
			
			Node<T> parent = node.getParent();
			Number middle = node.key[1];
			int parentInsertPos = parent.insertKey((T)middle);
			parent.children.remove(parentInsertPos);
			
			Node<T> childOne = new Node<T>();
			childOne.insertKey((T)node.key[0]);
			childOne.setParent(parent);

			Node<T> childTwo = new Node<T>();
			childTwo.insertKey((T)node.key[2]);
			childTwo.setParent(parent);
			
			parent.getChildren().add(parentInsertPos,childTwo);
			parent.getChildren().add(parentInsertPos,childOne);

			if(!node.isLeaf())
			{
				splitChild(node, childOne, childTwo);
			}
			
			return parent;
		
		}
	
	}
		
		
	
	Node<T> SplitWhenNoParent(Node<T> node)
	{
		
			T middle = (T) node.key[1];
			Node<T> parent = new Node<T>();
			parent.insertKey(middle);
			
			Node<T> childOne = new Node<T>();
			childOne.insertKey((T)node.key[0]);
			childOne.setParent(parent);
		
			Node<T> childTwo = new Node<T>();
			childTwo.insertKey((T)node.key[2]);
			childTwo.setParent(parent);
			
			parent.children.add(childOne);
			parent.children.add(childTwo);
		 
			if(!node.isLeaf())
			{
				splitChild(node, childOne, childTwo);
			}
			
			node = null;		
			return parent; 
		
		
		
	}

	public void splitChild(Node<T> node, Node<T> childOne, Node<T> childTwo) {
		ArrayList<Node<T>> children = node.getChildren();
		childOne.children.add(children.get(0));
		childOne.children.add(children.get(1));
		
		childTwo.children.add(children.get(2));
		childTwo.children.add(children.get(3));
		
		node = null;
	}
	public int getN_Node()
	{
		return this.noOfNode;
	}
	
	public boolean isFourNode()
	{
		return getN_Node() == 4;	
	}
	public boolean isThreeNode()
	{
		return getN_Node() == 3;	
	}
	
	public boolean isLeaf()
	{
		return this.children.size() == 0;
	}
}

