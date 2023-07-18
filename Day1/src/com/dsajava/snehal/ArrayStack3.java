package com.dsajava.snehal;

import java.util.Scanner;

public class ArrayStack3 {

	private int maxSize;
	private int[] stackArray;
	private int top;
	ArrayStack3(int size)
	{
		maxSize=size;
		stackArray=new int[maxSize];
		top=-1;
	}
	//is full
	public boolean isFull()
	{
		return (top==maxSize-1);
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public void push(int a)
	{
		if(isFull())
		{
			System.out.println("sorry...cant insert as stack is full");
			return;
		}
		top++;
	}
	//method for extraction in stack
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("sorry stack in empty");
			return -1;
		}
		int removedElement=stackArray[top];
		top--;
		return removedElement;
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty..no elements found...");
			return -1;
		}
		return stackArray[top];
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size: ");
		int arrSize=sc.nextInt();
		ArrayStack3 a=new ArrayStack3(arrSize);
		for(int i=0;i<arrSize;i++)
		{
			System.out.println("enter element: ");
			int element=sc.nextInt();
			a.push(element);
			System.out.println("element is pushes at index "+a.stackArray[i]);
	    }
	}
}
