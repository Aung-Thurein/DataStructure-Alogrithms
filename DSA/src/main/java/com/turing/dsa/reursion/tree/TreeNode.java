package com.turing.dsa.reursion.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	String value;
	List<TreeNode> children = new ArrayList<TreeNode>();

	public TreeNode(String value)
	{
		this.value = value;
	}
	
	public void addChildren(TreeNode child)
	{
		this.children.add(child);
	}
	
	
	
}
