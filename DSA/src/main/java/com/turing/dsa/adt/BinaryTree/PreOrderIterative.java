package com.turing.dsa.adt.BinaryTree;

import java.util.Stack;

public class PreOrderIterative {
	
	private Tree tree;
	public PreOrderIterative(Tree tree)
	{
		this.tree = tree;
	}
	//Root ,Left, Right 
	void traverse()
	{
		Node current = this.tree.root;
		
		if(current == null)
		{
			return;
		}
		else
		{
			Stack<Node> stack = new Stack<>();
			while(stack.empty() == false || current != null)
			{
				if(current != null)
				{
					System.out.println("Node" + current.getValue());
					stack.push(current);
					current = current.Left;
				}
				else
				{
					Node node = stack.pop();
					current = node.Right;	
				}
			}
 		}
	}
	
	public static void main(String[] args) {
	
	}
}
