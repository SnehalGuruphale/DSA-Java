package com.snehal;

public class Stack_ll {

	private Node top;
	private static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public Stack_ll()
	{
		this.top=null;
	}
	public boolean isEmpty()
	{
		return top==null;
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty!");
			return -1;
		}
		return top.data;
	}
	public void push(int data)
	{
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty!");
			return -1;
		}
		int d=top.data;
		top=top.next;
		return d;
	}
	public void display()
	{
		Node current=top;
		System.out.print("Stack ndoes: ");
		while(current!=null)
		{
			System.out.println("current.data"+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
        Stack_ll stk=new Stack_ll();
        stk.push(20);
        stk.push(30);
        System.out.println("top element: "+stk.peek());
        stk.display();
        System.out.println("popped element: "+stk.pop());

	}

}
