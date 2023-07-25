package com.graphs.snehal;

public class AdjacencyMatrix {

	private int[][] adjacentMatrix;
	private int numVertices;
	public AdjacencyMatrix(int[][] adjancentMatrix,int numVertices)
	{
		this.adjacentMatrix=new int[numVertices][numVertices];
		this.numVertices=numVertices;
	}
	public void addEdge(int src,int dest)
	{
		adjacentMatrix[src][dest]=1;
		adjacentMatrix[dest][src]=1;
	}
	public static void main(String[] args) {
        
	}

}
