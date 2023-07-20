package com.snehal;

import java.util.Scanner;

public class AlmostCompleteBinaryTree {

	private int[] treeArray;
	private int size;
	private int capacity;
	public AlmostCompleteBinaryTree(int capacity)
	{
		this.treeArray=new int[capacity];
		this.size=0;
		this.capacity=capacity;
	}
	public boolean isFull()
	{
		return size==capacity;
	}
	public void insert(int data)
	{
		if(isFull())
		{
			System.out.println("Tree is full.cannot insert more elements");
			return;
		}
		treeArray[size]=data;
		size++;
	}
	public void printLevelOrder()
	{
		System.out.println("level order printing: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(" "+treeArray[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
        System.out.println("please enter the capacity: ");
        Scanner sc=new Scanner(System.in);
        int capacity=sc.nextInt();
        AlmostCompleteBinaryTree actb=new AlmostCompleteBinaryTree(capacity);
        System.out.println("enter "+capacity+" elements for the tree...");
        for(int i=0;i<capacity;i++)
        {
        	int value=sc.nextInt();
        	actb.insert(value);
        }
        actb.printLevelOrder();
        sc.close();
	}

}
