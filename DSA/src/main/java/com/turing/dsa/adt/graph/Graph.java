package com.turing.dsa.adt.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	ArrayList<String> vertices = new ArrayList<>();
	ArrayList<String> visited = new ArrayList<>();
	int [][] adjencyMatrix;
	
	public void addVertex(String label)
	{
		this.vertices.add(label);
		
	}
	
	public void createAdjacencyMatrix()
	{
		this.adjencyMatrix = new int[vertices.size()][vertices.size()]; 
	}
	
	public void markedVisted(String vertex)
	{
		this.visited.add(vertex);
	}
	
	public ArrayList<String> getUnvisitedReachableVertices(String from)
	{
		ArrayList<String> result = new ArrayList<>();
		int fromIndex = this.vertices.indexOf(from);
		
		for (int i = 0; i < this.vertices.size(); i++) {
			if(this.adjencyMatrix[fromIndex][i] == 1)
			{
				int toIndex = i;
				String toVertices = this.vertices.get(toIndex);
				if(this.visited.indexOf(toVertices) == -1)
				{
					result.add(toVertices);
				}
			}
		}
		
		return result;
	}
	
	public void addEdge(String from, String to)
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		
		this.adjencyMatrix [fromIndex][toIndex] = 1;
	}
	
	public boolean isPathExist(String from, String to)
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		return this.adjencyMatrix [fromIndex][toIndex] == 1;
		
		
	}
	public ArrayList<String> getVisited()
	{
		return this.visited;
	}
	
	public ArrayList<String> filterVisited(ArrayList<String> vertices)
	{
		ArrayList<String> result = new ArrayList<>();
		
		for(String vertice : vertices)
		{
			if(!this.visited.contains(vertice))
			{
				result.add(vertice);
			}
		}
		
		return result;
	}
	
	public ArrayList<String> depthFirstSearch(String from)
	{
		ArrayList<String> result = new ArrayList<String>();
		if(!this.visited.contains(from))
		{
			result.add(from);
			this.markedVisted(from);
			ArrayList<String> unvisitedVertices = this.getUnvisitedReachableVertices(from);
			for(String unvisited : unvisitedVertices)
			{
				ArrayList<String> res =filterVisited(depthFirstSearch(unvisited));
				
				result.addAll(res);
			}
			
			return result;
		}
		else
		{
			return result;
		}
		
	}
	
	public void dfsIterative(String from)
	{
	//	Queue<String> queue = new ArrayDeque<String>();
		Stack<String> stack = new Stack<>();
		stack.push(from);
		
		while(!stack.isEmpty())
		{
			String element = stack.pop();
			this.markedVisted(element);
			
			ArrayList<String> unvisited = this.getUnvisitedReachableVertices(element);
			
			for(int i = unvisited.size() - 1 ; i>= 0 ; i-- )
			{
				String vertex = unvisited.get(i);
				if(!this.visited.contains(vertex))
				{
					stack.push(vertex);
				}
			}
			
				
		}
	}
	
}
