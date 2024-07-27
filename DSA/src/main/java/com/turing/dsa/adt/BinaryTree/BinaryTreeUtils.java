package com.turing.dsa.adt.BinaryTree;

import java.util.Iterator;

public class BinaryTreeUtils {
	
	
	public static boolean isBinaryTree(Tree tree)
	{
		InOrderTraversal traversal = new InOrderTraversal(tree);
		Iterator<Node> iterator = traversal.iterator();
		
		Node previous = iterator.next();
		
		while(iterator.hasNext())
		{
			Node next = iterator.next();
			if(previous.getValue() > next.getValue())
			{
				return false;
			}
			System.out.println("Value" + next.getValue());
		}
		return true;
		
	}
}
