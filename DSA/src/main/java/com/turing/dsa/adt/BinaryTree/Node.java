package com.turing.dsa.adt.BinaryTree;

public class Node {
	int value;
	Node Left;
	Node Right;

	public Node(int value)
	{
		this.value = value;
	}

	public Node getLeft() {
		return Left;
	}

	public void setLeft(Node left) {
		Left = left;
	}

	public Node getRight() {
		return Right;
	}

	public void setRight(Node right) {
		Right = right;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isLeaf()
	{
		return Left == null && Right == null;
	}
	
	public boolean isLeftChildOnly()
	{
		return Left != null && Right == null;
		
	}
	
	public boolean isRightChildOnly()
	{
		return Left == null && Right != null;
		
	}
	
	public boolean isBothHave()
	{
		return Left != null && Right != null;
		
	}
}
