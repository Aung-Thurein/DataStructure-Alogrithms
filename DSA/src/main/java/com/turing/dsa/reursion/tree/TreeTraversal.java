package com.turing.dsa.reursion.tree;

import java.util.Stack;

public class TreeTraversal {
	
	void preOrder(TreeNode root) 
	{
		//base case
		if(root.children.size() == 0)
		{
			System.out.println(root.value);
		}else
		{
			System.out.println(root.value);
			for(TreeNode child : root.children)
			{
				preOrder(child);
			}
		}
		
	}
	
	void preOrderIterative(TreeNode root)
	{
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		stack.push(root);
		
		while(! stack.isEmpty())
		{
			TreeNode node = stack.pop();
			System.out.println(node.value);
			
			if(node.children.size() > 0)
			{
				for (int i = node.children.size() - 1; i >= 0; i--) {
					stack.push(node.children.get(i));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TreeNode nodeA = new TreeNode("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		TreeNode nodeD = new TreeNode("D");
		TreeNode nodeE = new TreeNode("E");
		
		nodeA.addChildren(nodeB);
		nodeA.addChildren(nodeC);
	
		nodeC.addChildren(nodeD);
		nodeC.addChildren(nodeE);
		
		TreeTraversal traversal = new TreeTraversal();
		traversal.preOrder(nodeA);
		traversal.preOrderIterative(nodeA);
		
	}
	
}
