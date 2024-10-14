package com.turing.dsa.adt.two34tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TestNode {

	@Test
	public void test_twoNode()
	{
		Node<Integer> node = new Node<Integer>();

		node.insertKey(10);
		node.insertKey(10);
		
		assertEquals(3, node.getN_Node());
	}
	
	@Test
	public void test_threeNode()
	{
		Node<Integer> node = new Node<Integer>();
	

		node.insertKey(10);
		node.insertKey(10);
		node.insertKey(10);
		
		assertEquals(4, node.getN_Node());
	}
	
	@Test
	public void test_fourNode()
	{
		Node<Integer> node = new Node<Integer>();
		

		node.insertKey(10);
		node.insertKey(10);
		node.insertKey(10);
		node.insertKey(10);
		
		assertEquals(5, node.getN_Node());
	}
	
	@Test
	public void test_leaf()
	{
		Node<Integer> node = new Node<Integer>();
		
		assertEquals(true, node.isLeaf());
	}
	
	@Test
	public void test_NonLeaf()
	{
		Node<Integer> node = new Node<Integer>();
		node.children.add(new Node<Integer>());
		node.children.add(new Node<Integer>());
		
		
		assertEquals(false, node.isLeaf());
	}
	@Test
	public void insertKey()
	{
		Node<Integer> node = new Node<Integer>();
		node.key[0] = 5;
		node.insertKey(10);
		
		assertEquals(5, node.key[0]);
		assertEquals(10, node.key[1]);
		
	}
	
	@Test
	public void insertKey1()
	{
		Node<Integer> node = new Node<Integer>();
		node.key[0] = 55;
		node.insertKey(2);
		
		assertEquals(2, node.key[0]);
		assertEquals(55, node.key[1]);
		
	}
	
	@Test
	public void insertKey3()
	{
		Node<Integer> node = createFourNode();
		
		assertEquals(150, node.key[0]);
		assertEquals(200, node.key[1]);
		assertEquals(300, node.key[2]);
		
	}
	
	public Node<Integer> createFourNode()
	{
		Node<Integer>node = new Node<Integer>();
		node.insertKey(150);
		node.insertKey(200);
		node.insertKey(300);

		return node;
	}
	
	public Node<Integer> createParentWithTwoChild()
	{
		Node<Integer> fourNode = this.createFourNode();
		Node<Integer> parent = fourNode.split(fourNode);
		
		return parent;
	}
	
	@Test
	public void testNoParentSplit()
	{
		Node<Integer> parent = this.createParentWithTwoChild();
		assertEquals(2, parent.getN_Node());
		assertEquals(false, parent.isLeaf());
		
		ArrayList<Node<Integer>> children = parent.getChildren();
		Node<Integer> childOne = children.get(0);
		Node<Integer> childTwo = children.get(1);
		
		assertEquals(200, parent.key[0]);

		assertEquals(150, childOne.key[0]);
		assertEquals(300, childTwo.key[0]);
	}
	
	@Test
	public void testWithTwoNodeParent()
	{
		Node<Integer> parent = this.createParentWithTwoChild();
		
		ArrayList<Node<Integer>> children = parent.getChildren();
		Node<Integer> childOne = children.get(0);
		Node<Integer> childTwo = children.get(1);
		
		childTwo.insertKey(301);
		childTwo.insertKey(302);
		
		Node<Integer> resultParent = childTwo.split(childTwo);
		
		ArrayList<Node<Integer>> children2 = resultParent.getChildren();
		
		assertEquals(200, resultParent.key[0]);
		assertEquals(301, resultParent.key[1]);
		
		assertEquals(3, children2.size());
		
		Node<Integer> c1 = children2.get(0);
		Node<Integer> c2 = children2.get(1);
		Node<Integer> c3 = children2.get(2);
		
		assertEquals(150,c1.key[0]);
		assertEquals(300,c2.key[0]);
		assertEquals(302,c3.key[0]);

		
	}
	
	@Test
	public void testWithTwoNodeParent2()
	{
		Node<Integer> parent = this.createParentWithTwoChild();
		
		ArrayList<Node<Integer>> children = parent.getChildren();
		Node<Integer> childOne = children.get(0);
		Node<Integer> childTwo = children.get(1);
		//childOne[150,180,190]
		childOne.insertKey(180);
		childOne.insertKey(190);
		
		Node<Integer> resultParent = childOne.split(childOne);
		
		ArrayList<Node<Integer>> children2 = resultParent.getChildren();
		
		assertEquals(180, resultParent.key[0]);
		assertEquals(200, resultParent.key[1]);
		
		assertEquals(3, children2.size());
		
		Node<Integer> c1 = children2.get(0);
		Node<Integer> c2 = children2.get(1);
		Node<Integer> c3 = children2.get(2);
		
		assertEquals(150,c1.key[0]);
		assertEquals(190,c2.key[0]);
		assertEquals(300,c3.key[0]);

		
	}
	
	@Test
	public void testWithTwoNodeParent3()
	{
		Node<Integer> parent = this.createParentWithTwoChild();
		
		ArrayList<Node<Integer>> children = parent.getChildren();
		Node<Integer> childOne = children.get(0);
		Node<Integer> childTwo = children.get(1);
		//childOne[150,180,190]
		childOne.insertKey(180);
		childOne.insertKey(190);
		
		Node<Integer> resultParent = childOne.split(childOne);
		
		ArrayList<Node<Integer>> children2 = resultParent.getChildren();
		
		
		Node<Integer> c1 = children2.get(0);
		Node<Integer> c2 = children2.get(1);
		Node<Integer> c3 = children2.get(2);
		
		//c2[190,191,192]
		c2.insertKey(191);
		c2.insertKey(192);
		
		Node<Integer> parent3 = c2.split(c2);
		
		assertEquals(180, resultParent.key[0]);
		assertEquals(191, resultParent.key[1]);
		assertEquals(200, resultParent.key[2]);
		assertEquals(3, parent.key.length);
		assertEquals(4, parent3.getChildren().size());
		
		ArrayList<Node<Integer>> children3 = parent3.getChildren();
		
		assertEquals(150, children.get(0).key[0]);
		assertEquals(190, children.get(1).key[0]);
		assertEquals(192, children.get(2).key[0]);
		assertEquals(300, children.get(3).key[0]);
		
		

	}
	
	@Test
	public void testSplitWithOneLevel()
	{
Node<Integer> parent = this.createParentWithTwoChild();
		
		ArrayList<Node<Integer>> children = parent.getChildren();
		Node<Integer> childOne = children.get(0);
		Node<Integer> childTwo = children.get(1);
		
		childTwo.insertKey(301);
		childTwo.insertKey(302);
		
		Node<Integer> resultParent = childTwo.split(childTwo);
		
		ArrayList<Node<Integer>> children2 = resultParent.getChildren();
		
//	
		assertEquals(3, children2.size());
		
		Node<Integer> c1 = children2.get(0);
		Node<Integer> c2 = children2.get(1);
		Node<Integer> c3 = children2.get(2);
		
	
		c3.insertKey(303);
		c3.insertKey(304);
		
		Node<Integer> root = c3.split(c3);
		
		assertEquals(200, root.key[0]);
		assertEquals(301, root.key[1]);
		assertEquals(303, root.key[2]);
		assertEquals(4, root.getN_Node());
		
		ArrayList<Node<Integer>> level1Child = root.getChildren();
		Node<Integer> l1c1 = level1Child.get(0);
		Node<Integer> l1c2 = level1Child.get(1);
		Node<Integer> l1c3 = level1Child.get(2);
		Node<Integer> l1c4 = level1Child.get(3);
		
		assertEquals(150, l1c1.key[0]);
		assertEquals(300, l1c2.key[0]);
		assertEquals(302, l1c3.key[0]);
		assertEquals(304, l1c4.key[0]);
		
		/*
		  	[200,301]
		 [150] [300] [302]
		 
		  	[200,301][303]
		 [150] [300][302] [304,305,306]
		 */
		
	//--->	//TWO LEVEL
		
		
		l1c4.insertKey(305);
		l1c4.insertKey(306);

		
		Node<Integer> finalRoot = l1c4.split(l1c4);
		
		ArrayList<Node<Integer>> finalRootLevelChildren = finalRoot.getChildren();
		Node<Integer> fl1Cl = finalRootLevelChildren.get(0);
		Node<Integer> fl1C2 = finalRootLevelChildren.get(1);
		
		
		assertEquals(200, fl1Cl.key[0]);
		assertEquals(303, fl1C2.key[0]);
		
		
		ArrayList<Node<Integer>> level3ChildRightMost = fl1C2.getChildren();
		Node<Integer> rightMostNode = level3ChildRightMost.get(1);
		
		assertEquals(304, rightMostNode.key[0]);
		assertEquals(305, rightMostNode.key[1]);
		assertEquals(306, rightMostNode.key[2]);
		
	}

}
