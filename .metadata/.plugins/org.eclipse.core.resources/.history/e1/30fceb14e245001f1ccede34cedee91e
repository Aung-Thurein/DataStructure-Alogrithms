package com.turing.dsa.reursion.tree;

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
		
	}
	
}
