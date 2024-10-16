package com.turing.dsa.adt.heap;

import java.util.ArrayList;
import java.util.Arrays;

import com.turing.dsa.adt.BinaryTree.Node;
import com.turing.dsa.array.Array;


public class MaxHeap{
	ArrayList<Node> NodeList = new ArrayList<Node>();
	ArrayList<Integer> items = new ArrayList<Integer>();
	Node root;
	
	public MaxHeap(Integer[] items) {
		this.items = new ArrayList<>(Arrays.asList(items));
		
	}
	
	private Boolean isLeft(int number)
	{
		return number % 2 != 0;
	}
	


	public void buildTree() {
		
		for (int i = 0; i < items.size(); i++) {
			
			Integer value =items.get(i);
			Node node = new Node(value);
			NodeList.add(node);
			
			if(i == 0)
			{
				this.root = node;
			}
			else
			{
				if(isLeft(i))
				{
					int parentIndex = (i - 1) / 2;
					Node parent = NodeList.get(parentIndex);
					parent.setLeft(node);
				//	System.out.println("left value " + parent.getLeft().getValue());
				}
				else
				{
					int parentIndex = (i - 2) / 2;
					Node parent = NodeList.get(parentIndex);
					parent.setRight(node);
				}
			}
			
			
	/*
			if(i == 0)
			{
				this.root = node;
			}
		
			int leftIndex = 2*i + 1;
			if(leftIndex < items.size())
			{
				Integer LeftValue = items.get(leftIndex);
				Node LeftNode = new Node(LeftValue);
				node.setLeft(LeftNode);
			}
			int rightIndex = 2*i + 2;
			if(rightIndex < items.size())
			{
				Integer rightValue = items.get(rightIndex);
				Node rightNode = new Node(rightValue);
				node.setRight(rightNode);
			}
			*/
		}
		
	}
	
	public void insert(int value)
	{
		this.items.add(value);
		this.heapfiy();
		this.buildTree();
	}
	
	public void delete(int value)
	{
		this.items.remove(Integer.valueOf(value));
		this.heapfiy();
		this.buildTree();
	}
	
	public void heapify(int index)
	{
		int largest = index;
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		
		if(left < this.items.size() && this.items.get(index) < this.items.get(left))
		{
			largest = left;
	
		}
		if(right < this.items.size() && this.items.get(largest) < this.items.get(right))
		{
			largest = right;
			
		}
		
		if(largest !=  index)
		{
			//swap
			Integer temp = this.items.get(index);
			this.items.set(index, this.items.get(largest));
			this.items.set(largest, temp);
			this.heapify(largest);
		}
	}
	
	public void heapfiy()
	{
		int n = this.items.size();
		for (int i = n/2 -1; i >= 0; i--) {
			this.heapify(i);
		}
	}
	
	public Node getRoot()
	{
		return root;
	}
	
	public int deqeue()
	{
		int root = this.items.get(0);
		this.delete(root);
		return root;
	}
}
