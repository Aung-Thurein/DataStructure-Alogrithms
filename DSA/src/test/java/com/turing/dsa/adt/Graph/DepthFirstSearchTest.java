package com.turing.dsa.adt.Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.turing.dsa.adt.graph.Graph;

public class DepthFirstSearchTest {

	@Test
	public void testBaseCase()
	{
		Graph graph = new Graph();
		
	    //A   -> B
        //B->C
        //C->D    
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		
		graph.createAdjacencyMatrix();
		
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		graph.addEdge("A", "D");
		graph.addEdge("B", "C");
		
		ArrayList<String> vertices = graph.getUnvisitedReachableVertices("A");
		assertEquals(3, vertices.size());
		assertTrue(vertices.contains("B"));
		assertTrue(vertices.contains("C"));
		assertTrue(vertices.contains("D"));
		
		
	}
	
	@Test
	public void testDFSBaseCase()
	{
		Graph graph = new Graph();
		
	    //A   -> B
        //		-> C
		//		->D
        //B  -> C   
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		
		graph.createAdjacencyMatrix();
		
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		graph.addEdge("A", "D");
		graph.addEdge("B", "C");
		
		graph.depthFirstSearch("A");
		ArrayList<String> result = graph.getVisited();
		
		assertEquals(4, result.size());
		assertEquals("A",result.get(0));
		assertEquals("B",result.get(1));
		assertEquals("C",result.get(2));
		assertEquals("D",result.get(3));
		
		
	}
	
	@Test
	public void testDFSComplexCase()
	{
		Graph graph = new Graph();
		
	    //A   -> B
        //	 -> D
		//	B	-> C
      
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		
		graph.createAdjacencyMatrix();
		
		graph.addEdge("A", "B");
		graph.addEdge("A", "D");
		graph.addEdge("B", "C");
		graph.addEdge("D", "E");
		
		graph.depthFirstSearch("A");
		ArrayList<String> result = graph.getVisited();
		
		assertEquals(5, result.size());
		assertEquals("A",result.get(0));
		assertEquals("B",result.get(1));
		assertEquals("C",result.get(2));
		assertEquals("D",result.get(3));
		assertEquals("E",result.get(4));
		
		
	}
	
	@Test
	public void testDfsIterative()
	{
		Graph graph = new Graph();
		
	    //A   -> B
        //B  -> C   
		//C -> D
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		
		graph.createAdjacencyMatrix();
		
		graph.addEdge("A", "B");
		graph.addEdge("B", "C");
		graph.addEdge("C", "D");
		
		
		graph.dfsIterative("A");
		ArrayList<String> result = graph.getVisited();
		
		assertEquals(4, result.size());
		assertEquals("A",result.get(0));
		assertEquals("B",result.get(1));
		assertEquals("C",result.get(2));
		assertEquals("D",result.get(3));
		
		
	}
	
	@Test
	public void testDFSBaseCaseComplexCase()
	{
		Graph graph = new Graph();
		
	    //A   -> B
        //	
		//		->D
        //B  -> C  
		//D -> E
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		
		graph.createAdjacencyMatrix();
		
		graph.addEdge("A", "B");
		graph.addEdge("A", "D");
		graph.addEdge("B", "C");
		graph.addEdge("D", "E");
		
		graph.dfsIterative("A");
		ArrayList<String> result = graph.getVisited();
		
		assertEquals(5, result.size());
		assertEquals("A",result.get(0));
		assertEquals("B",result.get(1));
		assertEquals("C",result.get(2));
		assertEquals("D",result.get(3));
		
		
	}

}
