package com.turing.dsa.adt.graph;

import java.util.ArrayList;

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
	
	public ArrayList<String> depthFirstSearch(String from)
	{
		ArrayList<String> result = new ArrayList<String>();
		result.add(from);
		this.markedVisted(from);
		result.addAll(this.getUnvisitedReachableVertices(from));
		return result;
	}
	
}
