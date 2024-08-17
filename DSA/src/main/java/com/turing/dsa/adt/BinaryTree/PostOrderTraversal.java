package com.turing.dsa.adt.BinaryTree;

import java.util.ArrayList;
import java.util.Iterator;

public class PostOrderTraversal implements Iterable<Node> {
	private Tree tree;
	
	public PostOrderTraversal(Tree tree)
	{
		this.tree = tree;
	}
	
	@Override
	public Iterator<Node> iterator() {
		return new PostOrderIterator();
	}
	
	class PostOrderIterator implements Iterator<Node>{

		Node current;
		ArrayList<Node> item;
		int index = 0;
		
		public PostOrderIterator()
		{
			 current = tree.root;
			 this.item = new ArrayList<Node>();
			 this.inOrderTraverse(current);
			 
		}
		
		private void inOrderTraverse(Node current) {
			if(current == null)
			{
				return;
			}
			if(current.Left != null)
			{
				this.inOrderTraverse(current.Left);
			}
			if(current.Right != null)
			{
				this.inOrderTraverse(current.Right);
			}
			this.item.add(current);
			
			
		}

		@Override
		public boolean hasNext() {
			return index < item.size() ;
		}

		@Override
		public Node next() {
			return this.item.get(index++);
		}
		
		
	}

}
