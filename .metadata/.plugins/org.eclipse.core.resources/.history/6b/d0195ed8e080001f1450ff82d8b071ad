package com.turing.dsa.adt.two34tree;

import java.util.ArrayList;

public class Node<T extends Number> {
	
	Node<T> parent;
	public Number[] key;
	public ArrayList<Node<T>> children;
	
	static int ORDER = 4;
	int noOfNode;
	
	public Node(int noOfNode)
	{
		this.noOfNode = noOfNode;
		this.key =(T[]) new Number[ORDER - 1];
		this.children = new ArrayList<>();
	}
	
	public void insertKey(T value)
	{
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
		
		
		
	}
	
	public int getN_Node()
	{
		return this.noOfNode;
	}
	
	public boolean isFourNode()
	{
		return getN_Node() == 4;	
	}
	
	public boolean isLeaf()
	{
		return this.children.size() == 0;
	}
}

