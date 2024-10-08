package com.turing.dsa.adt.BinaryTree;

import java.util.ArrayList;
import java.util.Iterator;

public class InOrderTraversal implements Iterable<Node> {
	private Tree tree;
	public InOrderTraversal(Tree tree)
	{
		this.tree =tree;
	}
	@Override
	public Iterator<Node> iterator() {
		return new TreeIterator();
	}
	
	class TreeIterator implements Iterator<Node>{
	
		Node current;
		int index = 0;
		ArrayList<Node> item;
		
		public TreeIterator()
		{
			current = tree.root;
			this.item = new ArrayList<Node>();
			this.inOrderTraverse(this.current);
		}
		private void inOrderTraverse(Node current) {
			if(current == null)
			{
				return;
			}//lRr
			if(current.Left != null)
			{
				this.inOrderTraverse(current.Left);
			}
			this.item.add(current);
			
			if(current.Right != null)
			{
				this.inOrderTraverse(current.Right);
			}
				
		}
		@Override
		public boolean hasNext() {
			return index < this.item.size();
		}

		@Override
		public Node next() {

			return this.item.get(index ++);
		}
		
	}

}
