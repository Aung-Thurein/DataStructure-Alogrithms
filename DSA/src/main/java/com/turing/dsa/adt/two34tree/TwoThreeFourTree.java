package com.turing.dsa.adt.two34tree;

import java.util.ArrayList;
import java.util.Iterator;

public class TwoThreeFourTree<T extends Number> {

	Node<T> root;
	
	public TwoThreeFourTree()
	{
		
	}
	
	public TwoThreeFourTree(Node<T> root)
	{
		this.root = root;
	}
	
	public Node<T> getRoot()
	{
		return root;
	}
	
	public Node<T> insert(T value)
	{
	    if(root == null)
        {
            root = new Node<T>();
            root.insertKey(value);
            return root;
        }
        else
        {
            Node<T> current = this.root;
            while(current != null)
            {
            	if(current.isFourNode())
            	{
            		current = current.split(current);
            	
            		if(current.getParent() == null) //root
            		{
            			this.root = current;
            		}
            	}
                Number[]keys = current.key;
                int keyIndex =0;
                for (int i = 0; i < keys.length; i++) {
                    
                    if(keys[i] ==null)
                    {
                        keyIndex = i-1;
                        break;
                    }
                    else if( keys[i].doubleValue()> value.doubleValue())
                    {
                        keyIndex = i;
                        break;
                    }
                    else if(keys[i] !=null && keys[i].doubleValue()== value.doubleValue())
                    {
                        System.out.println("Found at index "+i + " current "+current);
                        current.insertKey(value);
                        return current;
                    }
                }
               
                if(!current.isLeaf())
                {
                    System.out.println("Here "+value +" KeyIndex "+keyIndex);
                 
                    Number nodeValue= keys[keyIndex];
                   
                    ArrayList<Node<T>> children = current.getChildren();
                   
                    if(nodeValue.doubleValue()>value.doubleValue())
                    {
                        current = children.get(keyIndex);
                        System.out.println("Search deep less than case "+current);
                    }
                    else
                    {
                        current = children.get(keyIndex+1);
                        System.out.println("Search deep greater than case"+current);
                    }
                    
                }
                else
                {
                	current.insertKey(value);
                	return current;
                }
            }
            if(current != null)
            {
            	current.insertKey(value);
            }
            return current;
        }
        
     
    
	}
	
	public T search(Number value)
	{
		if(root == null)
		{
			return null;
		}
		else
		{
			Node<T> current = this.root;
			
			while(current != null)
			{
				Number[] keys = current.key;
				int keyIndex = 1;

				for (int i = 0; i < keys.length; i++) {
					
					if(keys[i] == null)
					{
						keyIndex = i -1;
						break;
					}
					if( keys[i].doubleValue() > value.doubleValue())
					{
						 keyIndex = i;
						break;
					}
					else if(keys[i] != null && keys[i].doubleValue() == value.doubleValue())
					{
						return (T)value;
					}
					
				}
				
				if(!current.isLeaf())
				{
					Number nodeValue = keys[keyIndex];
					ArrayList<Node<T>> children = current.getChildren();
				 
					if(nodeValue.doubleValue() > value.doubleValue())
					{
						current = children.get(keyIndex);
					}
					else
					{
						current = children.get(keyIndex + 1);
					}
					
				}
				else
				{
					current = null;
				}
			}
			
			
		
			
		}
		
		return null;
	}
	
	 public Node<T> searchLeafToInsert(Number value)
	    {
	 
		 if(root == null)
	        {
	            root = new Node<T>();
	            return root;
	        }
	        else
	        {
	            Node<T> current = this.root;
	            while(current != null)
	            {
	                Number[]keys = current.key;
	                int keyIndex =0;
	                for (int i = 0; i < keys.length; i++) {
	                    
	                    if(keys[i] ==null)
	                    {
	                        keyIndex = i-1;
	                        break;
	                    }
	                    else if( keys[i].doubleValue()> value.doubleValue())
	                    {
	                        keyIndex = i;
	                        break;
	                    }
	                    else if(keys[i] !=null && keys[i].doubleValue()== value.doubleValue())
	                    {
	                        System.out.println("Found at index "+i + " current "+current);
	                        return current;
	                    }
	                }
	               
	                if(!current.isLeaf())
	                {
	                    System.out.println("Here "+value +" KeyIndex "+keyIndex);
	                    Number nodeValue= keys[keyIndex];
	                    ArrayList<Node<T>> children = current.getChildren();
	                    if(nodeValue.doubleValue()>value.doubleValue())
	                    {
	                        current = children.get(keyIndex);
	                        System.out.println("Search deep less than case "+current);
	                    }
	                    else
	                    {
	                        current = children.get(keyIndex+1);
	                        System.out.println("Search deep greater than case"+current);
	                    }
	                    
	                }
	                else
	                {
	                   return current;
	                }
	            }
	            return current;
	        }
	        
	     
	    }
}
