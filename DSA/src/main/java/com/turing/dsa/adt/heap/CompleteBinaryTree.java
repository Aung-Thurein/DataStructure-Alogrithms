package com.turing.dsa.adt.heap;

import java.util.ArrayList;
import java.util.Arrays;

import com.turing.dsa.adt.BinaryTree.Node;
import com.turing.dsa.array.Array;


public class CompleteBinaryTree{
	ArrayList<Node> NodeList = new ArrayList<Node>();
	ArrayList<Integer> items = new ArrayList<Integer>();
	Node root;
	
	public CompleteBinaryTree(Integer[] items) {
		this.items = new ArrayList<>(Arrays.asList(items));
		this.buildTree();
	}
	
	private Boolean isLeft(int number)
	{
		return number % 2 != 0;
	}
	


	private void buildTree() {
		
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
	
	public Node getRoot()
	{
		return root;
	}
}
